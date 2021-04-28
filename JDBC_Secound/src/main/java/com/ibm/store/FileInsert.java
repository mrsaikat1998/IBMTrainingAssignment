package com.ibm.store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileInsert {

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		String url = "jdbc:mysql://localhost:3306/ibm2021";
		String username = "root";
		String password = "root";
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		PreparedStatement ps=con.prepareStatement("insert into filedb values(?,?)");
		File file=new File("D:\\Eclipse\\IBMTraning2021\\JDBC_Secound\\src\\main\\resources\\textfile.txt");
		FileReader fr=new FileReader(file);
		ps.setInt(1, 101);
		ps.setCharacterStream(2, fr,(int)file.length());
		int i=ps.executeUpdate();
		System.out.println(i+ " file text added");
		//retrieve data from data base
		
	}

}
