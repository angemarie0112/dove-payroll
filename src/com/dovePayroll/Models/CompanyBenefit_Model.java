package com.dovePayroll.Models;

import java.sql.*;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.CompanyBenefit;

public class CompanyBenefit_Model extends DBConnect {
	private int addCompanyBenefit(CompanyBenefit cbenefit) {
		// create the query string
		String sql = "INSERT INTO `companyBenefits`(`name`, `type`, `cost`, `companyId`) VALUES (?,?,?,?)";
	
		// create a prepared statement for the insertion
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the values for the prepared statement
		ps.setString(1, cbenefit.getBenefitName());
		ps.setInt(2, cbenefit.getBenefitType());
		ps.setInt(3, cbenefit.getAmount());
		ps.setInt(4, cbenefit.getCompanyID());
	

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs
	}
	
	private int updateCompanyBenefit (CompanyBenefit cbenefit) throws SQLException {
		// create the update query string
		String sql = "UPDATE `companyBenefits` SET `name`=?, `type`=?, `amount`=?, `companyId`=?, WHERE `benefitId` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setString(1, cbenefit.getBenefitName());
		ps.setInt(2, cbenefit.getBenefitType());
		ps.setInt(3, cbenefit.getAmount());
		ps.setInt(4, cbenefit.getCompanyID());
		ps.setInt(5, cbenefit.getBenefitID());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	private int deleteCompanyBenefit(int benefitID) throws SQLException {
		// create the deletion sql query
		String sql = "DELETE FROM `companyBenefits` WHERE `benefitId`=?";

		// creating the prepared statement
		PreparedStatement ps = this.con().prepareStatement(sql);

		// setting the values for the prepared statement parameters
		ps.setInt(1, benefitID);

		// executing the statement
		int rs = ps.executeUpdate();
		
		// closing the prepared statement and the connection
		this.con().close();
		ps.close();
		
		// returning the execution result
		return rs;
	}
	
	private String getCompanyBenefit(int benefitID) throws SQLException {
		String sql = "SELECT * FROM `companyBenefits` WHERE `benefitId`="+ benefitID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theCompanyBenefit = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			CompanyBenefit tmpBenefit = new CompanyBenefit();
			int benefitID = rs.getInt("benefitID");
			String benefitName = rs.getString("benefitName");
			int benefitType = rs.getInt("benefitType");
			int amount = rs.getInt("amount");
			int companyID = rs.getInt("companyID");

			tmpBenefit.setBenefitID(benefitID);
			tmpBenefit.setBenefitName(benefitName);
			tmpBenefit.setBenefitType(benefitType);
			tmpBenefit.setAmount(amount);
			tmpBenefit.setCompanyID(companyID);
			// return the java object to json string
			Gson gs = new Gson();
			String CompanyBenefitJson = gs.toJson(tmpSubscription);
			
			// update the the company array list with the converted json string
			theCompanyBenefit.add(CompanyBenefitJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theCompanyBenefit.toString();	// return the company object
	}

	private String getCompanyBenefitEmployees(int benefitID) throws SQLException {
			String sql = "SELECT * FROM `employeeBenefits` WHERE `benefitId`="+ benefitID;
			java.sql.Statement st = this.con().createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			ArrayList<String> theEmployees = new ArrayList<>();
			
			while(rs.next()) {
				// creating objects of the fetched values
				Employees employees = new Employees();
				// values to be extracted after company class is created
				
				// return the java object to json string
				Gson gs = new Gson();
				String employeesJson = gs.toJson(employees);
				
				// update the the region array list with the converted json string
				theEmployees.add(employeesJson);
			}
			
			// closing the statement and the connection
			this.con().close();
			st.close();
			
			return employeesJson.toString();	// return the tax region object
		}



	
	public String getAllCompanyBenefits() throws SQLException{
		String sql = "SELECT * FROM `companyBenefits`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theCompanyBenefit = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			CompanyBenefit tmpBenefit = new CompanyBenefit();
			int benefitID = rs.getInt("benefitID");
			String benefitName = rs.getString("benefitName");
			int benefitType = rs.getInt("benefitType");
			int amount = rs.getInt("amount");
			int companyID = rs.getInt("companyID");

			tmpBenefit.setBenefitID(benefitID);
			tmpBenefit.setBenefitName(benefitName);
			tmpBenefit.setBenefitType(benefitType);
			tmpBenefit.setAmount(amount);
			tmpBenefit.setCompanyID(companyID);
			// return the java object to json string
			Gson gs = new Gson();
			String CompanyBenefitJson = gs.toJson(tmpBenefit);
			
			// update the the company array list with the converted json string
			theCompanyBenefit.add(CompanyBenefitJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theCompanyBenefit.toString();	// return the tax region object
	}
}
