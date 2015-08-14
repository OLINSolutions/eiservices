package com.ei.eiservices.utote.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the utoteConfigurations database table.
 * 
 */
@Entity
@Table(name="utoteConfigurations")
@NamedQuery(name="UtoteConfiguration.findAll", query="SELECT u FROM UtoteConfiguration u")
public class UtoteConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="`idUtoteConfiguration`", insertable=true, updatable=true, unique=true, nullable=false)
	private int idUtoteConfiguration = 0;

	@Column(nullable=false)
	private Boolean accountCard = false;

	private int accountOffset;

	private int accountSize;

	private int accountTimeout;

	@Column(nullable=false)
	private Boolean assistance = false;

	@Column(length=1)
	private String bam;

	@Column(nullable=false)
	private Boolean brandTime = false;

	@Column(nullable=false)
	private Boolean cancels = false;

	private int cashReceipts;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date currentTime;

	@Column(length=4)
	private String customerLogo;

	@Column(nullable=false)
	private int dateFormat;

	@Lob
	@Column(nullable=false)
	private String datePicture;

	@Column(length=5)
	private String defaultEvent;

	@Column(nullable=false)
	private Boolean fractional = false;

	@Column(nullable=false)
	private Boolean funBets = false;

	private int fundedTimeout;

	@Column(nullable=false)
	private Boolean hasChannels = false;

	@Column(nullable=false)
	private Boolean hasCurrencies = false;

	@Column(nullable=false)
	private Boolean hasLanguages = false;

	private int idUtoteAccount;

	private int idUtoteAdvertisement;

	private int idUtoteContest;

	private int idUtoteDemand;

	private int idUtoteLimit;

	@Column(nullable=false)
	private Boolean inquiry = false;

	@Lob
	private String location;

	@Column(nullable=false)
	private Boolean longTicket = false;

	@Column(nullable=false)
	private Boolean manualLogOn = false;

	@Column(nullable=false)
	private Boolean mixed = false;

	@Column(length=1)
	private String mode;

	@Column(nullable=false)
	private Boolean parlay = false;

	private int patronOffset;

	private int patronSize;

	@Column(nullable=false)
	private Boolean quick = false;

	private int redact;

	@Column(nullable=false)
	private Boolean scrambleKeyPad = false;

	@Column(nullable=false)
	private Boolean swipeRequired = false;

	@Column(nullable=false, length=6)
	private String terminal;

	@Column(length=60)
	private String ticketLogo;

	@Lob
	private String timeZoneIndex;

	@Lob
	private String token;

	@Lob
	@Column(nullable=false)
	private String toteLinkVersion;

	@Lob
	@Column(nullable=false)
	private String toteVersion;

	private int transactionReceipts;

	private int unfundedTimeout;

	@Column(nullable=false)
	private Boolean video = false;

	public UtoteConfiguration() {
	}

	public int getIdUtoteConfiguration() {
		return this.idUtoteConfiguration;
	}

	public void setIdUtoteConfiguration(int idUtoteConfiguration) {
		this.idUtoteConfiguration = idUtoteConfiguration;
	}

	public Boolean getAccountCard() {
		return this.accountCard;
	}

	public void setAccountCard(Boolean accountCard) {
		this.accountCard = accountCard;
	}

	public int getAccountOffset() {
		return this.accountOffset;
	}

	public void setAccountOffset(int accountOffset) {
		this.accountOffset = accountOffset;
	}

	public int getAccountSize() {
		return this.accountSize;
	}

	public void setAccountSize(int accountSize) {
		this.accountSize = accountSize;
	}

	public int getAccountTimeout() {
		return this.accountTimeout;
	}

	public void setAccountTimeout(int accountTimeout) {
		this.accountTimeout = accountTimeout;
	}

	public Boolean getAssistance() {
		return this.assistance;
	}

	public void setAssistance(Boolean assistance) {
		this.assistance = assistance;
	}

	public String getBam() {
		return this.bam;
	}

	public void setBam(String bam) {
		this.bam = bam;
	}

	public Boolean getBrandTime() {
		return this.brandTime;
	}

	public void setBrandTime(Boolean brandTime) {
		this.brandTime = brandTime;
	}

	public Boolean getCancels() {
		return this.cancels;
	}

	public void setCancels(Boolean cancels) {
		this.cancels = cancels;
	}

	public int getCashReceipts() {
		return this.cashReceipts;
	}

	public void setCashReceipts(int cashReceipts) {
		this.cashReceipts = cashReceipts;
	}

	public Date getCurrentTime() {
		return this.currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public String getCustomerLogo() {
		return this.customerLogo;
	}

	public void setCustomerLogo(String customerLogo) {
		this.customerLogo = customerLogo;
	}

	public int getDateFormat() {
		return this.dateFormat;
	}

	public void setDateFormat(int dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDatePicture() {
		return this.datePicture;
	}

	public void setDatePicture(String datePicture) {
		this.datePicture = datePicture;
	}

	public String getDefaultEvent() {
		return this.defaultEvent;
	}

	public void setDefaultEvent(String defaultEvent) {
		this.defaultEvent = defaultEvent;
	}

	public Boolean getFractional() {
		return this.fractional;
	}

	public void setFractional(Boolean fractional) {
		this.fractional = fractional;
	}

	public Boolean getFunBets() {
		return this.funBets;
	}

	public void setFunBets(Boolean funBets) {
		this.funBets = funBets;
	}

	public int getFundedTimeout() {
		return this.fundedTimeout;
	}

	public void setFundedTimeout(int fundedTimeout) {
		this.fundedTimeout = fundedTimeout;
	}

	public Boolean getHasChannels() {
		return this.hasChannels;
	}

	public void setHasChannels(Boolean hasChannels) {
		this.hasChannels = hasChannels;
	}

	public Boolean getHasCurrencies() {
		return this.hasCurrencies;
	}

	public void setHasCurrencies(Boolean hasCurrencies) {
		this.hasCurrencies = hasCurrencies;
	}

	public Boolean getHasLanguages() {
		return this.hasLanguages;
	}

	public void setHasLanguages(Boolean hasLanguages) {
		this.hasLanguages = hasLanguages;
	}

	public int getIdUtoteAccount() {
		return this.idUtoteAccount;
	}

	public void setIdUtoteAccount(int idUtoteAccount) {
		this.idUtoteAccount = idUtoteAccount;
	}

	public int getIdUtoteAdvertisement() {
		return this.idUtoteAdvertisement;
	}

	public void setIdUtoteAdvertisement(int idUtoteAdvertisement) {
		this.idUtoteAdvertisement = idUtoteAdvertisement;
	}

	public int getIdUtoteContest() {
		return this.idUtoteContest;
	}

	public void setIdUtoteContest(int idUtoteContest) {
		this.idUtoteContest = idUtoteContest;
	}

	public int getIdUtoteDemand() {
		return this.idUtoteDemand;
	}

	public void setIdUtoteDemand(int idUtoteDemand) {
		this.idUtoteDemand = idUtoteDemand;
	}

	public int getIdUtoteLimit() {
		return this.idUtoteLimit;
	}

	public void setIdUtoteLimit(int idUtoteLimit) {
		this.idUtoteLimit = idUtoteLimit;
	}

	public Boolean getInquiry() {
		return this.inquiry;
	}

	public void setInquiry(Boolean inquiry) {
		this.inquiry = inquiry;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getLongTicket() {
		return this.longTicket;
	}

	public void setLongTicket(Boolean longTicket) {
		this.longTicket = longTicket;
	}

	public Boolean getManualLogOn() {
		return this.manualLogOn;
	}

	public void setManualLogOn(Boolean manualLogOn) {
		this.manualLogOn = manualLogOn;
	}

	public Boolean getMixed() {
		return this.mixed;
	}

	public void setMixed(Boolean mixed) {
		this.mixed = mixed;
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Boolean getParlay() {
		return this.parlay;
	}

	public void setParlay(Boolean parlay) {
		this.parlay = parlay;
	}

	public int getPatronOffset() {
		return this.patronOffset;
	}

	public void setPatronOffset(int patronOffset) {
		this.patronOffset = patronOffset;
	}

	public int getPatronSize() {
		return this.patronSize;
	}

	public void setPatronSize(int patronSize) {
		this.patronSize = patronSize;
	}

	public Boolean getQuick() {
		return this.quick;
	}

	public void setQuick(Boolean quick) {
		this.quick = quick;
	}

	public int getRedact() {
		return this.redact;
	}

	public void setRedact(int redact) {
		this.redact = redact;
	}

	public Boolean getScrambleKeyPad() {
		return this.scrambleKeyPad;
	}

	public void setScrambleKeyPad(Boolean scrambleKeyPad) {
		this.scrambleKeyPad = scrambleKeyPad;
	}

	public Boolean getSwipeRequired() {
		return this.swipeRequired;
	}

	public void setSwipeRequired(Boolean swipeRequired) {
		this.swipeRequired = swipeRequired;
	}

	public String getTerminal() {
		return this.terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getTicketLogo() {
		return this.ticketLogo;
	}

	public void setTicketLogo(String ticketLogo) {
		this.ticketLogo = ticketLogo;
	}

	public String getTimeZoneIndex() {
		return this.timeZoneIndex;
	}

	public void setTimeZoneIndex(String timeZoneIndex) {
		this.timeZoneIndex = timeZoneIndex;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToteLinkVersion() {
		return this.toteLinkVersion;
	}

	public void setToteLinkVersion(String toteLinkVersion) {
		this.toteLinkVersion = toteLinkVersion;
	}

	public String getToteVersion() {
		return this.toteVersion;
	}

	public void setToteVersion(String toteVersion) {
		this.toteVersion = toteVersion;
	}

	public int getTransactionReceipts() {
		return this.transactionReceipts;
	}

	public void setTransactionReceipts(int transactionReceipts) {
		this.transactionReceipts = transactionReceipts;
	}

	public int getUnfundedTimeout() {
		return this.unfundedTimeout;
	}

	public void setUnfundedTimeout(int unfundedTimeout) {
		this.unfundedTimeout = unfundedTimeout;
	}

	public Boolean getVideo() {
		return this.video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UtoteConfiguration [idUtoteConfiguration=").append(idUtoteConfiguration).append(", ");
		if (accountCard != null)
			builder.append("accountCard=").append(accountCard).append(", ");
		builder.append("accountOffset=").append(accountOffset).append(", accountSize=").append(accountSize)
				.append(", accountTimeout=").append(accountTimeout).append(", ");
		if (assistance != null)
			builder.append("assistance=").append(assistance).append(", ");
		if (bam != null)
			builder.append("bam=").append(bam).append(", ");
		if (brandTime != null)
			builder.append("brandTime=").append(brandTime).append(", ");
		if (cancels != null)
			builder.append("cancels=").append(cancels).append(", ");
		builder.append("cashReceipts=").append(cashReceipts).append(", ");
		if (currentTime != null)
			builder.append("currentTime=").append(currentTime).append(", ");
		if (customerLogo != null)
			builder.append("customerLogo=").append(customerLogo).append(", ");
		builder.append("dateFormat=").append(dateFormat).append(", ");
		if (datePicture != null)
			builder.append("datePicture=").append(datePicture).append(", ");
		if (defaultEvent != null)
			builder.append("defaultEvent=").append(defaultEvent).append(", ");
		if (fractional != null)
			builder.append("fractional=").append(fractional).append(", ");
		if (funBets != null)
			builder.append("funBets=").append(funBets).append(", ");
		builder.append("fundedTimeout=").append(fundedTimeout).append(", ");
		if (hasChannels != null)
			builder.append("hasChannels=").append(hasChannels).append(", ");
		if (hasCurrencies != null)
			builder.append("hasCurrencies=").append(hasCurrencies).append(", ");
		if (hasLanguages != null)
			builder.append("hasLanguages=").append(hasLanguages).append(", ");
		builder.append("idUtoteAccount=").append(idUtoteAccount).append(", idUtoteAdvertisement=")
				.append(idUtoteAdvertisement).append(", idUtoteContest=").append(idUtoteContest)
				.append(", idUtoteDemand=").append(idUtoteDemand).append(", idUtoteLimit=").append(idUtoteLimit)
				.append(", ");
		if (inquiry != null)
			builder.append("inquiry=").append(inquiry).append(", ");
		if (location != null)
			builder.append("location=").append(location).append(", ");
		if (longTicket != null)
			builder.append("longTicket=").append(longTicket).append(", ");
		if (manualLogOn != null)
			builder.append("manualLogOn=").append(manualLogOn).append(", ");
		if (mixed != null)
			builder.append("mixed=").append(mixed).append(", ");
		if (mode != null)
			builder.append("mode=").append(mode).append(", ");
		if (parlay != null)
			builder.append("parlay=").append(parlay).append(", ");
		builder.append("patronOffset=").append(patronOffset).append(", patronSize=").append(patronSize).append(", ");
		if (quick != null)
			builder.append("quick=").append(quick).append(", ");
		builder.append("redact=").append(redact).append(", ");
		if (scrambleKeyPad != null)
			builder.append("scrambleKeyPad=").append(scrambleKeyPad).append(", ");
		if (swipeRequired != null)
			builder.append("swipeRequired=").append(swipeRequired).append(", ");
		if (terminal != null)
			builder.append("terminal=").append(terminal).append(", ");
		if (ticketLogo != null)
			builder.append("ticketLogo=").append(ticketLogo).append(", ");
		if (timeZoneIndex != null)
			builder.append("timeZoneIndex=").append(timeZoneIndex).append(", ");
		if (token != null)
			builder.append("token=").append(token).append(", ");
		if (toteLinkVersion != null)
			builder.append("toteLinkVersion=").append(toteLinkVersion).append(", ");
		if (toteVersion != null)
			builder.append("toteVersion=").append(toteVersion).append(", ");
		builder.append("transactionReceipts=").append(transactionReceipts).append(", unfundedTimeout=")
				.append(unfundedTimeout).append(", ");
		if (video != null)
			builder.append("video=").append(video);
		builder.append("]");
		return builder.toString();
	}

}