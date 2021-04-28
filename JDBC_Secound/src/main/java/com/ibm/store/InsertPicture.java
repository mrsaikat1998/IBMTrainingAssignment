package com.ibm.store;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPicture {

	public static void main(String[] args) throws SQLException, IOException {
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement("insert into picture values(?,?)");
		ps.setInt(1, 2);
		FileInputStream fis = new FileInputStream(
				"D:\\Eclipse\\IBMTraning2021\\JDBC_Secound\\src\\main\\resources\\images\\exterior-right-front-three-quarter-10.jpeg");
		ps.setBinaryStream(2, fis, fis.available());
		int i = ps.executeUpdate();
		System.out.println(i + " Picture is added");
		con.close();

	}

}
