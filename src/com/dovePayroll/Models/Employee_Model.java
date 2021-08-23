


package com.dovePayroll.Models;

import com.dovePayroll.DoveTypes.Employee;
import java.sql.*;

/**
 *
 * @author rafiki
 */
public class Employee_Model  extends DBConnect {
    private int  addEmployee(Employee employee) throws SQLException, ClassNotFoundException{
        //create the inser query string
        String sql="INSERT INTO  employee (position,basicInfo) VALUES(?,?)";
        //Create preparedStatement for the save
        PreparedStatement ps = this.con().prepareStatement(sql);
        
        //set the variables for the prepared statement
        
        ps.setInt(1, employee.getPosition());
        ps.setString(2, employee.getBasicInfo());
        //execute the prepared statement
        int rs=ps.executeUpdate();
        //close the connection and the prepared sttement
        this.con().close();
        ps.close();
        //Return the  employee ID and status
  return rs;
    }
    
     private int  updateEmployee(Employee employee) throws SQLException, ClassNotFoundException{
        //create the inser query string
        String sql= "UPDATE `employee` SET `position=?`, `basicInfo=?` WHERE `employeeID=?`";
        //Create preparedStatement for the update
        PreparedStatement ps = this.con().prepareStatement(sql);
        
        //set the variables for the prepared statement
        
        ps.setInt(1, employee.getPosition());
        ps.setString(2, employee.getBasicInfo());
        
        //execute the prepared statement
        int rs=ps.executeUpdate();
        //close the connection and the prepared sttement
        this.con().close();
        ps.close();
        //Return the  employee ID and status
  return rs;
    }
     
     //delete EMployee by id
	private int deleteEmployee(int employeeID) throws ClassNotFoundException, SQLException {
		//create the deletion sql query
		String sql= "DELETE FROM `employee` WHERE `employeeID`=?";
		
		//creating prepared ststement
		PreparedStatement ps=this.con().prepareStatement(sql);
		
		//setting the value for prepared statement parameters
		ps.setInt(1, employeeID);
		
		//executing the statement
		int rs=ps.executeUpdate();
		
		//closing the prepared statement and dthe connection
		this.con().close();
		ps.close();
		
		//returning the execution result
		
		return rs;
	}
     
}

