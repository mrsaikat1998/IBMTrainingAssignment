package com.file.assignment8;

import java.io.*;
import java.util.*;

public class TestFileExplorer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc.nextLine();

		FileExplorer.listAll(path);
	}

}
