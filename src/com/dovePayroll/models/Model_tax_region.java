package com.dovePayroll.models;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dovePayroll.doveTypes.TaxRegion;

public class Model_tax_region extends DBConnect {
	private int addTaxRegion(TaxRegion region) throws SQLException {
		// create the query string
		String sql = "INSERT INTO `taxRegion`(`payeId`, `pensionRate`, `medicalInsuranceRate`) VALUES (?,?,?)";

		// create a prepared statement for the insertion
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the values for the prepared statement
		ps.setInt(1, region.getPaye().getPayeID());
		ps.setDouble(2, region.getPensionRate());
		ps.setDouble(3, region.getMedicalInsurance());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the insertion status
	}
	
	private int updateTaxRegion(TaxRegion region) throws SQLException {
		// create the update query string
		String sql = "UPDATE `taxRegion` SET `pensionRate`=?,`medicalInsuranceRate`=? WHERE `regionId` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setDouble(1, region.getPensionRate());
		ps.setDouble(2, region.getMedicalInsurance());
		ps.setInt(3, region.getRegionID());

		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	private int deleteTaxRegion(int regionID) throws SQLException {
		// create the deletion sql query
		String sql = "DELETE FROM `taxRegion` WHERE `regionId`=?";

		// creating the prepared statement
		PreparedStatement ps = this.con().prepareStatement(sql);

		// setting the values for the prepared statement parameters
		ps.setInt(1, regionID);
		
		// executing the statement
		int rs = ps.executeUpdate();
		
		// closing the prepared statement and the connection
		this.con().close();
		ps.close();
		
		// returning the execution result
		return rs;
	}
	
	private TaxRegion getTaxRegion(int regionID) {
		return null; // return the tax region object
	}
	
	public static ArrayList<TaxRegion> getAllTaxRegion(){
		return null; // return an array list of TaxRegion objects
	}
}
