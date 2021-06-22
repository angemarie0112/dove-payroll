package com.dovePayroll.DoveTypes;

public class SubscriptionType {
    private int typeID;
	private int subscriptionType;
	private int cost;
	private ArrayList<Subscription> subscription;
    private ArrayList<Company> companies;

    public SubscriptionType() {}
	public SubscriptionType(int typeID) {
		this.typeID = typeID;
	}

public TaxRegion(int subscriptionType, int cost, ArrayList<Subscription> subscription,ArrayList<Company> companies) {
    this.subscriptionType = subscriptionType;
    this.cost = cost;
    this.subscription = subscription;
    this.companies = companies;
    }  


    public int gettypeID() {
		return typeID;
	}
	public void settypeID(int typeID) {
		this.typeID = typeID;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	
    public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

    public ArrayList<Subscription> getSubscription() {
		return subscription;
	}
	public void setSubscription(ArrayList<Subscription> subscription) {
		this.subscription = subscription;
	}

    public ArrayList<Company> getCompanies() {
		return companies;
	}
	public void setSubscription(ArrayList<Company> companies) {
		this.companies = companies;
	}
}
