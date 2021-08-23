package com.dovePayroll.Models;

import java.sql.*;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.Company;
import com.dovePayroll.DoveTypes.PAYE;
import com.dovePayroll.DoveTypes.TaxRegion;
import com.google.gson.Gson;
public class TaxRegion_Model extends DBConnect {
	@SuppressWarnings("unused")
	private int addTaxRegion(TaxRegion region) throws ClassNotFoundException, SQLException {
		// create the insert query string
		String sql="INSERT INTO taxRegion(regionName,pensionRate, medicalInsuranceRate) VALUES(?,?,?)";
		
		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
				ps.setString(1, region.getRegionName());
				ps.setDouble(2, region.getPensionRate());
				ps.setDouble(3, region.getMedicalInsurance());
				ps.setInt(4, region.getRegionID());
				
				// execute the prepared statement 
				int rs = ps.executeUpdate();
				
				// close the connection and the prepared statement
				this.con().close();
				ps.close();
		        return rs; // return the regionId and status
	}
	
	@SuppressWarnings("unused")
	private int updateTaxRegion(TaxRegion region) throws SQLException, ClassNotFoundException {
		// create the update query string
		String sql = "UPDATE `taxRegion` SET `regionName`=?, `pensionRate`=?,`medicalInsuranceRate`=? WHERE `regionId` = ?";

		// create the prepared statement for the update
		PreparedStatement ps = this.con().prepareStatement(sql);

		// set the variables for the prepared statement
		ps.setString(1, region.getRegionName());
		ps.setDouble(2, region.getPensionRate());
		ps.setDouble(3, region.getMedicalInsurance());
		ps.setInt(4, region.getRegionID());
		// execute the prepared statement 
		int rs = ps.executeUpdate();

		// close the connection and the prepared statement
		this.con().close();
		ps.close();

		return rs; // return the update status
	}
	
	@SuppressWarnings("unused")
	private int deleteTaxRegion(int regionID) throws SQLException, ClassNotFoundException {
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
	
	@SuppressWarnings("unused")
	private String getTaxRegion(int regionID) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM `taxRegion` WHERE `regionId`="+ regionID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theRegion = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			TaxRegion tmpRegion = new TaxRegion();
			int rID = rs.getInt("regionId");
			String regionName = rs.getString("regionName");
			double pensionRate = rs.getDouble("pensionRate");
			double medicalInsurance = rs.getDouble("medicalInsuranceRate");
			
			tmpRegion.setRegionID(rID);
			tmpRegion.setRegionName(regionName);
			tmpRegion.setPensionRate(pensionRate);
			tmpRegion.setMedicalInsurance(medicalInsurance);
			
			// return the java object to json string
			Gson gs = new Gson();
			String taxRegionJson = gs.toJson(tmpRegion);
			
			// update the the region array list with the converted json string
			theRegion.add(taxRegionJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theRegion.toString();	// return the tax region object
	}

	@SuppressWarnings("unused")
	private String getRegionCompanies(int regionID) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM `company` WHERE `regionId`="+ regionID;
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

	@SuppressWarnings("unused")
	private String getRegionPaye(int regionID) throws SQLException, ClassNotFoundException {
		String sql = "SELECT * FROM `paye` WHERE `regionId`="+ regionID;
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> thePaye = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			PAYE paye = new PAYE();
			int payeId = rs.getInt("payeId");
			String upperScheme = rs.getString("upperScheme");
			String middleScheme = rs.getString("middleScheme");
			String lowerScheme = rs.getString("lowerScheme");
			
			paye.setPayeID(payeId);
			paye.setUpperScheme(upperScheme);
			paye.setMiddleScheme(middleScheme);
			paye.setLowerScheme(lowerScheme);
			
			// return the java object to json string
			Gson gs = new Gson();
			String payeJson = gs.toJson(paye);
			
			// update the the paye array list with the converted json string
			thePaye.add(payeJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return thePaye.toString();	// return the tax region object
	}
	
	public String getAllTaxRegion() throws SQLException, ClassNotFoundException{
		String sql = "SELECT * FROM `taxRegion`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<String> theRegion = new ArrayList<>();
		
		while(rs.next()) {
			// creating objects of the fetched values
			TaxRegion tmpRegion = new TaxRegion();
			int rID = rs.getInt("regionId");
			String regionName = rs.getString("regionName");
			double pensionRate = rs.getDouble("pensionRate");
			double medicalInsurance = rs.getDouble("medicalInsuranceRate");
			
			tmpRegion.setRegionID(rID);
			tmpRegion.setRegionName(regionName);
			tmpRegion.setPensionRate(pensionRate);
			tmpRegion.setMedicalInsurance(medicalInsurance);
			
			// return the java object to json string
			Gson gs = new Gson();
			String taxRegionJson = gs.toJson(tmpRegion);
			
			// update the the region array list with the converted json string
			theRegion.add(taxRegionJson);
		}
		
		// closing the statement and the connection
		this.con().close();
		st.close();
		
		return theRegion.toString();	// return the tax region object
	}
}
