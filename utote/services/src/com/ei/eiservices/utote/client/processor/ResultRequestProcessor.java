
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
import com.ei.eiservices.utote.client.resultservice.ResultServiceStub.ResultEntity;
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

    private ResultServiceStub.Source getSource() {
        ResultServiceStub.Source source = new ResultServiceStub.Source();
        source.setSystemId(Configurator.getSystemId());
        source.setSourceId(Configurator.getSourceId());
        return source;
    }

    private void calculateRTWWinnings(UtoteFinisher f) {
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

    private UtoteFinisher findFinisher(Collection<UtoteFinisher> finishers, int runnerId) {
        log4j.entry("findFinisher - finishers.size, runnerId", finishers.size(), runnerId);
        for (UtoteFinisher uFinisher : finishers) {
            if (uFinisher.getRunnerId() == runnerId) {
                log4j.exit("findFinisher - Found Finisher for runnerId="+runnerId);
                return uFinisher;
            }
        }
        log4j.exit("findFinisher - Not Found.");
        return null;
    }

    private Collection<UtoteFinisher> cloneFinishers(UtotePosition parent, ResultServiceStub.Finishers finishers, boolean newParent) {
        String method = "cloneFinishers";
        log4j.entry(method + " - idParent(Position), positionId", parent.getIdUtotePosition(), parent.getPositionId());
        Collection<UtoteFinisher> uFinishers = null;

        // See if any prices were passed in
        if (finishers.isFinisherSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Get the current Runners entity collection, if exists
            uFinishers = newParent?null:parent.getFinishers();
            if (null == uFinishers) {
                log4j.trace("{} - no Finishers found in parent.  Creating and setting new array list", method);
                uFinishers = new ArrayList<UtoteFinisher>();
            }

            // Open transaction
            log4j.trace("{} - {} Finishers are specified, about to process", method, finishers.getFinisher().length);

            // Iterate over the prices
            for (ResultServiceStub.Finisher finisher : finishers.getFinisher()) {

                boolean newEntity = false;
                em.getTransaction().begin();

                // If this is new, create the container
                log4j.trace("{} - Searching for input runnerId={}", method, finisher.getRunnerId());
                UtoteFinisher uFinisher = newParent?null:findFinisher(uFinishers, finisher.getRunnerId());
                if (null == uFinisher) {
                    log4j.trace("{} - Not found, creating new entity for input runnerId={}", method, finisher.getRunnerId());
                    uFinisher = new UtoteFinisher();
                    uFinisher.setIdParent(parent.getIdUtotePosition());
                    uFinisher.setRunnerId(finisher.getRunnerId());
                    newEntity = true;
                } else {
                    log4j.trace("{} - Found Finisher for input runnerId={}, idUtoteFinisher={}", method, uFinisher.getRunnerId(), uFinisher.getIdUtoteFinisher());
                }

                log4j.trace("{} - Cloning fields for input runnerId={}", method, uFinisher.getRunnerId());

                // Set the values that have been specified
                if (finisher.isEntryIdSpecified()) {
                    uFinisher.setEntryId(finisher.getEntryId());
                }
                if (finisher.isJockeySpecified()) {
                    uFinisher.setJockey(finisher.getJockey());
                }
                if (finisher.isNameSpecified()) {
                    uFinisher.setName(finisher.getName());
                }

                // Persist first before updating or adding any associations
                if (newEntity) {
                    log4j.trace("{} - Entry is NEW, calling persist runnerId={}", method, uFinisher.getRunnerId());
                    em.persist(uFinisher);
                } else {
                    log4j.trace("{} - Entry Entity is EXISTING, calling merge for runnerId={}", method, uFinisher.getRunnerId());
                    UtoteFinisher mergedEntry = em.merge(uFinisher);
                    uFinishers.remove(uFinisher);
                    uFinisher = mergedEntry;
                }

                // Commit the transaction
                try {
                    log4j.trace("{} - Calling commit Finisher transaction for runnerId={}", method, uFinisher.getRunnerId());
                    em.getTransaction().commit();
                    log4j.trace("{} - Finisher Entity comitted for idUtoteFinisher={}, runnerId={}", method, uFinisher.getIdUtoteFinisher(), uFinisher.getRunnerId());
                } catch (Exception e) {
                    log4j.error("{} - Could not persist Price for runnerId={}, exceptionMsg={}, exception={}", method, uFinisher.getRunnerId(), e.getMessage(), e);
                } finally {
                    if (em.getTransaction().isActive()) {
                        em.getTransaction().rollback();
                    }
                }

                // Calculate winnings (win/place/show) values for RTW usage
                uFinisher.setPosition(parent);
                calculateRTWWinnings(uFinisher);

                // Save the entry to return
                uFinishers.add(uFinisher);
            }

            em.close();
            emF.close();

        }

        log4j.exit(method + " - uFinishers.size = " + uFinishers.size());
        return uFinishers;
    }

    private UtotePosition findPosition(Collection<UtotePosition> positions, int positionId) {
        log4j.entry("findPosition - ", positionId);
        for (UtotePosition uPosition : positions) {
            if (uPosition.getPositionId() == positionId) {
                log4j.trace("findPosition - Found UtotePosition object with positionId="+positionId);
                return uPosition;
            }
        }
        log4j.exit("findPosition - Not Found.");
        return null;
    }

    private Collection<UtotePosition> clonePositions(UtoteResult parent, boolean newParent, ResultServiceStub.Positions positions) {
        String method = "clonePosition";
        log4j.entry(method + " - for EventId, RaceId", parent.getEventId(), parent.getRaceId());

        // Get the current Position entity collection, if exists
        Collection<UtotePosition> uPositions = newParent?null:parent.getPositions();
        if (null == uPositions) {
            log4j.debug("{} - no Positions found in parent.  Creating and setting new array list", method);
            uPositions = new ArrayList<UtotePosition>();
        }

        // See if any pools were passed in
        if (positions.isPositionSpecified()) {

            log4j.debug("{} - {} Positions are specified, about to process", method, positions.getPosition().length);

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Open transaction
            log4j.trace("{} - Opening Positions transaction for idUtoteResult={}, eventId={}, raceId={}", method, parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());


            // Iterate over the pools
            for (ResultServiceStub.Position position : positions.getPosition()) {

                boolean newEntity = false;
                em.getTransaction().begin();

                // If this is new, create the container
                log4j.trace("{} - Searching for input positionId={}", method, position.getPositionId());
                UtotePosition uPosition = newParent?null:findPosition(uPositions, position.getPositionId());
                if (null == uPosition) {
                    log4j.trace("{} - Not found, creating new entity for positionId={}", method, position.getPositionId());
                    uPosition = new UtotePosition();
                    uPosition.setIdParent(parent.getIdUtoteResult());
                    uPosition.setPositionId(position.getPositionId());
                    newEntity = true;
                } else {
                    log4j.trace("{} - FOUND EXISTING Position with idUtotePoolPrice={}, positionId={}", method, uPosition.getIdUtotePosition(), uPosition.getPositionId());
                }

                log4j.trace("{} - Cloning fields for positionId={}", method, position.getPositionId());

                // Persist the element
                if (newEntity) {
                    log4j.trace("{} - Position Entity is NEW, calling persist for positionId={}", method, uPosition.getPositionId());
                    em.persist(uPosition);
                } else {
                    log4j.trace("{} - Position Entity EXISTS, calling persist for positionId={}", method, uPosition.getPositionId());
                    UtotePosition mergedPosition = em.merge(uPosition);
                    uPositions.remove(uPosition);
                    uPosition = mergedPosition;
                }

                // Commit the transaction
                try {

                    log4j.trace("{} - Calling commit transaction for idUtoteResult={}, eventId={}, raceId={}", method, parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());
                    em.getTransaction().commit();
                    log4j.debug("{} - PoolPrice Entity comitted for idUtoteResult={}, eventId={}, raceId={}", method, parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());

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
                log4j.trace("{} - Cloning Finishers for Posiiton with positionId={}", method, uPosition.getPositionId());
                Collection<UtoteFinisher> finisherList = cloneFinishers(uPosition, position.getFinishers(), newParent);
                uPosition.setFinishers(finisherList);
                log4j.trace("{} - After adding Finishers for Number of finishers={} positionId={}, idUtotePosition={}", method, uPosition.getFinishers().size(), uPosition.getPositionId(), uPosition.getIdUtotePosition());

                // Put it into the holding array
                uPositions.add(uPosition);

            }

            em.close();
            emF.close();

        }

        log4j.debug("{} - finished.  uPositions.size() = {}", method, uPositions.size());
        return uPositions;
    }

    private UtotePrice findPrice(Collection<UtotePrice> prices, String finish) {
        log4j.entry("findPrice - entries.size, runnerId", prices.size(), finish);
        for (UtotePrice uPrice : prices) {
            if (uPrice.getFinish().equalsIgnoreCase(finish)) {
                log4j.exit("findPrice - Found price for finish="+finish);
                return uPrice;
            }
        }
        log4j.exit("findPrice - Not Found.");
        return null;
    }

    private Collection<UtotePrice> clonePrices(UtotePoolPrice parent, ResultServiceStub.Prices prices, boolean newParent) {
        String method = "clonePrices";
        log4j.entry(method + " - idParent(PoolPrice), poolId, poolName", parent.getIdUtotePoolPrice(), parent.getPoolId(), parent.getPoolName());
        Collection<UtotePrice> uPrices = null;

        // See if any prices were passed in
        if (prices.isPriceSpecified()) {

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Get the current Runners entity collection, if exists
            uPrices = newParent?null:parent.getPrices();
            if (null == uPrices) {
                log4j.trace("{} - no Prices found in parent.  Creating and setting new array list", method);
                uPrices = new ArrayList<UtotePrice>();
            }

            // Open transaction
            log4j.trace("{} - {} Prices are specified, about to process", method, prices.getPrice().length);

            // Iterate over the prices
            for (ResultServiceStub.PriceEntity price : prices.getPrice()) {

                boolean newEntity = false;
                em.getTransaction().begin();

                // If this is new, create the container
                log4j.trace("{} - Searching for input finish={}", method, price.getFinish());
                UtotePrice uPrice = newParent?null:findPrice(uPrices, price.getFinish());
                if (null == uPrice) {
                    log4j.trace("{} - Not found, creating new entity for input finish={}", method, price.getFinish());
                    uPrice = new UtotePrice();
                    uPrice.setIdParent(parent.getIdUtotePoolPrice());
                    uPrice.setFinish(price.getFinish());
                    newEntity = true;
                } else {
                    log4j.trace("{} - Found Price for input finish={}, idUtotePrice={}", method, uPrice.getFinish(), uPrice.getIdUtotePrice());
                }

                log4j.trace("{} - Cloning fields for input finish={}", method, uPrice.getFinish());

                // Set the values that have been specified
                if (price.isExchangeSpecified()) {
                    uPrice.setExchange(price.getExchange());
                }
                if (price.isHoldSpecified()) {
                    uPrice.setHold(price.getHold());
                }
                if (price.isPayoffSpecified()) {
                    uPrice.setPayoff(price.getPayoff());
                }
                if (price.isPriceAmountSpecified()) {
                    uPrice.setPriceAmount(price.getPriceAmount());
                }
                if (price.isRequiredSpecified()) {
                    uPrice.setRequired(price.getRequired());
                }
                if (price.isWagerSpecified()) {
                    uPrice.setWager(price.getWager());
                }
                if (price.isWinningsSpecified()) {
                    uPrice.setWinnings(price.getWinnings());
                }

                // Persist first before updating or adding any associations
                if (newEntity) {
                    log4j.trace("{} - Entry is NEW, calling persist finish={}, PoolId={}", method, uPrice.getFinish(), parent.getPoolId());
                    em.persist(uPrice);
                } else {
                    log4j.trace("{} - Entry Entity is EXISTING, calling merge for finish={}, PoolId={}", method, uPrice.getFinish(), parent.getPoolId());
                    UtotePrice mergedEntry = em.merge(uPrice);
                    uPrices.remove(uPrice);
                    uPrice = mergedEntry;
                }

                // Commit the transaction
                try {
                    log4j.trace("{} - Calling commit Price transaction for finsh={}, PoolId={}", method, uPrice.getFinish(), parent.getPoolId());
                    em.getTransaction().commit();
                    log4j.trace("{} - Price Entity comitted for idUtotePrice={}, finsh={}, PoolId={}", method, uPrice.getIdUtotePrice(), uPrice.getFinish(), parent.getPoolId());
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

            em.close();
            emF.close();

        }

        log4j.exit(method + " - uPrices.size = " + uPrices.size());
        return uPrices;
    }

    private UtotePoolPrice findPoolPrice(Collection<UtotePoolPrice> poolPrices, String poolId, String poolName) {
        log4j.entry("findPoolPrice - ", poolId, poolName);
        for (UtotePoolPrice uPoolPrice : poolPrices) {
            if (uPoolPrice.getPoolId().equals(poolId) && uPoolPrice.getPoolName().equals(poolName)) {
                log4j.trace("findPoolPrice - Found UtotePoolPrice object with poolId="+poolId+", poolName="+poolName);
                return uPoolPrice;
            }
        }
        log4j.exit("findPoolPrice - Not Found.");
        return null;
    }

    private Collection<UtotePoolPrice> clonePoolPrice(UtoteResult parent, boolean newParent, ResultServiceStub.PoolPrices poolPrices) {
        String method = "clonePoolPrice";
        log4j.entry(method + " - for EventId, RaceId", parent.getEventId(), parent.getRaceId());

        // Get the current Pool entity collection, if exists
        Collection<UtotePoolPrice> uPoolPrices = newParent?null:parent.getPoolPrices();
        if (null == uPoolPrices) {
            log4j.debug("{} - no Pools found in parent.  Creating and setting new array list", method);
            uPoolPrices = new ArrayList<UtotePoolPrice>();
        }

        // See if any pools were passed in
        if (poolPrices.isPoolPriceSpecified()) {

            log4j.debug("{} - {} PoolPrices are specified, about to process", method, poolPrices.getPoolPrice().length);

            final EntityManagerFactory emF = Configurator.getRWEMF();
            final EntityManager em = emF.createEntityManager();

            // Open transaction
            log4j.trace("{} - Opening PoolPrices transaction for idUtoteResult={}, eventId={}, raceId={}", method, parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());


            // Iterate over the pools
            for (ResultServiceStub.PoolPrice poolPrice : poolPrices.getPoolPrice()) {

                boolean newEntity = false;
                em.getTransaction().begin();

                // If this is new, create the container
                log4j.trace("{} - Searching for input poolId = {}, poolName = {}", method, poolPrice.getPoolId(), poolPrice.getPoolName());
                UtotePoolPrice uPoolPrice = newParent?null:findPoolPrice(uPoolPrices, poolPrice.getPoolId(), poolPrice.getPoolName());
                if (null == uPoolPrice) {
                    log4j.trace("{} - Not found, creating new entity for poolId={}, poolName={}", method, poolPrice.getPoolId(), poolPrice.getPoolName());
                    uPoolPrice = new UtotePoolPrice();
                    uPoolPrice.setIdParent(parent.getIdUtoteResult());
                    uPoolPrice.setPoolId(poolPrice.getPoolId());
                    uPoolPrice.setPoolName(poolPrice.getPoolName());
                    newEntity = true;
                } else {
                    log4j.trace("{} - FOUND EXISTING PoolPrice with idUtotePoolPrice={}, poolId={}, poolName={}", method, uPoolPrice.getIdUtotePoolPrice(), uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                }

                log4j.trace("{} - Cloning fields for poolId={}, poolName={}", method, poolPrice.getPoolId(), poolPrice.getPoolName());

                // Set the values that have been specified
                if (poolPrice.isPoolNameSpecified()) {
                    uPoolPrice.setPoolName(poolPrice.getPoolName());
                }
                if (poolPrice.isCarryOverSpecified()) {
                    uPoolPrice.setCarryOver(poolPrice.getCarryOver());
                }
                if (poolPrice.isRefundSpecified()) {
                    uPoolPrice.setRefund(poolPrice.getRefund());
                }

                // Persist the element
                if (newEntity) {
                    log4j.trace("{} - PoolPrice Entity is NEW, calling persist for poolId={}, poolName={}", method, uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                    em.persist(uPoolPrice);
                } else {
                    log4j.trace("{} - PoolPrice Entity EXISTS, calling persist for poolId={}, poolName={}", method, uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                    UtotePoolPrice mergedPoolPrice = em.merge(uPoolPrice);
                    uPoolPrices.remove(uPoolPrice);
                    uPoolPrice = mergedPoolPrice;
                }

                // Commit the transaction
                try {

                    log4j.trace("{} - Calling commit transaction for idUtoteResult={}, eventId={}, raceId={}", method, parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());
                    em.getTransaction().commit();
                    log4j.debug("{} - PoolPrice Entity comitted for idUtoteResult={}, eventId={}, raceId={}", method, parent.getIdUtoteResult(), parent.getEventId(), parent.getRaceId());

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
                    log4j.trace("{} - Cloning Prices for PoolPrice with poolId={}, poolName={}", method, uPoolPrice.getPoolId(), uPoolPrice.getPoolName());
                    Collection<UtotePrice> priceList = clonePrices(uPoolPrice, poolPrice.getPrices(), newParent);
                    uPoolPrice.setPrices(priceList);
                    uPoolPrice.setHasPrices(true);
                    log4j.trace("{} - After adding Prices for Number of Prices={} poolId={}, idUtotePoolPrice={}", method, uPoolPrice.getPrices().size(), uPoolPrice.getPoolId(), uPoolPrice.getIdUtotePoolPrice());
                }

                // Put it into the holding array
                uPoolPrices.add(uPoolPrice);

            }

            em.close();
            emF.close();

        }

        log4j.debug("{} - finished.  parent.getPoolPrices().size() = {}", method, uPoolPrices.size());
        return uPoolPrices;
    }

    private UtoteResult cloneResult(UtoteResult utoteResult, ResultServiceStub.ResultResponse result) {
        log4j.entry("cloneResult - ", result.getRunId(), result.getEventId(), result.getRaceId());

        utoteResult.setEventId(result.getEventId());
        utoteResult.setRaceId(result.getRaceId());
        if (result.isCurrencyIdSpecified()) {
            utoteResult.setCurrencyId(result.getCurrencyId());
        }
        if (result.isEventNameSpecified()) {
            utoteResult.setEventName(result.getEventName());
        }
        utoteResult.setHasPoolPrices(result.isPoolPricesSpecified());
        if (result.isRaceResultsSpecified()) {
            utoteResult.setHasRaceResults(true);
            ResultEntity raceResults = result.getRaceResults();
            if (raceResults.isPositionsSpecified()) {
                utoteResult.setHasPositions(true);
            }
            if (raceResults.isScratchesSpecified()) {
                utoteResult.setScratches(raceResults.getScratches());
            }
            if (raceResults.isWinnersSpecified()) {
                utoteResult.setWinners(raceResults.getWinners());
            }
        }


        log4j.exit("cloneResult");
        return utoteResult;
    }

    private UtoteResult findResults(EntityManager em, String eventId, int raceId) {
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
        if (null != utoteResult) {
            log4j.debug("Found existing result. idUtoteResult={}, EventId={}, RaceId={}", utoteResult.getIdUtoteResult(), utoteResult.getEventId(), utoteResult.getRaceId());
        }
        log4j.exit("findResults");
        return utoteResult;
    }

    private UtoteResult persistResult(String eventId, int raceId, ResultServiceStub.ResultResponse result, boolean deep, boolean returnAssociations) {
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
        log4j.debug("{} - About to cloneResults for eventId={}, raceId={}", method, eventId, raceId);
        UtoteResult clonedResult = cloneResult(utoteResult, result);
        utoteResult = clonedResult;

        // Persist first before updating or adding any associations
        log4j.debug("{} - About to persist {} Result for eventId={}, raceId={}", method, (newResults?"NEW":"EXISTING"), utoteResult.getEventId(), utoteResult.getRaceId());

        try {

            log4j.trace("{} - Opening transaction for {} Result with runId={}, eventId={}, raceId={}", method, (newResults?"NEW":"EXISTING"), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            em.getTransaction().begin();
            log4j.trace("{} - Calling persist for {} Result with runId={}, eventId={}, raceId={}", method, (newResults?"NEW":"EXISTING"), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            if (newResults) {
                em.persist(utoteResult);
            } else {
                UtoteResult mergedResult = em.merge(utoteResult);
                utoteResult = mergedResult;
            }
            log4j.trace("{} - Calling commit transaction for {} Result with runId={}, eventId={}, raceId={}", method, (newResults?"NEW":"EXISTING"), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            em.getTransaction().commit();
            log4j.debug("{} - {} Results persisted for idUtoteResult = {}, runId={}, eventId={}, raceId={}", method, (newResults?"NEW":"EXISTING"), utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
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
                log4j.debug("{} - Has PoolPrices, about to call clonePoolPrices for runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
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
                log4j.debug("{} - Has Positions, about to call clonePositions for runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
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
                log4j.trace("{} - Opening transaction for existing runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                em.getTransaction().begin();
                log4j.trace("{} - Calling merge for existing runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                UtoteResult mergedResult = em.merge(utoteResult);
                utoteResult = mergedResult;
                log4j.trace("{} - Calling commit transaction for existing runId={}, eventId={}, raceId={}", method, result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
                em.getTransaction().commit();
                log4j.debug("{} - Existing entity persisted for idUtoteResult={} runId={}, eventId={}, raceId={}", method, utoteResult.getIdUtoteResult(), result.getRunId(), utoteResult.getEventId(), utoteResult.getRaceId());
            }

        } catch (Exception e) {
            log4j.debug("{} - Could not persist Result for eventId={}, raceId={}", method, utoteResult.getEventId(), utoteResult.getRaceId());
            log4j.error(method + " - Could not persist eventId=" + utoteResult.getEventId() + ", raceId=" + utoteResult.getRaceId() + ", Exception = " + e.getMessage(),e);
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        }

        // Close the connections
        try {
            em.close();
            emF.close();
        } catch (Exception e) {
            log4j.error(method+" - Exception trying em.close(): "+e.getMessage(),e);
        }

        log4j.exit(method);
        return utoteResult;

    }

    public UtoteResult getResults(String eventId, int raceId) {

        String method = "getResults";
        log4j.entry(method + " - eventId, raceId", eventId, raceId);

        UtoteResult utoteResult = null;
        ResultServiceStub.GetResultResponse rResponse = null;
        ResultServiceStub.ResultResponse resultResponse = null;
        int requestLogId = 0;
        int responseLogId = 0;

        // Make call to GetResult
        try {

            // Setup call
            log4j.debug("{} - Settting up GetResult call for raceId={}", method, raceId);
            ResultServiceStub stub = new ResultServiceStub();
            ResultServiceStub.GetResult getResultInput = new ResultServiceStub.GetResult();
            ResultServiceStub.ResultRequest rRequest = new ResultServiceStub.ResultRequest();
            rRequest.setSource(getSource());
            rRequest.setEventId(eventId);
            rRequest.setRaceId(raceId);
            getResultInput.setResultRequest(rRequest);
            log4j.debug("{} - rRequest={}", method, rRequest.toString());
            log4j.debug("{} - getResultInput={}", method, getResultInput.toString());

            // Log the request
            requestLogId = (new UtoteRequestResponseLogger()).saveGetResultRequest(getResultInput);

            // Make the call
            log4j.debug("{} - Making GetResult call for eventId={}, raceId={}", method, eventId, raceId);
            rResponse = stub.getResult(getResultInput);

            // Make sure we got a response
            if (null == rResponse) {
                log4j.error("{} - Null response returned from GetResult request for eventId={}, raceId={}.", method, eventId, raceId);
            }


        } catch (Result_GetResult_ValidationFaultFault_FaultMessage e) {
            log4j.error(method + " - Result_GetResult_ValidationFaultFault_FaultMessage getting race result - "+e.getMessage(), e);
        } catch (Result_GetResult_ToteFaultFault_FaultMessage e) {
            log4j.error(method + " - Result_GetResult_ToteFaultFault_FaultMessage getting race details - "+e.getMessage(), e);
        } catch (AxisFault e) {
            log4j.error(method + " - AxisFault getting race details - "+e.getMessage(),e);
        } catch (Exception e) {
            log4j.error(method + " - General exception getting race details - "+e.getMessage(),e);
        }

        if ((null != rResponse) && rResponse.isResultResponseSpecified()) {

            // Get the response
            resultResponse = rResponse.getResultResponse();

            // Debug for the Result response header
            log4j.debug("{} - Result:", method);
            log4j.debug("\tItems with an \"(*)\" are optional.");
            log4j.debug("\t\tGroup Id(*): {}", resultResponse.isGroupIdSpecified()?resultResponse.getGroupId():"N/A");
            log4j.debug("\t\tRun Id(*): {}", resultResponse.isRunIdSpecified()?resultResponse.getRunId():"N/A");
            log4j.debug("\t\tSource (Source Id/System Id): {}/{}", resultResponse.getSource().getSourceId(), resultResponse.getSource().getSystemId());
            if (resultResponse.isErrorSpecified()) {
                log4j.debug("\t\tError(*): {}/{}/{}", resultResponse.getError().getNumber(), resultResponse.getError().getMessage(), resultResponse.getError().getParams().toString());
            }

            // Persist the result
            log4j.debug("{} - About to persist Results for eventId={}, raceId={}", method, eventId, raceId);
            utoteResult = persistResult(eventId, raceId, resultResponse, true /* deep */, true /* return associated objects */);
            log4j.debug("{} - After persistResult(), utoteResult.idUtoteResult={}, eventId={}, raceId={}", method, utoteResult.getIdUtoteResult(), eventId, raceId);

            // Log the response
            responseLogId = (new UtoteRequestResponseLogger()).saveGetResultResponse(requestLogId, rResponse, Integer.valueOf(utoteResult.getIdUtoteResult()));

            // GetRace returned, but was missing the RaceResposne
        } else if (null != rResponse) {
            responseLogId = (new UtoteRequestResponseLogger()).saveGetResultResponse(requestLogId, rResponse, null);
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
    private void test(boolean finalOnly) {
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

    public void testAllRaces() {
        test(false);
    }

    public void testFinalRaces() {
        test(true);
    }
}
