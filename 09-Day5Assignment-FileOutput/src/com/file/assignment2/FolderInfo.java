package com.file.assignment2;

import java.io.File;
import java.io.IOException;

public class FolderInfo {
	public static void printDirectory(String s)  {
		File file = new File(s);
		if (file.exists() == false)
			System.out.println("No Folder Exists with the given Name");
		System.out.println("File : " + file.getName());
		System.out.println("Absoulute File Path : " + file.getAbsolutePath());
		System.out.println("Folder Path : " + file.getParent());
		System.out.println();
		System.out.println("Directory : "+file.getParentFile().getName());
		System.out.println("Path : "+file.getParentFile().getParent());
	}

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Badminton\\courts\\abc.txt");
		FolderInfo.printDirectory(file.toString());
	}
}
