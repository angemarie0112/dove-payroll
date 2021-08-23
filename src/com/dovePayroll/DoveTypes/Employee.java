
package com.dovePayroll.DoveTypes;

/**
 *
 * @author rafiki
 */
public class Employee {
    private int employeeID;
    private int position;
    private String  basicInfo;
    private Company company;
    private NextOfKin nextOfKin;
    private SalaryProfile salaryProfile;
    
    //Default Employee constructor
    public Employee(){}
    //Employee constructor with only ID

    public Employee(int employeeID) {
        this.employeeID = employeeID;
    }
    
    //Employee constructor without ID

    public Employee(int position, String basicInfo, Company company, NextOfKin nextOfKin, SalaryProfile salaryProfile) {
        this.position = position;
        this.basicInfo = basicInfo;
        this.company = company;
        this.nextOfKin = nextOfKin;
        this.salaryProfile = salaryProfile;
    }
    
    //Getter and setters

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public NextOfKin getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(NextOfKin nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public SalaryProfile getSalaryProfile() {
        return salaryProfile;
    }

    public void setSalaryProfile(SalaryProfile salaryProfile) {
        this.salaryProfile = salaryProfile;
    }
    
}
