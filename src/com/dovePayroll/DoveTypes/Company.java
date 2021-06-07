package com.dovePayroll.DoveTypes;

public class Company {
    private int companyID;
	private  Region region;
	private SubscriptionType subscriptionType;
	private ArrayList<Employees> employees;
	private ArrayList<CompanyBenefits> companyBenefits;
	private Subscription subscription;


public Company(){}
public Company(int companyID) {
	this.companyID = companyID;
}

public Company(Region region, SubscriptionType subscriptionType, Subscription subscription,
 ArrayList<Employees> employees, ArrayList<CompanyBenefits> companyBenefits) {
		this.region = region;
		this.subscriptionType = subscriptionType;
		this.subscription = subscription;
		this.employees = employees;
		this.companyBenefits = companyBenefits;
	}


	public int getcompanyID() {
		return companyID;
	}
	public void setcompanyID(int companyID) {
		this.companyID = companyID;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegionName(Region region) {
		this.region = region;
	}
	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	
	public void setEmployees(ArrayList<Employees> employees) {
		this.employees = employees;
	}

	public void setCompanyBenefits(ArrayList<CompanyBenefits> companyBenefits) {
		this.companyBenefits = companyBenefits;
	}

}