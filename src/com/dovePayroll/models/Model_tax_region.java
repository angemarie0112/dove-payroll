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

		return rs; // return the regionId and status
	}
	
	private int updateTaxRegion(TaxRegion region) {
		return 1; // return an integer value representing the status of the update
	}
	
	private int deleteTaxRegion(int regionID) {
		return 1; // return an integer value representing the deletion status
	}
	
	private TaxRegion getTaxRegion(int regionID) {
		return null; // return the tax region object
	}
	
	public static ArrayList<TaxRegion> getAllTaxRegion(){
		return null; // return an array list of TaxRegion objects
	}
}
