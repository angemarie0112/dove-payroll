package com.dovePayroll.DoveTypes;

public class PAYE {
	private int payeID;
	private String upperScheme, middleScheme, lowerScheme;
	
	//default PAYE constructor
	public PAYE() {}
//PAYE constructor with only ID
	public PAYE(int payeID) {
		this.payeID = payeID;
	}
//PAYE constructor without ID
	public PAYE(String upperScheme, String middleScheme, String lowerScheme) {
		this.upperScheme = upperScheme;
		this.middleScheme = middleScheme;
		this.lowerScheme = lowerScheme;
	}
//Getters and setters
	public int getPayeID() {
		return payeID;
	}

	public void setPayeID(int payeID) {
		this.payeID = payeID;
	}

	public String getUpperScheme() {
		return upperScheme;
	}

	public void setUpperScheme(String upperScheme) {
		this.upperScheme = upperScheme;
	}

	public String getMiddleScheme() {
		return middleScheme;
	}

	public void setMiddleScheme(String middleScheme) {
		this.middleScheme = middleScheme;
	}

	public String getLowerScheme() {
		return lowerScheme;
	}

	public void setLowerScheme(String lowerScheme) {
		this.lowerScheme = lowerScheme;
	}
}
	

