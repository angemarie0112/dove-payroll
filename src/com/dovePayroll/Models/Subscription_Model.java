package com.dovePayroll.Models;

import java.sql.*;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.Subscription;

public class Subscription_Model extends DBConnect {
	private int addSubscription(Subscription subscription) {
		// create the query string
		String sql = "INSERT INTO `subscriptions`(`status`, `timeRemaining`, `date`, `Created`, `lastUpdated`) VALUES (?,?,?,?,?)";

		// create a prepared statement for the insertion
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the values for the prepared statement
		ps.setInt(1, subscription.getStatus());
		ps.setDate(2, subscription.getTimeRemaining());
		ps.setDate(3, subscription.getDate());
		ps.setDate(4, subscription.getCreated());
		ps.setDate(5, subscription.getLastUpdated());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs
	}
	
	private int updateSubscription (Subscription subscription) throws SQLException {
		// create the update query string
		String sql = "UPDATE `subscriptions` SET `status`=?, `timeRemaining`=?, `date`=?, `Created`=?, `lastUpdated`=? WHERE `subscriptionID` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setInt(1, subscription.getStatus());
		ps.setDate(2, subscription.getTimeRemaining());
		ps.setDate(3, subscription.getDate());
		ps.setDate(4, subscription.getCreated());
		ps.setDate(5, subscription.getLastUpdated());
		ps.setInt(5, subscription.subscriptionID());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	private int deleteSubscription(int subscriptionID) throws SQLException {
		// create the deletion sql query
		String sql = "DELETE FROM `subscriptions` WHERE `subscriptionID`=?";

		// creating the prepared statement
		PreparedStatement ps = this.con().prepareStatement(sql);

		// setting the values for the prepared statement parameters
		ps.setInt(1, subscriptionID);

		// executing the statement
		int rs = ps.executeUpdate();
		
		// closing the prepared statement and the connection
		this.con().close();
		ps.close();
		
		// returning the execution result
		return rs;
	}
	
	private String getSubscription(int subscriptionID) throws SQLException {
		String sql = "SELECT * FROM `subscriptions` WHERE `subscriptionID`="+ subscriptionID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscription = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Subscription tmpSubscription = new Subscription();
			int subscriptionID = rs.getInt("subscriptionID");
			int status = rs.getInt("status");
			Date timeRemaining = rs.getDate("timeRemaining");
			Date date = rs.getDate("date");
			Date Created = rs.getDate("Created");
			Date lastUpdated = rs.getDate("lastUpdated");

			tmpSubscription.setSubscriptionID(subscriptionID);
			tmpSubscription.setStatus(status);
			tmpSubscription.setTimeRemaining(timeRemaining);
			tmpSubscription.setDate(date);
			tmpSubscription.setCreated(Created);
			tmpSubscription.setLastUpdated(lastUpdated);
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionJson = gs.toJson(tmpSubscription);
			
			// update the the company array list with the converted json string
			theSubscription.add(subscriptionJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscription.toString();	// return the company object
	}


	private String getSubscriptionSubscriptionType(int subscriptionTypeId) throws SQLException {
		String sql = "SELECT * FROM `subscriptions` WHERE `subscriptionTypeId`="+ subscriptionTypeId;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscriptionType = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			SubscriptionType  subscriptionType  = new SubscriptionType();
			// values to be extracted after company class is created
			
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionTypeJson = gs.toJson(subscriptionType);
			
			// update the the region array list with the converted json string
			theSubscriptionType.add(subscriptionTypeJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscriptionType.toString();	// return the tax region object
	}


	
	
	public String getAllSubscription() throws SQLException{
		String sql = "SELECT * FROM `subscriptions`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theSubscription = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			Subscription tmpSubscription = new Subscription();
			int subscriptionID = rs.getInt("subscriptionID");
			int status = rs.getInt("status");
			Date timeRemaining = rs.getDate("timeRemaining");
			Date date = rs.getDate("date");
			Date Created = rs.getDate("Created");
			Date lastUpdated = rs.getDate("lastUpdated");

			tmpSubscription.setSubscriptionID(subscriptionID);
			tmpSubscription.setStatus(status);
			tmpSubscription.setTimeRemaining(timeRemaining);
			tmpSubscription.setDate(date);
			tmpSubscription.setCreated(Created);
			tmpSubscription.setLastUpdated(lastUpdated);
			// return the java object to json string
			Gson gs = new Gson();
			String subscriptionJson = gs.toJson(tmpSubscription);
			
			// update the the company array list with the converted json string
			theSubscription.add(subscriptionJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theSubscription.toString();	// return the tax region object
	}
}
