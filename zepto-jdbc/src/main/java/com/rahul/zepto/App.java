package com.rahul.zepto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery("select * from employeedetails");
		while (resultSet.next()) {
			System.out.println("Id : " + resultSet.getInt(1) + "\nName : " + resultSet.getString(2) + "\nSalary : "
					+ resultSet.getDouble(3) + "\nAddress: " + resultSet.getString(4));
			System.out.println("****************************");
		}
	}
}
