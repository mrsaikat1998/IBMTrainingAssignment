package com.file.assignment3;

import java.io.*;

public class ProverbReader extends ProverbCollection {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("TopProverbs.txt"));

		int i;
		while ((i = bin.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
