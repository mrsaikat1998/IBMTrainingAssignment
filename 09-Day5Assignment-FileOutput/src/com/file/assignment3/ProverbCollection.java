package com.file.assignment3;

import java.util.*;
import java.io.*;

public class ProverbCollection {
	static BufferedOutputStream bos;
	static Scanner sc = new Scanner(System.in);

	public static void storeProverb(String proverb) throws IOException {
		bos = new BufferedOutputStream(new FileOutputStream("TopProverbs.txt",true));
		bos.write(proverb.getBytes());
		bos.write("\n".getBytes());
	}

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("Enter a proverb Name or type 'stop'");
			String proverb = sc.nextLine();
			if (proverb.equalsIgnoreCase("stop")) {
				break;
			} else {
				try {
					storeProverb(proverb);
				} catch (Exception e) {
					System.out.println("Exception.........occured");
				} finally {
					bos.close();
				}

			}
		}
	}
}
