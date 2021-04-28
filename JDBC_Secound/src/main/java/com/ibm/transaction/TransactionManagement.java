package com.ibm.transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {
	public static void main(String[] args) throws SQLException, IOException {
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";

		Connection con = DriverManager.getConnection(url, username, password);
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter Id : ");
			String s1 = br.readLine();
			int id = Integer.parseInt(s1);
			
			//System.out.println(id);
			System.out.println("Enter Name : ");
			String name = br.readLine();
			
			//System.out.println(name);
			System.out.println("Enter Subject : ");
			String subject = br.readLine();
			
			//System.out.println(subject);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, subject);
			
			int i =ps.executeUpdate();
			System.out.println(i+" Student added successfully");
			
			System.out.println("Commit / Rollback");
			String result = br.readLine();
			if (result.equals("comitt")) {
				con.commit();
			}
			if (result.equals("rollback")) {
				con.rollback();
			}
			System.out.println("Want to add more records y/n");
			String ans = br.readLine();
			if (ans.equals("n")) {
				break;
			}
		}
		con.commit();
		System.out.println("record successfully saved");
		con.close();
	}
}
