package com.dovePayroll.DoveTypes;

import java.util.ArrayList;

public class PaymentMethod {
	private int employeeID;
	private int paymentMethodID;
	private String bankName;
	private double accountNumber;
	private boolean paymentMeans;
	private int salaryProfileObject;

	
	public PaymentMethod() {}
	public PaymentMethod(int paymentMethodID) {
		this.paymentMethodID = paymentMethodID;
	}
	public PaymentMethod(int employeeID, String bankName, double accountNumber, boolean paymentMeans,
			int salaryProfileObject) {
		this.employeeID = employeeID;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.paymentMeans = paymentMeans;
		this.salaryProfileObject = salaryProfileObject;
	}
	
	public int getPaymentMethodID() {
		return paymentMethodID;
	}
	public void setPaymentMethodID(int paymentMethodID) {
		this.paymentMethodID = paymentMethodID;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public double  getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double  accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean getPaymentMeans() {
		return paymentMeans;
	}
	public void setPaymentMeans(boolean  paymentMeans) {
		this.paymentMeans = paymentMeans;
	}
	public int getSalaryProfileObject() {
		return salaryProfileObject;
	}
	public void setSalaryProfileObject(int salaryProfileObject) {
		this.salaryProfileObject = salaryProfileObject;
	}	
	
}
