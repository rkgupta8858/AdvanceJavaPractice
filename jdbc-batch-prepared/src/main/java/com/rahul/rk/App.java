package com.rahul.rk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/emp";
		String userName = "root";
		String userpass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, userpass);
		connection.setAutoCommit(false);
		PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");

		for (int i = 0; i < 100; i++) {
			preparedStatement.setInt(1, 110);
			preparedStatement.setString(2, "Manisha");
			preparedStatement.setDouble(3, 50000);
			preparedStatement.addBatch();
			preparedStatement.executeBatch();
		}
		connection.commit();
		System.out.println("execute ");

	}
}
