package com.dovePayroll.Models;

import java.sql.*;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.Company;

public class Company_Model extends DBConnect {
	private int[] addCompany(Company company) {
		return null; // return the companyId and addStatus
	}
	
	private int updateCompany(Company company) throws SQLException {
		// create the update query string
		String sql = "UPDATE `company`  WHERE `companyId` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setInt(4, region.getcompanyID());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	private int deleteCompany(int companyID) throws SQLException {
		// create the deletion sql query
		String sql = "DELETE FROM `company` WHERE `companyId`=?";

		// creating the prepared statement
		PreparedStatement ps = this.con().prepareStatement(sql);

		// setting the values for the prepared statement parameters
		ps.setInt(1, companyID);

		// executing the statement
		int rs = ps.executeUpdate();
		
		// closing the prepared statement and the connection
		this.con().close();
		ps.close();
		
		// returning the execution result
		return rs;
	}
	
	private String getCompany(int companyID) throws SQLException {
		String sql = "SELECT * FROM `company` WHERE `companyId`="+ companyID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theCompany = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Company tmpCompany = new Company();
			int cID = rs.getInt("companyID");
			
			tmpCompany.setCompanyID(cID);
			
			// return the java object to json string
			Gson gs = new Gson();
			String CompanyJson = gs.toJson(tmpCompany);
			
			// update the the company array list with the converted json string
			theCompany.add(CompanyJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theCompany.toString();	// return the company object
	}

private String getCompanyRegion(int regionId) throws SQLException {
		String sql = "SELECT * FROM `company` WHERE `regionId`="+ regionId;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theRegion = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Region region = new Region();
			int regionId = rs.getInt("regionId");
			String regionName = rs.getString("regionName");

			region.setRegionId(regionId);
			region.setUpperScheme(regionName);
			
			// return the java object to json string
			Gson gs = new Gson();
			String regionJson = gs.toJson(region);
			
			// update the the region with the converted json string
			theRegion.add(regionJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theRegion.toString();	// return the tax region object
	}
	

	private String getCompanySubscriptionType (int subscriptionType) throws SQLException {
		String sql = "SELECT * FROM `company` WHERE `subscriptionType`="+ subscriptionType;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscriptionType  = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			SubscriptionType subscriptionType = new SubscriptionType ();
			int typeID = rs.getInt("typeID");
		
			subscriptionType.setSubscriptionType(typeID);	
			
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionTypeJson = gs.toJson(subscriptionType);
			
			// update the the subscriptionType with the converted json string
			theSubscriptionType.add(subscriptionTypeJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscriptionType.toString();	// return the object
	}
	
	
private String getCompanyEmployees(int companyID) throws SQLException {
		String sql = "SELECT * FROM `employee` WHERE `companyId`="+ companyID;
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

private String getCompanyBenefits(int companyID) throws SQLException {
		String sql = "SELECT * FROM `companyBenefits` WHERE `companyId`="+ companyID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theCompanyBenefits = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			CompanyBenefits companyBenefits = new CompanyBenefits();
			// values to be extracted after company class is created
			
			// return the java object to json string
			Gson gs = new Gson();
			String companyBenefitsJson = gs.toJson(CompanyBenefits);
			
			// update the the region array list with the converted json string
			theCompanyBenefits.add(companyBenefitsJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return companyBenefitsJson.toString();	// return the tax region object
	}

private String companySubscription (int companyID) throws SQLException {
		String sql = "SELECT * FROM `subscriptions` WHERE `companyID`="+ companyID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscription = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Subscription subscription = new Subscription ();
			int subscriptionID = rs.getInt("subscriptionID"); 
			// is there anything we need to retrieve apart from subscriptionID??
			
			subscription.setSubscriptionID(subscriptionID);
			
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionIDJson = gs.toJson(subscription);
			
			// update the the paye array list with the converted json string
			theSubscription.add(subscriptionIDJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscription.toString();	// return the tax region object
	}

	public String getAllCompanies() throws SQLException{
		String sql = "SELECT * FROM `company`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theCompany = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			TCompany tmpCompany = new Company();
			int cID = rs.getInt("companyID");
			
			tmpCompany.setCompanyID(cID);
			
			// return the java object to json string
			Gson gs = new Gson();
			String CompanyJson = gs.toJson(tmpCompany);
			
			// update the the region array list with the converted json string
			theCompany.add(CompanyJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theCompany.toString();	// return the company region object
	}
}
