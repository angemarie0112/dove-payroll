package com.dovePayroll.Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dovePayroll.DoveTypes.PAYE;
import com.google.gson.Gson;
//add new PAYE
public class PAYE_model extends DBConnect {
	@SuppressWarnings("unused")
	private int addPaye(PAYE paye) throws ClassNotFoundException, SQLException {
		// create the insert query string
				String sql="INSERT INTO paye(upperScheme,middleScheme, lowerScheme) VALUES(?,?,?)";
	
				//create the prepared statement for the update
				PreparedStatement ps=this.con().prepareStatement(sql);
				
				//set the variable for the prepared statement
				ps.setString(1, paye.getUpperScheme());
				ps.setString(2, paye.getMiddleScheme());
				ps.setString(3, paye.getLowerScheme());
				//execute the prepared statement
				int rs=ps.executeUpdate();
				
				//close the connection and the prepared statement
				this.con().close();
				
				return rs;
				
	}
	//update PAYE
	@SuppressWarnings("unused")
	private int updatePaye(PAYE paye) throws ClassNotFoundException, SQLException {
		//create the update query string
		String sql="UPDATE `paye` SET `upperScheme`=?,`middleScheme`=?, `lowerScheme`=? WHERE `payeID`=?";
		
		//create the prepared statement for the update
		PreparedStatement ps=this.con().prepareStatement(sql);
		
		//set the variable for the prepared statement
		ps.setString(1, paye.getUpperScheme());
		ps.setString(2, paye.getMiddleScheme());
		ps.setString(3, paye.getLowerScheme());
		
		//execute the prepared statement
		int rs=ps.executeUpdate();
		
		//close the connection and the prepared statement
		this.con().close();
		ps.close();
		return rs;
		
	}
	
	//delete PAYE by id
	@SuppressWarnings("unused")
	private int deletePaye(int payeId) throws ClassNotFoundException, SQLException {
		//create the deletion sql query
		String sql= "DELETE FROM `paye` WHERE `payeID`=?";
		
		//creating prepared ststement
		PreparedStatement ps=this.con().prepareStatement(sql);
		
		//setting the value for prepared statement parameters
		ps.setInt(1, payeId);
		
		//executing the statement
		int rs=ps.executeUpdate();
		
		//closing the prepared statement and dthe connection
		this.con().close();
		ps.close();
		
		//returning the execution result
		
		return rs;
	}
	
	//get PAYE by id
	@SuppressWarnings("unused")
	private String getPaye(int payeId) throws ClassNotFoundException, SQLException {
		//selection  PAYE by id sql statement
		String sql="SELECT * FROM `paye` WHERE `payeID`=?"+payeId;
		Statement st=this.con().createStatement();
		ResultSet rs=st.executeQuery(sql);
		ArrayList<String>thePaye=new ArrayList<>();
		while(rs.next()) {
			
			//creating objects of the fetched values
			PAYE tmpPaye=new PAYE();
			int pID=rs.getInt("payeId");
			String upperScheme=rs.getString("upperScheme");
			String middleScheme=rs.getString("middleScheme");
			String lowerScheme=rs.getString("lowerScheme");
			
			tmpPaye.setPayeID(pID);
			tmpPaye.setLowerScheme(lowerScheme);
			tmpPaye.setMiddleScheme(middleScheme);
			tmpPaye.setUpperScheme(upperScheme);
			
			//return the java object to json string
			Gson gs= new Gson();
			String payeJson=gs.toJson(tmpPaye);
			
			//updating the paye array list with the converted json string
			thePaye.add(payeJson);
			//closing the statement and the connection
	
		}
		this.con().close();
		st.close();
		return thePaye.toString(); //return the paye object
	}
	
	
	public  String getAllPaye() throws ClassNotFoundException, SQLException {
		String sql="SELECT * FROM `paye`";
		Statement st= this.con().createStatement();
		ResultSet rs=st.executeQuery(sql);
		ArrayList<String>thePaye=new ArrayList<>();
		while(rs.next()) {
			//creating ojects of the fetched values
			PAYE tmpPaye=new PAYE();
			int pID=rs.getInt("payeId");
			String upperScheme=rs.getString("upperScheme");
			String middleScheme=rs.getString("middleScheme");
			String lowerScheme=rs.getString("lowerScheme");
			
			tmpPaye.setPayeID(pID);
			tmpPaye.setLowerScheme(lowerScheme);
			tmpPaye.setMiddleScheme(middleScheme);
			tmpPaye.setUpperScheme(upperScheme);
			
			//return the java object to json string
			Gson gs= new Gson();
			String payeJson=gs.toJson(tmpPaye);
			
			//updating the paye array list with the converted json string
			thePaye.add(payeJson);
		}
		//closing the statement and the connection
		this.con().close();
		st.close();
		return thePaye.toString(); //return the paye object
	}

}
