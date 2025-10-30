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
		connection.setAutoCommit(false);
		statement.addBatch("insert into employeedetails values(108,'Raman Gupta',10000,'Gorakhpur')");
		statement.addBatch("insert into employeedetails values(109,'Rajju Gupta',12000,'Campierganj')");
		int[] result = statement.executeBatch();
		connection.commit();
		System.out.println(result +" Added in Database !!");
	}
}
