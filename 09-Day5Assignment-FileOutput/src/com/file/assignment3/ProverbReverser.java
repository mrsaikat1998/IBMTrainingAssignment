package com.file.assignment3;

import java.io.*;

public class ProverbReverser {
	public static String reverseWord(String str) {
		String new1 = "";
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			StringBuilder br = new StringBuilder(s[i]);
			new1 += br.reverse() + " ";
		}
		return new1;
	}

	public static void main(String[] args) throws IOException {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("TopProverbs.txt"));
		int i;
		String str = "";
		while ((i = bin.read()) != -1) {
			str = str + (char) i;
		}
		String save = reverseWord(str);

		BufferedOutputStream bos1 = new BufferedOutputStream(new FileOutputStream("ReverseProverbs.txt"));
		bos1.write(save.getBytes());
		bos1.close();

		BufferedInputStream bin1 = new BufferedInputStream(new FileInputStream("ReverseProverbs.txt"));
		int j;
		while ((j = bin1.read()) != -1) {
			System.out.print((char) j);
		}
	}

}
