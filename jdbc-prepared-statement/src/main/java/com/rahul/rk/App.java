package com.rahul.rk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/emp";
		String userName = "root";
		String pass = "root";
		String sql = "select * from employeedetails where salary > ?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, pass);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, 100000);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println("Id : " + resultSet.getInt(1) + "\nName : " + resultSet.getString(2) + "\nSalary : "
					+ resultSet.getDouble(3) + "\nAddress : " + resultSet.getString(4));
			System.out.println("-----------------------------");
		}
	}
}
