package com.dovePayroll.Models;

import java.sql.*;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.SubscriptionType;

public class SubscriptionType_Model extends DBConnect {
	private int addSubscriptionTypes(SubscriptionType subscriptionType) {
		String sql = "INSERT INTO `subscriptiontypes`(`subscriptiontype`, `cost`) VALUES (?,?)";

		// create a prepared statement for the insertion
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the values for the prepared statement
		ps.setInt(1, subscriptionType.getSubscriptionType());
		ps.setInt(2, subscriptionType.getCost());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the insertion status
	}
	
	private int updateSubscriptionType (SubscriptionType subscriptionType) throws SQLException {
		// create the update query string
		String sql = "UPDATE `subscriptiontypes` SET `subscriptionType`=?, `cost`=? WHERE `typeID` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setInt(1, subscriptionType.getSubscriptionType());
		ps.setInt(2, subscriptionType.getCost());
		ps.setInt(3, subscriptionType.getTypeID());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	private int deleteSubscriptionType(int typeID) throws SQLException {
		// create the deletion sql query
		String sql = "DELETE FROM `subscriptiontypes` WHERE `typeID`=?";

		// creating the prepared statement
		PreparedStatement ps = this.con().prepareStatement(sql);

		// setting the values for the prepared statement parameters
		ps.setInt(1, typeID);

		// executing the statement
		int rs = ps.executeUpdate();
		
		// closing the prepared statement and the connection
		this.con().close();
		ps.close();
		
		// returning the execution result
		return rs;
	}
	
	private String getSubscriptionType(int typeID) throws SQLException {
		String sql = "SELECT * FROM `subscriptiontypes` WHERE `typeID`="+ typeID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscriptionType = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			SubscriptionType tmpSubscriptionType = new SubscriptionType();
			int stypeID = rs.getInt("typeID");
			int subscriptionType = rs.getInt("subscriptionType");
			int cost = rs.getInt("cost");

			tmpSubscriptionType.setTypeID(stypeID);
			tmpSubscriptionType.setSubscriptionType(subscriptionType);
			tmpSubscriptionType.setCost(cost);
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionTypeJson = gs.toJson(tmpSubscriptionType);
			
			// update the the company array list with the converted json string
			theSubscriptionType.add(subscriptionTypeJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscriptionType.toString();	// return the company object
	}


	private String getSubscriptionTypeSubscription(int typeID) throws SQLException {
		String sql = "SELECT * FROM `subscriptions` WHERE `subscriptionTypeId`="+ typeID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscription = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Subscription subscription = new Subscription();
			// values to be extracted after company class is created
			
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionJson = gs.toJson(subscription);
			
			// update the the region array list with the converted json string
			theSubscription.add(subscriptionJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscription.toString();	// return the tax region object
	}

	private String getSubscriptionTypeCompanies(int subscriptionType) throws SQLException {
		String sql = "SELECT * FROM `company` WHERE `subscriptionType`="+ subscriptionType;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theCompanies = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Company company = new Company();
			// values to be extracted after company class is created
			
			// return the java object to json string
			Gson gs = new Gson();
			String companyJson = gs.toJson(company);
			
			// update the the region array list with the converted json string
			theCompanies.add(companyJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theCompanies.toString();	// return the tax region object
	}

	
	public String getAllSubscriptionType() throws SQLException{
		String sql = "SELECT * FROM `subscriptiontypes`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscriptionType = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			SubscriptionType tmpSubscriptionType = new SubscriptionType();
			int stypeID = rs.getInt("typeID");
			int subscriptionType = rs.getInt("subscriptionType");
			int cost = rs.getInt("cost");

			tmpSubscriptionType.setTypeID(stypeID);
			tmpSubscriptionType.setSubscriptionType(subscriptionType);
			tmpSubscriptionType.setCost(cost);
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionTypeJson = gs.toJson(tmpSubscriptionType);
			
			// update the the company array list with the converted json string
			theSubscriptionType.add(subscriptionTypeJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscriptionType.toString();	// return the tax region object
	}
}
