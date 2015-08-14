
package com.unitedtote.schema.totelink._2008._06.result;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.unitedtote.schema.totelink._2008._06.result package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Position_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Position");
    private final static QName _Finishers_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finishers");
    private final static QName _PoolPrice_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolPrice");
    private final static QName _ResultEntity_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "ResultEntity");
    private final static QName _Positions_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Positions");
    private final static QName _PoolPrices_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolPrices");
    private final static QName _PriceEntity_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PriceEntity");
    private final static QName _ResultResponse_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "ResultResponse");
    private final static QName _Finisher_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Finisher");
    private final static QName _Prices_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Prices");
    private final static QName _ResultRequest_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "ResultRequest");
    private final static QName _ResultEntityScratches_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Scratches");
    private final static QName _ResultEntityWinners_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Winners");
    private final static QName _FinisherEntryId_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "EntryId");
    private final static QName _FinisherJockey_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Jockey");
    private final static QName _FinisherName_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Name");
    private final static QName _ResultResponseRaceResults_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "RaceResults");
    private final static QName _ResultResponseCurrencyId_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "CurrencyId");
    private final static QName _ResultResponseEventName_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "EventName");
    private final static QName _ResultResponseEventId_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "EventId");
    private final static QName _PriceEntityPriceAmount_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PriceAmount");
    private final static QName _PriceEntityRequired_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Required");
    private final static QName _PriceEntityPayoff_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Payoff");
    private final static QName _PriceEntityWager_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Wager");
    private final static QName _PriceEntityWinnings_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "Winnings");
    private final static QName _PoolPriceCarryOver_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "CarryOver");
    private final static QName _PoolPricePoolName_QNAME = new QName("http://schema.unitedtote.com/ToteLink/2008/06/Result", "PoolName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unitedtote.schema.totelink._2008._06.result
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetResultResponse }
     * 
     */
    public GetResultResponse createGetResultResponse() {
        return new GetResultResponse();
    }

    /**
     * Create an instance of {@link ResultEntity }
     * 
     */
    public ResultEntity createResultEntity() {
        return new ResultEntity();
    }

    /**
     * Create an instance of {@link Finishers }
     * 
     */
    public Finishers createFinishers() {
        return new Finishers();
    }

    /**
     * Create an instance of {@link ResultRequest }
     * 
     */
    public ResultRequest createResultRequest() {
        return new ResultRequest();
    }

    /**
     * Create an instance of {@link ResultResponse }
     * 
     */
    public ResultResponse createResultResponse() {
        return new ResultResponse();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link Finisher }
     * 
     */
    public Finisher createFinisher() {
        return new Finisher();
    }

    /**
     * Create an instance of {@link PoolPrices }
     * 
     */
    public PoolPrices createPoolPrices() {
        return new PoolPrices();
    }

    /**
     * Create an instance of {@link GetResult }
     * 
     */
    public GetResult createGetResult() {
        return new GetResult();
    }

    /**
     * Create an instance of {@link Prices }
     * 
     */
    public Prices createPrices() {
        return new Prices();
    }

    /**
     * Create an instance of {@link Positions }
     * 
     */
    public Positions createPositions() {
        return new Positions();
    }

    /**
     * Create an instance of {@link PriceEntity }
     * 
     */
    public PriceEntity createPriceEntity() {
        return new PriceEntity();
    }

    /**
     * Create an instance of {@link PoolPrice }
     * 
     */
    public PoolPrice createPoolPrice() {
        return new PoolPrice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Position }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Position")
    public JAXBElement<Position> createPosition(Position value) {
        return new JAXBElement<Position>(_Position_QNAME, Position.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finishers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Finishers")
    public JAXBElement<Finishers> createFinishers(Finishers value) {
        return new JAXBElement<Finishers>(_Finishers_QNAME, Finishers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoolPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "PoolPrice")
    public JAXBElement<PoolPrice> createPoolPrice(PoolPrice value) {
        return new JAXBElement<PoolPrice>(_PoolPrice_QNAME, PoolPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "ResultEntity")
    public JAXBElement<ResultEntity> createResultEntity(ResultEntity value) {
        return new JAXBElement<ResultEntity>(_ResultEntity_QNAME, ResultEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Positions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Positions")
    public JAXBElement<Positions> createPositions(Positions value) {
        return new JAXBElement<Positions>(_Positions_QNAME, Positions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoolPrices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "PoolPrices")
    public JAXBElement<PoolPrices> createPoolPrices(PoolPrices value) {
        return new JAXBElement<PoolPrices>(_PoolPrices_QNAME, PoolPrices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "PriceEntity")
    public JAXBElement<PriceEntity> createPriceEntity(PriceEntity value) {
        return new JAXBElement<PriceEntity>(_PriceEntity_QNAME, PriceEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "ResultResponse")
    public JAXBElement<ResultResponse> createResultResponse(ResultResponse value) {
        return new JAXBElement<ResultResponse>(_ResultResponse_QNAME, ResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finisher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Finisher")
    public JAXBElement<Finisher> createFinisher(Finisher value) {
        return new JAXBElement<Finisher>(_Finisher_QNAME, Finisher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Prices")
    public JAXBElement<Prices> createPrices(Prices value) {
        return new JAXBElement<Prices>(_Prices_QNAME, Prices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "ResultRequest")
    public JAXBElement<ResultRequest> createResultRequest(ResultRequest value) {
        return new JAXBElement<ResultRequest>(_ResultRequest_QNAME, ResultRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "ResultResponse", scope = GetResultResponse.class)
    public JAXBElement<ResultResponse> createGetResultResponseResultResponse(ResultResponse value) {
        return new JAXBElement<ResultResponse>(_ResultResponse_QNAME, ResultResponse.class, GetResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Scratches", scope = ResultEntity.class)
    public JAXBElement<String> createResultEntityScratches(String value) {
        return new JAXBElement<String>(_ResultEntityScratches_QNAME, String.class, ResultEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Positions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Positions", scope = ResultEntity.class)
    public JAXBElement<Positions> createResultEntityPositions(Positions value) {
        return new JAXBElement<Positions>(_Positions_QNAME, Positions.class, ResultEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Winners", scope = ResultEntity.class)
    public JAXBElement<String> createResultEntityWinners(String value) {
        return new JAXBElement<String>(_ResultEntityWinners_QNAME, String.class, ResultEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "EntryId", scope = Finisher.class)
    public JAXBElement<String> createFinisherEntryId(String value) {
        return new JAXBElement<String>(_FinisherEntryId_QNAME, String.class, Finisher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Jockey", scope = Finisher.class)
    public JAXBElement<String> createFinisherJockey(String value) {
        return new JAXBElement<String>(_FinisherJockey_QNAME, String.class, Finisher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Name", scope = Finisher.class)
    public JAXBElement<String> createFinisherName(String value) {
        return new JAXBElement<String>(_FinisherName_QNAME, String.class, Finisher.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "RaceResults", scope = ResultResponse.class)
    public JAXBElement<ResultEntity> createResultResponseRaceResults(ResultEntity value) {
        return new JAXBElement<ResultEntity>(_ResultResponseRaceResults_QNAME, ResultEntity.class, ResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "CurrencyId", scope = ResultResponse.class)
    public JAXBElement<String> createResultResponseCurrencyId(String value) {
        return new JAXBElement<String>(_ResultResponseCurrencyId_QNAME, String.class, ResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "EventName", scope = ResultResponse.class)
    public JAXBElement<String> createResultResponseEventName(String value) {
        return new JAXBElement<String>(_ResultResponseEventName_QNAME, String.class, ResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "EventId", scope = ResultResponse.class)
    public JAXBElement<String> createResultResponseEventId(String value) {
        return new JAXBElement<String>(_ResultResponseEventId_QNAME, String.class, ResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoolPrices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "PoolPrices", scope = ResultResponse.class)
    public JAXBElement<PoolPrices> createResultResponsePoolPrices(PoolPrices value) {
        return new JAXBElement<PoolPrices>(_PoolPrices_QNAME, PoolPrices.class, ResultResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "ResultRequest", scope = GetResult.class)
    public JAXBElement<ResultRequest> createGetResultResultRequest(ResultRequest value) {
        return new JAXBElement<ResultRequest>(_ResultRequest_QNAME, ResultRequest.class, GetResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "PriceAmount", scope = PriceEntity.class)
    public JAXBElement<BigDecimal> createPriceEntityPriceAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceEntityPriceAmount_QNAME, BigDecimal.class, PriceEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Required", scope = PriceEntity.class)
    public JAXBElement<String> createPriceEntityRequired(String value) {
        return new JAXBElement<String>(_PriceEntityRequired_QNAME, String.class, PriceEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Payoff", scope = PriceEntity.class)
    public JAXBElement<BigDecimal> createPriceEntityPayoff(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceEntityPayoff_QNAME, BigDecimal.class, PriceEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Wager", scope = PriceEntity.class)
    public JAXBElement<BigDecimal> createPriceEntityWager(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceEntityWager_QNAME, BigDecimal.class, PriceEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Winnings", scope = PriceEntity.class)
    public JAXBElement<BigDecimal> createPriceEntityWinnings(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PriceEntityWinnings_QNAME, BigDecimal.class, PriceEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "CarryOver", scope = PoolPrice.class)
    public JAXBElement<BigDecimal> createPoolPriceCarryOver(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PoolPriceCarryOver_QNAME, BigDecimal.class, PoolPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "PoolName", scope = PoolPrice.class)
    public JAXBElement<String> createPoolPricePoolName(String value) {
        return new JAXBElement<String>(_PoolPricePoolName_QNAME, String.class, PoolPrice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schema.unitedtote.com/ToteLink/2008/06/Result", name = "Prices", scope = PoolPrice.class)
    public JAXBElement<Prices> createPoolPricePrices(Prices value) {
        return new JAXBElement<Prices>(_Prices_QNAME, Prices.class, PoolPrice.class, value);
    }

}
