package com.ibm.store;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveImage {

	public static void main(String[] args) throws SQLException, IOException {
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = con.prepareStatement("select * from picture");
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {

			Blob b = rs.getBlob(2);
			byte barray[] = b.getBytes(1, (int) b.length());
			FileOutputStream fout = new FileOutputStream(
					"D:\\Eclipse\\IBMTraning2021\\JDBC_Secound\\src\\main\\resources\\images\\car.jpeg");
			fout.write(barray);

			fout.close();
		}
		System.out.println("ok");

		con.close();

	}

}
