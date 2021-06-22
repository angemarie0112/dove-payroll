package com.dovePayroll.DoveTypes;

public class Subscription {
    private int subscriptionID;
	private SubscriptionType subscriptionType;
	private int status;
	private Date timeRemaining, date, Created, lastUpdated;

    public Subscription() {}
	public Subscription(int subscriptionID) {
		this.subscriptionID = subscriptionID;
	}

    public TaxRegion(SubscriptionType subscriptionType, int status, Date timeRemaining, Date date, Date Created,
			Date lastUpdated) {
		this.subscriptionType = subscriptionType;
		this.status = status;
		this.timeRemaining = timeRemaining;
		this.date = date;
		this.Created = Created;
		this.lastUpdated = lastUpdated;
	}

    public int getSubscriptionID() {
		return subscriptionID;
	}
	public void setSubscriptionID(int subscriptionID) {
		this.subscriptionID = subscriptionID;
	}
	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getTimeRemaining() {
		return timeRemaining;
	}
	public void setTimeRemaining(Date timeRemaining) {
		this.timeRemaining = timeRemaining;
	}

    public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    public Date getCreated() {
		return Created;
	}
	public void setCreated(Date Created) {
		this.Created = Created;
	}

    public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
}
