package com.ibm.store;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReceivedFileData {

	public static void main(String[] args) throws SQLException, IOException {
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);

		PreparedStatement ps = con.prepareStatement("select * from filedb");
		ResultSet rs = ps.executeQuery();
		rs.next();
		Clob cl = rs.getClob(2);
		Reader reader = cl.getCharacterStream();
		FileWriter fw = new FileWriter("D:\\Eclipse\\IBMTraning2021\\JDBC_Secound\\src\\main\\resources\\receivedfile.txt");
		int i;
		while ((i = reader.read()) != -1) {
			fw.write((char) i);
		}
		fw.close();
		System.out.println("Success");
		con.close();
	}

}
