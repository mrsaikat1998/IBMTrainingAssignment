package com.file.assignment8;

import java.io.File;

public  class FileExplorer {
	public static  void listAll(String path) {
		File dir = new File(path);
		dir.mkdir();

		File[] str = dir.listFiles();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}