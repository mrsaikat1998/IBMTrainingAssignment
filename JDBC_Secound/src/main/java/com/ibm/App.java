package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";
		PreparedStatement ps = null;
		Connection con = DriverManager.getConnection(url, username, password);
		//insert values
		ps = con.prepareStatement("insert into emp(id,name,salary) values(?,?,?)");
		ps.setInt(1, 102);
		ps.setString(2, "JOHN");
		ps.setString(3, "14000");
		int i = ps.executeUpdate();
		System.out.println(i + " Records Inserted");
		/*// delete
		ps = con.prepareStatement("delete from emp where id=?");
		ps.setInt(1, 102);
		int x = ps.executeUpdate();
		System.out.println(x + " Record delete");
		*/		con.close();
	}
}
