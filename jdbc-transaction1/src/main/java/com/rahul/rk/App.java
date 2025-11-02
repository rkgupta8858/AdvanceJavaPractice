package com.rahul.rk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	private static final String url = "jdbc:mysql://localhost:3306/emp";
	private static final String userName = "root";
	private static final String pass = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection;

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, userName, pass);
		connection.setAutoCommit(false);

		String updateAddress = "UPDATE employeedetails SET Address = ? WHERE id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(updateAddress);

		preparedStatement.setString(1, "G.K.P.");
		preparedStatement.setInt(2, 101);
		preparedStatement.executeUpdate();

		String updateSalary = "UPDATE employeedetails SET salary = ? WHERE id = ?";
		PreparedStatement preparedStatement1 = connection.prepareStatement(updateSalary);

		preparedStatement1.setDouble(1, 50000);
		preparedStatement1.setInt(2, 101);
		preparedStatement1.executeUpdate();

		connection.commit();
		System.out.println("Transaction committed successfully.");
		
		preparedStatement.close();
		preparedStatement1.close();
		
		

	}
}
