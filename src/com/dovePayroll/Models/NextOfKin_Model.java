


package com.dovePayroll.Models;

import com.dovePayroll.DoveTypes.Employee;
import com.dovePayroll.DoveTypes.NextOfKin;
import com.google.gson.Gson;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author rafiki
 */
public class NextOfKin_Model  extends DBConnect {
    private int  addNextOfKin(NextOfKin nextOfKin) throws SQLException, ClassNotFoundException{
        //create the inser query string
        String sql="INSERT INTO  nextOfKin (employeeID,basicInfo) VALUES(?,?)";
        //Create preparedStatement for the save
        PreparedStatement ps = this.con().prepareStatement(sql);
        
        //set the variables for the prepared statement
        
        ps.setInt(1, nextOfKin.getEmployeeID());
        ps.setString(2, nextOfKin.getBasicInfo());
        //execute the prepared statement
        int rs=ps.executeUpdate();
        //close the connection and the prepared sttement
        this.con().close();
        ps.close();
        //Return the  employee ID and status
  return rs;
    }
    
     private int  updateNextOfKin(NextOfKin nextOfKin) throws SQLException, ClassNotFoundException{
        //create the insert query string
        String sql= "UPDATE `nextOfKin` SET `employeeID=?`, `basicInfo=?` WHERE `kinID=?`";
        //Create preparedStatement for the update
        PreparedStatement ps = this.con().prepareStatement(sql);
        
        //set the variables for the prepared statement
        
        ps.setInt(1, nextOfKin.getEmployeeID());
        ps.setString(2, nextOfKin.getBasicInfo());
        
        //execute the prepared statement
        int rs=ps.executeUpdate();
        //close the connection and the prepared sttement
        this.con().close();
        ps.close();
        //Return the  Kin  ID and status
  return rs;
    }
     
     //delete NextOfKin by id
	private int deleteNextOfKin(int kinID) throws ClassNotFoundException, SQLException {
		//create the deletion sql query
		String sql= "DELETE FROM `nextOfKin` WHERE `kinID`=?";
		
		//creating prepared ststement
		PreparedStatement ps=this.con().prepareStatement(sql);
		
		//setting the value for prepared statement parameters
		ps.setInt(1, kinID);
		
		//executing the statement
		int rs=ps.executeUpdate();
		
		//closing the prepared statement and dthe connection
		this.con().close();
		ps.close();
		
		//returning the execution result
		
		return rs;
	}
        
        private String  getNextOfKin(int kinID) throws SQLException, ClassNotFoundException{
        String sql = "SELECT * FROM `nextOfKin` WHERE `kinID`="+ kinID;
       Statement st = this.con().createStatement();
       ResultSet rs = st.executeQuery(sql);
 		ArrayList<String> theKin = new ArrayList();
           while(rs.next()) {
// creating objects of the fetched values
              NextOfKin tmpKin=new NextOfKin();
              int kID=rs.getInt("kinID");
              int employeeID=rs.getInt("employeeID");
              String basicInfo=rs.getString("basicInfo");
              tmpKin.setKinID(kID);
              tmpKin.setEmployeeID(employeeID);
              tmpKin.setBasicInfo(basicInfo);
              // return the java object to json string
                            Gson gs=new Gson();
                            String kinJson=gs.toJson(tmpKin);
              // update the the nestOfKin array list with the converted json string
              theKin.add(kinJson);
                        }
              // closing the statement and the connection
		this.con().close();
		st.close();
                
                return theKin.toString();}
        
        public  String getAllNextOfKins() throws SQLException, ClassNotFoundException{
        String sql = "SELECT * FROM `nextOfKin`";
		java.sql.Statement st = this.con().createStatement();
		ResultSet rs = st.executeQuery(sql);
                ArrayList<String> theKin = new ArrayList<>();
                while(rs.next()){
               // creating objects of the fetched values
               NextOfKin tmpKin=new NextOfKin();
               int  kID=rs.getInt("kinID");
                int  employeeID=rs.getInt("employeeID");
                String  basicInfo=rs.getString("basicInfo");
                
                tmpKin.setKinID(kID);
                tmpKin.setEmployeeID(employeeID);
                tmpKin.setBasicInfo(basicInfo);
                
                // return the java object to json string
                Gson gs= new Gson();
                String kinJson=gs.toJson(tmpKin);
                // update the the nextOfKin array list with the converted json string
                 theKin.add(kinJson);
                 
                 }
                // closing the statement and the connection
		this.con().close();
		st.close();
                
                return theKin.toString();

        }
        
        
                
        

       

 
            
        
        
     
}

