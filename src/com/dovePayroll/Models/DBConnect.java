
package com.dovePayroll.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private String userName = "doveUser";
	private String password = "D0v3@001";
	private String dbName = "DovePayroll";
	private Connection db;
	
	protected Connection con() throws SQLException, ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:8889/" + this.dbName;
			this.db = DriverManager.getConnection(url, this.userName, this.password);
			
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		return this.db;
	}
}
