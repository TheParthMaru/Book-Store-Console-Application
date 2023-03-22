package com.bookstore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DatabaseConnection {
	private DatabaseConnection() {}
	
	public static Connection getDbConnection() {
		Connection dbConnection = null;
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		
		try {
			dbConnection = DriverManager.getConnection(bundle.getString("url"), bundle.getString("username"), bundle.getString("password"));
			
//			if (dbConnection != null) {
//				System.out.println("Connection Successful");
//			} else {
//				System.out.println("Connection Unsuccessful");
//			}
			
		} catch(Exception exc) {			
			System.out.println("Exception in DatabaseConnection -> getDbConnection()");
			System.out.println(exc.getMessage());
			exc.printStackTrace();
		}
		return dbConnection; 
	}
}
