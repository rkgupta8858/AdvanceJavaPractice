package com.rahul.rk;

import java.sql.Connection;
import java.sql.DriverManager;
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
		int count = statement.executeUpdate("delete from employeedetails where id=105");
		System.out.println(count + " Record Deleted");

	}
}
