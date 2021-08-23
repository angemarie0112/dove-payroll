
package com.dovePayroll.DoveTypes;

/**
 *
 * @author rafiki
 */
public class NextOfKin {
    private int kinID;
    private int employeeID;
    private String basicInfo;
    
    //Default constructor

    public NextOfKin() {
    }
    
    //COnstructor with ID

    public NextOfKin(int kinID) {
        this.kinID = kinID;
    }
    
    //Generate constructor without  ID 

    public NextOfKin(int employeeID, String basicInfo) {
        this.employeeID = employeeID;
        this.basicInfo = basicInfo;
    }

    public int getKinID() {
        return kinID;
    }

    public void setKinID(int kinID) {
        this.kinID = kinID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo;
    }
   
    
}
