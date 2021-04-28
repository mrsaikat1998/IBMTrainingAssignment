package com.lms.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsDemo1 {
	private static final String SQL_QUERY = "SELECT * FROM PRODUCTS";

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, username, password);
			ps = con.prepareStatement(SQL_QUERY);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
