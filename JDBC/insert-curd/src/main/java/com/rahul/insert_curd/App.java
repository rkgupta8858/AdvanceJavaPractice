package com.rahul.insert_curd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/emp";
		String userName = "root";
		String userpass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, userpass);
		Statement statement = connection.createStatement();
		int count = statement.executeUpdate("insert into employeedetails values(105,'Rohit Gupta',130000,'Gorakhpur')");
		System.out.println("Record Added : " + count);

	}
}
