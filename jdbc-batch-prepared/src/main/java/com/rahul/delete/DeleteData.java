package com.rahul.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/emp";
		String userName = "root";
		String userpass = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, userName, userpass);
		PreparedStatement preparedStatement = connection.prepareStatement("delete from employee where Id=?");
		preparedStatement.setInt(1, 110);
		int result = preparedStatement.executeUpdate();
		System.err.println(result +" Record deleted ");
	}

}
