package com.dovePayroll.Models;

import java.sql.*;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.PaymentMethod;

public class PaymentMethod_Model extends DBConnect {
	private int[] addPaymentMethod (PaymentMethod method) {
        return null; // return the methodID and status
	}
	
	private int deletePaymentMethod(PaymentMethod method) throws SQLException {
		// create the update query string
		String sql = "UPDATE `paymentMethod` SET `employeeID`=?, `bankName`=?,`accountNumber`=?,`paymentMeans`=?,
        `salaryProfileObject`=?  WHERE `payMethodId` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setInt(1, method.getEmployeeID());
		ps.setString(2, method.getBankName());
		ps.setDouble(3, method.getAccountNumber());
		ps.setBoolean(4, method.getPaymentMeans());
        ps.setInt(4, method.getSalaryProfileObject());
		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	private int deleteCompanyBenefit(int paymentMethodID) throws SQLException {
		// create the deletion sql query
		String sql = "DELETE FROM `paymentMethod` WHERE `payMethodId`=?";

		// creating the prepared statement
		PreparedStatement ps = this.con().prepareStatement(sql);

		// setting the values for the prepared statement parameters
		ps.setInt(1, paymentMethodID);

		// executing the statement
		int rs = ps.executeUpdate();
		
		// closing the prepared statement and the connection
		this.con().close();
		ps.close();
		
		// returning the execution result
		return rs;
	}
	
	private String getCompanyBenefit(int payMethodId) throws SQLException {
		String sql = "SELECT * FROM `paymentMethod` WHERE `payMethodId`="+ payMethodId;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> thePaymentMethod = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			PaymentMethod tmpPaymentMethod = new PaymentMethod();
			int paymentMethodID = rs.getInt("paymentMethodID");
            int employeeID = rs.getInt("employeeID");
			String bankName = rs.getString("bankName");
			double accountNumber = rs.getDouble("accountNumber");
			boolean  paymentMeans = rs.getBoolean ("paymentMeans");
            int salaryProfileObject = rs.getInt("salaryProfileObject");
			
			tmpPaymentMethod.setPaymentMethodID(paymentMethodID);
			tmpPaymentMethod.setEmployeeID(employeeID);
			tmpPaymentMethod.setBankName(bankName);
			tmpPaymentMethod.setAccountNumber(accountNumber);
            tmpPaymentMethod.setPaymentMeans(paymentMeans);
			tmpPaymentMethod.setSalaryProfileObject(salaryProfileObject);
			
			// return the java object to json string
			Gson gs = new Gson();
			String PaymentMethodJson = gs.toJson(tmpPaymentMethod);
			
			// update the the region array list with the converted json string
			thePaymentMethod.add(PaymentMethodJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return thePaymentMethod.toString();	// return the tax region object
	}

	
	public String getAllPaymentMethods() throws SQLException{
		String sql = "SELECT * FROM `paymentMethod`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> thePaymentMethod = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			PaymentMethod tmpPaymentMethod = new PaymentMethod();
			int paymentMethodID = rs.getInt("paymentMethodID");
            int employeeID = rs.getInt("employeeID");
			String bankName = rs.getString("bankName");
			double accountNumber = rs.getDouble("accountNumber");
			boolean  paymentMeans = rs.getBoolean ("paymentMeans");
            int salaryProfileObject = rs.getInt("salaryProfileObject");
			
			tmpPaymentMethod.setPaymentMethodID(paymentMethodID);
			tmpPaymentMethod.setEmployeeID(employeeID);
			tmpPaymentMethod.setBankName(bankName);
			tmpPaymentMethod.setAccountNumber(accountNumber);
            tmpPaymentMethod.setPaymentMeans(paymentMeans);
			tmpPaymentMethod.setSalaryProfileObject(salaryProfileObject)
			
			// return the java object to json string
			Gson gs = new Gson();
			String PaymentMethodJson = gs.toJson(tmpPaymentMethod);
			
			// update the the region array list with the converted json string
			thePaymentMethod.add(PaymentMethodJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return thePaymentMethod.toString();	// return the tax region object
	}
}
