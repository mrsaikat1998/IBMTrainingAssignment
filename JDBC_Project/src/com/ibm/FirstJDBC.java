package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FirstJDBC {
	static final String DB_URL = "jdbc:mysql://localhost:3306/ibm2021";
	static String username = "root";
	static String password = "root";

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Creating Connection");
			Connection con = DriverManager.getConnection(DB_URL, username, password);
			PreparedStatement ps = con
					.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, 104);
			ps.setString(2, "saikat");
			ps.setString(3, "usa");
			ps.setInt(4, 1234);
			ps.executeUpdate();
			System.out.println("Value Added");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
