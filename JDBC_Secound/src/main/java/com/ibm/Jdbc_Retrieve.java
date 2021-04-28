package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class Jdbc_Retrieve {

	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement("select * from emp");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		//update
		/*ps=con.prepareStatement("update emp set name=? where id=?");
		ps.setString(1, "SURAJ");
		ps.setInt(2, 101);
		ps.executeUpdate();*/
		con.close();

	}

}
