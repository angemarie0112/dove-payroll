package com.dovePayroll.DoveTypes;

public class CompanyBenefit {
    private int benefitID;
	private String benefitName;
	private int benefitType;
	private int amount;
    private int companyID;
	private ArrayList<Employees> employees;

    public CompanyBenefit() {}
	public CompanyBenefit(int benefitID) {
		this.benefitID = benefitID;
	}

    public TaxRegion(String benefitName, int benefitType, int amount, int companyID,
        ArrayList<Employees> employees) {
        this.benefitName = benefitName;
        this.benefitType = benefitType;
        this.amount = amount;
        this.companyID = companyID;
        this.employees = employees;
    }

    public int getBenefitID() {
        return benefitID;
    }
    public void setBenefitID(int benefitID) {
        this.benefitID = benefitID;
    }
    public String getBenefitName() {
        return benefitName;
    }
    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
    }
    public int getBenefitType() {
        return benefitType;
    }
    public void setBenefitType(int benefitType) {
        this.benefitType = benefitType;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCompanyID() {
        return companyID;
    }
    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }
    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }
}
