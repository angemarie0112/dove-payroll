<<<<<<< HEAD
package com.dovePayroll.doveTypes;
=======
package com.dovePayroll.DoveTypes;
>>>>>>> 661616c463ebfff703b0c793a436c32d84a87b44

import java.util.ArrayList;

public class TaxRegion {
	private int regionID;
	private String regionName;
	private PAYE paye;
	private double pensionRate, medicalInsurance;
	private ArrayList<Company> company;
	
	public TaxRegion() {}
	public TaxRegion(int regionID) {
		this.regionID = regionID;
	}
	public TaxRegion(String regionName, PAYE paye, double pensionRate, double medicalInsurance,
			ArrayList<Company> company) {
		this.regionName = regionName;
		this.paye = paye;
		this.pensionRate = pensionRate;
		this.medicalInsurance = medicalInsurance;
		this.company = company;
	}
	
	public int getRegionID() {
		return regionID;
	}
	public void setRegionID(int regionID) {
		this.regionID = regionID;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public PAYE getPaye() {
		return paye;
	}
	public void setPaye(PAYE paye) {
		this.paye = paye;
	}
	public double getPensionRate() {
		return pensionRate;
	}
	public void setPensionRate(double pensionRate) {
		this.pensionRate = pensionRate;
	}
	public double getMedicalInsurance() {
		return medicalInsurance;
	}
	public void setMedicalInsurance(double medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}
	public ArrayList<Company> getCompany() {
		return company;
	}
	public void setCompany(ArrayList<Company> company) {
		this.company = company;
	}
	
	
	
	
}
