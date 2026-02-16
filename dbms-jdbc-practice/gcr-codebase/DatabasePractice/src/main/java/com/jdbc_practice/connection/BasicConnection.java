package com.jdbc_practice.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnection {
	
	//Database credentials
	private static final String url = "jdbc:mysql://localhost:3306/blabz";
	private static final String user = "root";
	private static final String password = "Sanya@05";
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			//Load
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish connection
			connection = DriverManager.getConnection(url, user, password);
			System.err.println("Database Connected Successfully");
		}
		catch(ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found!");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		Connection connection = getConnection();
		
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Connection closed.");
				} 
			catch (SQLException e) {
				e.printStackTrace();
				}
		}
	}

}
