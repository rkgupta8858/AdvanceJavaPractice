package com.rahul.jdbs_transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {

	// 1st step - Register JDBC driver
	Class.forName("com.mysql.cj.jdbc.Driver");

	// 2nd step - Create connection

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root","root");

	// 1st UPDATE =============END ==================

	try
	{
	    connection.setAutoCommit(false);
	    // 1st UPDATE =============START - Payment Table ==================
	    String paymentUpdate = "	UPDATE PAYMENT SET STATUS=? WHERE ID=?";
	    // 3rd Create Statement
	    PreparedStatement stmt = connection.prepareStatement(paymentUpdate);
	    stmt.setString(1, "PAID");
	    stmt.setInt(2, 101);
	    int paymentUpdateCount = stmt.executeUpdate();
	    if (paymentUpdateCount > 0)
	    {
		System.out.println(" Payment is successfull, now confirming the order....");
		String something = "";
		// 2nd UPDATE =============START Order ==================
		String orderUpdate = "	UPDATE ORDERS SET STATUS=? WHERE ITEMNAME=?";

		// 3rd Create Statement
		stmt = connection.prepareStatement(orderUpdate);

		stmt.setString(1, "ORDER CONFIRMED");
		stmt.setString(2, "samsung");

		something.length(); // NPE

		int orderUpdateCount = stmt.executeUpdate();
		System.out.println(" Order placed....");

		// 2nd UPDATE =============END Order ==================
	    }
	    connection.commit(); // manual commit...
	} catch (Exception e)
	{
	    e.printStackTrace();
	    connection.rollback();
	    System.out.println(" Order Failed. Rollback done...");
	}

    }
}

