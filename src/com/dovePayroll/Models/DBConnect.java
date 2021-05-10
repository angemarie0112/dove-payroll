package com.dovePayroll.Models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private String userName = "";
	private String password = "";
	private String dbName = "";
	private Connection db;
	
	protected Connection con() {
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
