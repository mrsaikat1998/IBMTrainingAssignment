package com.file.assignment6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentFormatter {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader(""));
		String s = "";
		while (br.read() != -1) {
			s += br.readLine();
		}
		System.out.println(s);
		br.close();
	}
}
