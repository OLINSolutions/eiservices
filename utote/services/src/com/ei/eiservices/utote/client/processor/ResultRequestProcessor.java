
/**
 * ResultServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.processor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.UtoteRequestResponseLogger;
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub;
import com.ei.eiservices.utote.client.resultservice.Result_GetResult_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.resultservice.Result_GetResult_ValidationFaultFault_FaultMessage;
import com.ei.eiservices.utote.model.UtoteFinisher;
import com.ei.eiservices.utote.model.UtotePoolPrice;
import com.ei.eiservices.utote.model.UtotePosition;
import com.ei.eiservices.utote.model.UtotePrice;
import com.ei.eiservices.utote.model.UtoteRace;
import com.ei.eiservices.utote.model.UtoteResult;

public class ResultRequestProcessor {

    private static final Logger log4j = LogManager.getLogger(ResultRequestProcessor.class);

    public static final String POOL_WIN_ID          = "WIN";    // First Place
    public static final String POOL_PLACE_ID        = "PLC";    // Second Place
    public static final String POOL_SHOW_ID         = "SHW";    // Third Place
    public static final String POOL_EXACTA_ID       = "E/P";    // First and Second Place in order
    public static final String POOL_TRIFECTA_ID     = "TRI";    // FirsT, Second and Third Place in order
    public static final String POOL_DOUBLE_ID       = "DD";     // First and Second Place in any order
    public static final String POOL_SUPERFECTA_ID   = "SPR";    // First, Second, Third, and Fourth Place in order
    public static final String POOL_PICK_THREE_ID   = "PK3";    // First, Second, Third, and Fourth Place in order

    public static final BigDecimal RTW_WAGER = new BigDecimal(2);

    private static ResultServiceStub.Source getSource() {
        ResultServiceStub.Source source = new ResultServiceStub.Source();
        source.setSystemId(Configurator.getSystemId());
        source.setSourceId(Configurator.getSourceId());
        return source;
    }

    private static void calculateRTWWinnings(UtoteFinisher f) {
        String method = "calculateRTWWinnings";
        log4j.entry(method);

        // Get parent position and results object
        UtotePosition p = f.getPosition();
        UtoteResult r = p.getResult();

        // Find the pools that are related to this finisher
        log4j.debug("{} - eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}", method, r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId());
        r.getPoolPrices().stream()
        .filter(pp -> pp.hasPrices())
        .forEach(pp -> {

            // Find the price pools that are related to this finisher
            log4j.debug("{} - eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, pp.getPoolName={}", method, r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), pp.getPoolName());
            pp.getPrices().stream()
            .filter( prc -> prc.containsFinisher(f.getRunnerId()) )
            .forEach(prc -> {

                // Calculate the winnings based on an RTW-based standard wager
                BigDecimal wager = prc.getWager().multiply(RTW_WAGER.divide(prc.getWager()));
                BigDecimal amount = prc.getPriceAmount().multiply(RTW_WAGER.divide(prc.getWager()));
                log4j.debug("{} - eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, pp.getPoolId={}, prc.getWager={}, wager={}, prc.getPriceAmount{}, amount={}, prc={}", method, r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), pp.getPoolId(), prc.getWager(), wager, prc.getPriceAmount(), amount, prc.toString());

                // Capture the prices that are related to this finisher
                switch (pp.getPoolId()) {
                case POOL_WIN_ID :
                    log4j.debug("{} - Adding winnings from pool={} for eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, pp.getPoolId={}", method, pp.getPoolName(), r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), pp.getPoolId());
                    f.addToRtwWinAmount(amount);
                    break;
                case POOL_PLACE_ID :
                    log4j.debug("{} - Adding winnings from pool={} for eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, pp.getPoolId={}", method, pp.getPoolName(), r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), pp.getPoolId());
                    f.addToRtwPlaceAmount(amount);
                    break;
                case POOL_SHOW_ID :
                    log4j.debug("{} - Adding winnings from pool={} for eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, pp.getPoolId={}", method, pp.getPoolName(), r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), pp.getPoolId());
                    f.addToRtwShowAmount(amount);
                    break;
                }
            });
        });
        log4j.debug("{} - eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, win={}, place={}, show={}", method, r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), f.getRtwWinAmount(), f.getRtwPlaceAmount(), f.getRtwShowAmount());
        log4j.exit(method);
    }

    private static UtoteFinisher findFinisher(Collection<UtoteFinisher> finishers, int runnerId) {
        return finishers.stream().filter(uFinisher -> (uFinisher.getRunnerId() == runnerId)).findFirst().orElse(null);
    }

    private static Collection<UtoteFinisher> cloneFinishers(UtotePosition parent, ResultServiceStub.Finishers finishers, boolean newParent) {
        String method = "cloneFinishers";
        log4j.entry(method + " - idParent(Position), positionId", parent.getIdUtotePosition(), parent.getPositionId());
        Collection<UtoteFinisher> uFinishers = null;

        // See if any prices were passed in
        if (finishers.isFinisherSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Get the current Runners entity collection, if exists
            uFinishers = (newParent || (null == parent.getFinishers()))?new ArrayList<UtoteFinisher>():parent.getFinishers();

            // Iterate over the prices
            for (ResultServiceStub.Finisher finisher : finishers.getFinisher()) {

                boolean newEntity = false;
                // Open transaction
                em.getTransaction().begin();

                // If this is new, create the container
                UtoteFinisher uFinisher = newParent?null:findFinisher(uFinishers, finisher.getRunnerId());
                if (null == uFinisher) {
                    uFinisher = new UtoteFinisher();
                    uFinisher.setIdParent(parent.getIdUtotePosition());
                    newEntity = true;
                } else {
                    log4j.debug("{} - Found Finisher for input runnerId={}, idUtoteFinisher={}", method, uFinisher.getRunnerId(), uFinisher.getIdUtoteFinisher());
                }

                // Set the values that have been specified
                log4j.debug("{} - Cloning fields for input runnerId={}", method, uFinisher.getRunnerId());
                uFinisher.updateFromTote(finisher);

                // Persist first before updating or adding any associations
                if (newEntity) {
                    em.persist(uFinisher);
                } else {
                    UtoteFinisher mergedEntry = em.merge(uFinisher);
                    uFinishers.remove(uFinisher);
                    uFinisher = mergedEntry;
                }

                // Commit the transaction
                try {
                    em.getTransaction().commit();
                    log4j.debug("{} - Finisher Entity comitted for idUtoteFinisher={}, runnerId={}", method, uFinisher.getIdUtoteFinisher(), uFinisher.getRunnerId());
                } catch (Exception e) {
                    log4j.error("{} - Could not persist Finisher for runnerId={}, exceptionMsg={}, exception={}", method, uFinisher.getRunnerId(), e.getMessage(), e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Refresh the finisher and display it's contents
                em.refresh(uFinisher);
                log4j.debug("{} - Persisted finisher={}", method, uFinisher.toString());

                // Calculate winnings (win/place/show) values for RTW usage
                uFinisher.setPosition(parent);
                calculateRTWWinnings(uFinisher);

                // Save the entry to return
                uFinishers.add(uFinisher);
            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        log4j.exit(method + " - uFinishers.size = " + uFinishers.size());
        return uFinishers;
    }

    private static UtotePosition findPosition(Collection<UtotePosition> positions, int positionId) {
        return positions.stream().filter(uPosition -> (uPosition.getPositionId() == positionId)).findFirst().orElse(null);
    }

    private static Collection<UtotePosition> clonePositions(UtoteResult parent, boolean newParent, ResultServiceStub.Positions positions) {
        String method = "clonePosition";
        log4j.entry(method + " - for EventId, RaceId", parent.getEventId(), parent.getRaceId());

        // Get the current Position entity collection, if exists
        Collection<UtotePosition> uPositions = (newParent || (null == parent.getPositions()))?new ArrayList<UtotePosition>():parent.getPositions();

        // See if any pools were passed in
        if (positions.isPositionSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Iterate over the pools
            for (ResultServiceStub.Position position : positions.getPosition()) {

                boolean newEntity = false;
                // Open transaction
                em.getTransaction().begin();

                // If this is new, create the container
                UtotePosition uPosition = newParent?null:findPosition(uPositions, position.getPositionId());
                if (null == uPosition) {
                    uPosition = new UtotePosition();
                    uPosition.setIdParent(parent.getIdUtoteResult());
                    uPosition.setPositionId(position.getPositionId());
                    newEntity = true;
                }

                // Persist the element
                if (newEntity) {
                    em.persist(uPosition);
                } else {
                    UtotePosition mergedPosition = em.merge(uPosition);
                    uPositions.remove(uPosition);
                    uPosition = mergedPosition;
                }

                // Commit the transaction
                try {
                    em.getTransaction().commit();
                } catch (Exception e) {
                    log4j.error(method + " - Could not persist Position for idUtoteResult="+parent.getIdUtoteResult()+", eventId="+parent.getEventId()+", raceId=" + parent.getRaceId() + ", Exception = " + e.getMessage(),e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                if (!newEntity) {
                    TypedQuery<UtoteFinisher> q = em.createNamedQuery("UtoteFinisher.findByParent", UtoteFinisher.class);
                    q.setParameter("idParent", uPosition.getIdUtotePosition());
                    Collection<UtoteFinisher> finisherList = q.getResultList();
                    if ((null != finisherList) && (finisherList.size() > 0)) {
                        uPosition.setFinishers(finisherList);
                    } else {
                        log4j.warn("{} - Did not find any existing entries for an existing Finishers for Position with positionId={}", method, uPosition.getPositionId());
                    }
                }
                uPosition.setResult(parent);
                Collection<UtoteFinisher> finisherList = cloneFinishers(uPosition, position.getFinishers(), newParent);
                uPosition.setFinishers(finisherList);

                // Put it into the holding array
                uPositions.add(uPosition);

            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        log4j.debug("{} - finished.  uPositions.size() = {}", method, uPositions.size());
        return uPositions;
    }

    private static UtotePrice findPrice(Collection<UtotePrice> prices, String finish) {
        return prices.stream().filter(uPrice -> (uPrice.getFinish().equalsIgnoreCase(finish))).findFirst().orElse(null);
    }

    private static Collection<UtotePrice> clonePrices(UtotePoolPrice parent, ResultServiceStub.Prices prices, boolean newParent) {
        String method = "clonePrices";
        log4j.entry(method + " - idParent(PoolPrice), poolId, poolName", parent.getIdUtotePoolPrice(), parent.getPoolId(), parent.getPoolName());
        Collection<UtotePrice> uPrices = null;

        // See if any prices were passed in
        if (prices.isPriceSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Get the current Runners entity collection, if exists
            uPrices = (newParent || (null == parent.getPrices()))?new ArrayList<UtotePrice>():parent.getPrices();

            // Iterate over the prices
            for (ResultServiceStub.PriceEntity price : prices.getPrice()) {

                boolean newEntity = false;
                // Open transaction
                em.getTransaction().begin();

                // If this is new, create the container
                UtotePrice uPrice = newParent?null:findPrice(uPrices, price.getFinish());
                if (null == uPrice) {
                    uPrice = new UtotePrice();
                    uPrice.setIdParent(parent.getIdUtotePoolPrice());
                    newEntity = true;
                } else {
                    log4j.trace("{} - Found Price for input finish={}, idUtotePrice={}", method, uPrice.getFinish(), uPrice.getIdUtotePrice());
                }

                log4j.trace("{} - Cloning fields for input finish={}", method, uPrice.getFinish());

                // Set the values that have been specified
                uPrice.updateFromTote(price);

                // Persist first before updating or adding any associations
                if (newEntity) {
                    em.persist(uPrice);
                } else {
                    UtotePrice mergedEntry = em.merge(uPrice);
                    uPrices.remove(uPrice);
                    uPrice = mergedEntry;
                }

                // Commit the transaction
                try {
                    em.getTransaction().commit();
                } catch (Exception e) {
                    log4j.error("{} - Could not persist Price for finish={}, PoolId={}, exceptionMsg={}, exception={}", method, uPrice.getFinish(), parent.getPoolId(), e.getMessage(), e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Save the entry to return
                uPrice.setPoolPrice(parent);
                uPrices.add(uPrice);
            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        log4j.exit(method + " - uPrices.size = " + uPrices.size());
        return uPrices;
    }

    private static UtotePoolPrice findPoolPrice(Collection<UtotePoolPrice> poolPrices, String poolId, String poolName) {
        return poolPrices.stream().filter(uPoolPrice -> (uPoolPrice.getPoolId().equals(poolId) && uPoolPrice.getPoolName().equals(poolName))).findFirst().orElse(null);
    }

    private static Collection<UtotePoolPrice> clonePoolPrice(UtoteResult parent, boolean newParent, ResultServiceStub.PoolPrices poolPrices) {
        String method = "clonePoolPrice";
        log4j.entry(method + " - for EventId, RaceId", parent.getEventId(), parent.getRaceId());

        // Get the current Pool entity collection, if exists
        Collection<UtotePoolPrice> uPoolPrices = (newParent || (null == parent.getPoolPrices()))?new ArrayList<UtotePoolPrice>():parent.getPoolPrices();

        // See if any pools were passed in
        if (poolPrices.isPoolPriceSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Iterate over the pools
            for (ResultServiceStub.PoolPrice poolPrice : poolPrices.getPoolPrice()) {

                boolean newEntity = false;
                // Open transaction
                em.getTransaction().begin();

                // If this is new, create the container
                UtotePoolPrice uPoolPrice = newParent?null:findPoolPrice(uPoolPrices, poolPrice.getPoolId(), poolPrice.getPoolName());
                if (null == uPoolPrice) {
                    uPoolPrice = new UtotePoolPrice();
                    uPoolPrice.setIdParent(parent.getIdUtoteResult());
                    newEntity = true;
                } else {
                    log4j.trace("{} - FOUND EXISTING PoolPrice with idUtotePoolPrice={}, poolId={}, poolName={}", method, uPoolPrice.getIdUtotePoolPrice(), uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                }

                log4j.trace("{} - Cloning fields for poolId={}, poolName={}", method, poolPrice.getPoolId(), poolPrice.getPoolName());

                // Set the values that have been specified
                uPoolPrice.updateFromTote(poolPrice);

                // Persist the element
                if (newEntity) {
                    em.persist(uPoolPrice);
                } else {
                    UtotePoolPrice mergedPoolPrice = em.merge(uPoolPrice);
                    uPoolPrices.remove(uPoolPrice);
                    uPoolPrice = mergedPoolPrice;
                }

                // Commit the transaction
                try {
                    em.getTransaction().commit();
                } catch (Exception e) {
                    log4j.error(method + " - Could not persist PoolPrice for idUtoteResult="+parent.getIdUtoteResult()+", eventId="+parent.getEventId()+", raceId=" + parent.getRaceId() + ", Exception = " + e.getMessage(),e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                uPoolPrice.setResult(parent);
                if (poolPrice.isPricesSpecified()) {
                    //uPoolPrice.setPrices(poolPrice.getPrices());
                    // Add the Price if specified
                    // If an existing runner, try to retrieve existing Entries
                    if (!newEntity) {
                        TypedQuery<UtotePrice> q = em.createNamedQuery("UtotePrice.findByParent", UtotePrice.class);
                        q.setParameter("idParent", uPoolPrice.getIdUtotePoolPrice());
                        Collection<UtotePrice> priceList = q.getResultList();
                        if ((null != priceList) && (priceList.size() > 0)) {
                            uPoolPrice.setPrices(priceList);
                        } else {
                            log4j.warn("{} - Did not find any existing entries for an existing Prices for PoolPrice with poolId={}, poolName={}", method, uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                        }
                    }
                    Collection<UtotePrice> priceList = clonePrices(uPoolPrice, poolPrice.getPrices(), newParent);
                    uPoolPrice.setPrices(priceList);
                    uPoolPrice.setHasPrices(true);
                    log4j.trace("{} - After adding Prices for Number of Prices={} poolId={}, idUtotePoolPrice={}", method, uPoolPrice.getPrices().size(), uPoolPrice.getPoolId(), uPoolPrice.getIdUtotePoolPrice());
                }

                // Put it into the holding array
                uPoolPrices.add(uPoolPrice);

            }

            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }

        }

        return uPoolPrices;
    }

    private static UtoteResult findResults(EntityManager em, String eventId, int raceId) {
        log4j.entry("findResults - eventId, raceId", eventId, raceId);
        UtoteResult utoteResult = null;
        TypedQuery<UtoteResult> q = em.createNamedQuery("UtoteResult.findSpecific", UtoteResult.class);
        q.setParameter("eventId", eventId);
        q.setParameter("raceId", raceId);
        try {
            utoteResult = q.getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            log4j.trace("findResults - Received NoResultException looking for a Race");
        }
        if (null == utoteResult) {
            log4j.debug("findResults - Existing result NOT FOUND. EventId={}, RaceId={}", eventId, raceId);
        }
        log4j.exit("findResults");
        return utoteResult;
    }

    private static UtoteResult persistResult(String eventId, int raceId, ResultServiceStub.ResultResponse result, boolean deep, boolean returnAssociations) {
        String method = "persistResult";
        log4j.entry("persistResult - eventId, raceId ", eventId, raceId);
        boolean newResults = false;

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getRWEMF();
        final EntityManager em = emF.createEntityManager();

        // See if the entity already exists
        log4j.debug("{} - Searching for utoteResult with eventId={}, raceId={}", method, eventId, raceId);
        UtoteResult utoteResult = findResults(em, eventId, raceId);
        if (null == utoteResult) {
            log4j.debug("{} - utoteResult with eventId={}, raceId={} not found, creating new entity", method, eventId, raceId);
            utoteResult = new UtoteResult();
            utoteResult.setEventId(eventId);
            newResults = true;
        } else {
            log4j.debug("{} - Found existing utoteResult entity with eventId={}, raceId={}", method, eventId, raceId);
        }

        // Update the information in the record with what was submitted
        utoteResult.updateFromTote(result);

        // Persist first before updating or adding any associations
        try {
            em.getTransaction().begin();
            if (newResults) {
                em.persist(utoteResult);
            } else {
                UtoteResult mergedResult = em.merge(utoteResult);
                utoteResult = mergedResult;
            }
            em.getTransaction().commit();
            boolean needsUpdate = false;

            // Now update/add Pool Prices if specified
            if (deep && utoteResult.hasPoolPrices()) {

                // If an existing Result, try to retrieve existing Pool Prices
                if (!newResults) {
                    TypedQuery<UtotePoolPrice> q = em.createNamedQuery("UtotePoolPrice.findByParent", UtotePoolPrice.class);
                    q.setParameter("idParent", utoteResult.getIdUtoteResult());
                    Collection<UtotePoolPrice> utotePoolPrices = q.getResultList();
                    if ((null != utotePoolPrices) && (utotePoolPrices.size() > 0)) {
                        utoteResult.setPoolPrices(utotePoolPrices);
                    } else {
                        log4j.warn("{} - Did not find any existing PoolPrices for an existing Result: for idUtoteResult = {}, runId={}, eventId={}, raceId={}", method, utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                    }
                }

                // Clone the PoolPrices (e.g. insert or update)
                Collection<UtotePoolPrice> clonedPoolPrices = clonePoolPrice(utoteResult, newResults, result.getPoolPrices());
                if (newResults) {
                    if ((null == clonedPoolPrices) || (clonedPoolPrices.size() == 0)) {
                        utoteResult.setPoolPrices(null);
                        if (utoteResult.hasPoolPrices()) {
                            utoteResult.setHasPoolPrices(false);
                            needsUpdate = true;
                        }
                    } else {
                        utoteResult.setPoolPrices(clonedPoolPrices);
                        if (!utoteResult.hasPoolPrices()) {
                            utoteResult.setHasPoolPrices(true);
                            needsUpdate = true;
                        }
                    }
                } else {
                    // If the event had prices, but does not any longer
                    if ((null == clonedPoolPrices) || (clonedPoolPrices.size() == 0)) {
                        if ((null != utoteResult.getPoolPrices()) && (utoteResult.getPoolPrices().size() > 0)) {
                            log4j.debug("{} - Has PoolPrices to remove, about to remove PoolPrices for runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                            for (UtotePoolPrice aPoolPrice : utoteResult.getPoolPrices()) {
                                em.remove(aPoolPrice);
                            }
                            utoteResult.getPoolPrices().clear();
                            utoteResult.setPoolPrices(null);
                            if (utoteResult.hasPoolPrices()) {
                                utoteResult.setHasPoolPrices(false);
                                needsUpdate = true;
                            }
                        }
                    }
                }

            } else {
                log4j.debug("{} - No PoolPrices specified for eventId={}, raceId={}", method, utoteResult.getEventId(), utoteResult.getRaceId());
            }

            // Now update/add Positions if specified
            if (deep && utoteResult.hasPositions()) {

                // If an existing Result, try to retrieve existing Positoons
                if (!newResults) {
                    TypedQuery<UtotePosition> q = em.createNamedQuery("UtotePosition.findByParent", UtotePosition.class);
                    q.setParameter("idParent", utoteResult.getIdUtoteResult());
                    Collection<UtotePosition> utotePositions = q.getResultList();
                    if ((null != utotePositions) && (utotePositions.size() > 0)) {
                        utoteResult.setPositions(utotePositions);
                    } else {
                        log4j.warn("{} - Did not find any existing Posiitons for an existing Result: for idUtoteResult = {}, runId={}, eventId={}, raceId={}", method, utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                    }
                }

                // Clone the Positions (e.g. insert or update)
                Collection<UtotePosition> clonedPositions = clonePositions(utoteResult, newResults, result.getRaceResults().getPositions());
                if (newResults) {
                    if ((null == clonedPositions) || (clonedPositions.size() == 0)) {
                        utoteResult.setPositions(null);
                        if (utoteResult.hasPositions()) {
                            utoteResult.setHasPositions(false);
                            needsUpdate = true;
                        }
                    } else {
                        utoteResult.setPositions(clonedPositions);
                        if (!utoteResult.hasPositions()) {
                            utoteResult.setHasPositions(true);
                            needsUpdate = true;
                        }
                    }
                } else {
                    // If the event had prices, but does not any longer
                    if ((null == clonedPositions) || (clonedPositions.size() == 0)) {
                        if ((null != utoteResult.getPositions()) && (utoteResult.getPositions().size() > 0)) {
                            log4j.debug("{} - Has Positions to remove, about to remove Positions for runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                            for (UtotePosition aPosition : utoteResult.getPositions()) {
                                em.remove(aPosition);
                            }
                            utoteResult.getPositions().clear();
                            utoteResult.setPositions(null);
                            if (utoteResult.hasPositions()) {
                                utoteResult.setHasPositions(false);
                                needsUpdate = true;
                            }
                        }
                    }
                }

            } else {
                log4j.debug("{} - No Posiitons specified for eventId={}, raceId={}", method, utoteResult.getEventId(), utoteResult.getRaceId());
            }

            // If the state of the Result for this Event and Race changed, do a final update
            if (needsUpdate) {
                em.getTransaction().begin();
                UtoteResult mergedResult = em.merge(utoteResult);
                utoteResult = mergedResult;
                em.getTransaction().commit();
            }

            log4j.debug("{} - Results processed for idUtoteResult={} runId={}, eventId={}, raceId={}", method, utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());

        } catch (Exception e) {
            log4j.error(method + " - Could not persist eventId={}, raceId={}, Exception={}\n{}", method, utoteResult.getEventId(), utoteResult.getRaceId(), e.getMessage(), e);
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

        // Close the connections
        try {
            if (em.isOpen()) {
                em.close();
            }
            if (emF.isOpen()) {
                emF.close();
            }
        } catch (Exception e) {
            log4j.error(method+" - Exception trying em.close(): "+e.getMessage(),e);
        }

        log4j.exit(method);
        return utoteResult;

    }

    public static UtoteResult getResults(String eventId, int raceId) {

        String method = "ResultRequestProcessor.getResults";
        log4j.entry(method + " - eventId, raceId", eventId, raceId);

        UtoteResult utoteResult = null;
        ResultServiceStub.GetResultResponse rResponse = null;
        ResultServiceStub.ResultResponse resultResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;
        int delayDuration = 5000;
        int tryAgain = 11;

        while (tryAgain > 0) {
            // Make call to GetResult
            try {

                // Setup call
                ResultServiceStub stub = new ResultServiceStub();
                ResultServiceStub.GetResult getResultInput = new ResultServiceStub.GetResult();
                ResultServiceStub.ResultRequest rRequest = new ResultServiceStub.ResultRequest();
                rRequest.setSource(getSource());
                rRequest.setEventId(eventId);
                rRequest.setRaceId(raceId);
                getResultInput.setResultRequest(rRequest);

                // Log the request
                requestLogId = UtoteRequestResponseLogger.saveGetResultRequest(getResultInput);

                // Make the call
                rResponse = stub.getResult(getResultInput);

                // Make sure we got a response
                if (null == rResponse) {
                    log4j.error("{} - Null response returned from GetResult request for eventId={}, raceId={}.", method, eventId, raceId);
                }

                tryAgain = 1;

            } catch (Result_GetResult_ValidationFaultFault_FaultMessage e) {
                log4j.error(method + " - Result_GetResult_ValidationFaultFault_FaultMessage getting race result - "+e.getMessage(), e);
            } catch (Result_GetResult_ToteFaultFault_FaultMessage e) {
                log4j.error(method + " - Result_GetResult_ToteFaultFault_FaultMessage getting race results - "+e.getMessage(), e);
            } catch (AxisFault e) {
                log4j.error(method + " - AxisFault getting race details - "+e.getMessage(),e);
            } catch (Exception e) {
                log4j.error(method + " - General exception getting race details - "+e.getMessage(),e);
            }

            -- tryAgain;
            if (0 != tryAgain) {
                log4j.debug("{} - Could not get results, waiting {} seconds and then trying {} more times", method, delayDuration, tryAgain);
                try {
                    Thread.sleep(delayDuration);
                } catch (InterruptedException e) {
                    log4j.error(method + " - Received InterruptedException while waiting to retry getting race details - "+e.getMessage(),e);
                }
            }

        }

        if ((null != rResponse) && rResponse.isResultResponseSpecified()) {

            // Get the response
            resultResponse = rResponse.getResultResponse();

            // Debug the response header
            if (log4j.isDebugEnabled()) {
                String errMsg = null;
                if (resultResponse.isErrorSpecified()) {
                    errMsg = ", Error (Number/Message/Params): ";
                    errMsg += (resultResponse.getError().isNumberSpecified()?resultResponse.getError().getNumber():"<N/A>") + "/";
                    errMsg += (resultResponse.getError().isMessageSpecified()?resultResponse.getError().getMessage():"<N/A>") + "/";
                    errMsg += (resultResponse.getError().isParamsSpecified()?resultResponse.getError().getParams().toString():"<N/A>");
                }
                log4j.debug("getEventDetailsRaw GroupId={}, RunId={}, SourceId/SystemId={}/{}{}",
                        resultResponse.isGroupIdSpecified()?resultResponse.getGroupId():"N/A",
                                resultResponse.isRunIdSpecified()?resultResponse.getRunId():"N/A",
                                        resultResponse.getSource().getSourceId(), resultResponse.getSource().getSystemId(),
                                        (null == errMsg)?"":errMsg);
            }

            // Persist the result
            utoteResult = persistResult(eventId, raceId, resultResponse, true /* deep */, true /* return associated objects */);

            // Log the response
            responseLogId = UtoteRequestResponseLogger.saveGetResultResponse(requestLogId, rResponse, Integer.valueOf(utoteResult.getIdUtoteResult()));

            log4j.debug("{} - Finished getting results for utoteResult.idUtoteResult={}, eventId={}, raceId={}", method, utoteResult.getIdUtoteResult(), eventId, raceId);

            // GetRace returned, but was missing the RaceResposne
        } else if (null != rResponse) {
            responseLogId = UtoteRequestResponseLogger.saveGetResultResponse(requestLogId, rResponse, null);
            log4j.error("{} - Received a result, but No race response was returned, responseLogId = {}", method, responseLogId);

            // Null response from GetRace call
        } else {
            log4j.error("{} - No race response was returned for Event Id={} and Race Id={}", method, eventId, raceId);
        }

        log4j.exit(method);
        return utoteResult;
    }

    class ResultValues {
        BigDecimal _win = new BigDecimal(0);
        BigDecimal _place = new BigDecimal(0);
        BigDecimal _show = new BigDecimal(0);
        void addToWin(BigDecimal v) {
            _win = _win.add(v);
        }
        void addToPlace(BigDecimal v) {
            _place = _place.add(v);
        }
        void addToShow(BigDecimal v) {
            _show = _show.add(v);
        }
        public BigDecimal win() {
            return _win;
        }
        public BigDecimal place() {
            return _place;
        }
        public BigDecimal show() {
            return _show;
        }
    }
    /**
     * Test the getResults function based on current races that are final.
     */
    private static void test(boolean finalOnly) {
        String method = "ResultRequestProcessor.test";
        log4j.entry(method +  "- finalOnly=" + (finalOnly?"true":"false"));

        // Get an Entity Manager
        final EntityManagerFactory emF = Configurator.getROEMF();
        final EntityManager em = emF.createEntityManager();

        // Get list of all races that have a status of Final
        TypedQuery<UtoteRace> q = em.createNamedQuery("UtoteRace.findAll", UtoteRace.class);
        Collection<UtoteRace> raceList = q.getResultList();
        if ((null != raceList) && (raceList.size() > 0)) {
            log4j.debug("{} - Found {} existing Races.", method, raceList.size());

            // Iterate through races and get the results
            raceList.parallelStream()
            .filter(r -> (!finalOnly || (finalOnly && r.getRaceStatus().equalsIgnoreCase(UtoteRace.RACE_STATUS_FINAL))))
            .forEach(r -> {
                r.loadParent(em);
                UtoteResult utoteResult = getResults(r.getEventId(), r.getRaceId());
                log4j.debug("{} - eventId={}, raceId={}, utoteResult={}", method, r.getEventId(), r.getRaceId(), utoteResult.toString(true));

                // Get the finishers
                utoteResult.getPositions().stream()
                .sorted((p1,p2) ->Integer.compare(p1.getPositionId(),p2.getPositionId()))
                .forEach(p -> {

                    //Get the finishers that ran at this position
                    log4j.debug("{} - eventId={}, raceId={}, p.getPositionId={}", method, r.getEventId(), r.getRaceId(), p.getPositionId());
                    p.getFinishers().stream()
                    .forEach(f -> {

                        // Display the RTW winning amounts for this finisher
                        log4j.debug("{} - eventId={}, raceId={}, p.getPositionId={}, f.getRunnerId={}, f.getRtwWinAmount={}, f.getRtwPlaceAmount={}, f.getRtwShowAmount={}", method, r.getEventId(), r.getRaceId(), p.getPositionId(), f.getRunnerId(), f.getRtwWinAmount(), f.getRtwPlaceAmount(), f.getRtwShowAmount());
                    });
                });
            });

        } else {
            log4j.debug("{} - Did not find any existing Races.", method);
        }

        // Close the connections
        try {
            em.close();
            emF.close();
        } catch (Exception e) {
            log4j.error(method + " - Exception trying em.close(): "+e.getMessage(), e);
        }

        log4j.exit(method);
    }

    public static void testAllRaces() {
        test(false);
    }

    public static void testFinalRaces() {
        test(true);
    }
}
