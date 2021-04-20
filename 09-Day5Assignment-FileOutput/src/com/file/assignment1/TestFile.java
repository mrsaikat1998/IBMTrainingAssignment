package com.file.assignment1;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		File folder=new File("D:\\Badminton");
		folder.mkdir();
		File file1=new File("D:\\Badminton\\single.txt");
		file1.createNewFile();
		File file2=new File("D:\\Badminton\\dubbles.txt");
		file2.createNewFile();
		File subFolder=new File("D:\\Badminton\\courts");
		subFolder.mkdir();
		File file3=new File("D:\\Badminton\\doubles.txt");
		System.out.println(file2.renameTo(file3));
		file1.delete();
	}
}
