package com.dovePayroll.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private String userName = "doveUser";
	private String password = "D0v3@001";
	private String dbName = "DovePayroll";
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
