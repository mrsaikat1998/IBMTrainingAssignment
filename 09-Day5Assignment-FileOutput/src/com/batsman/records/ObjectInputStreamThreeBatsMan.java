package com.batsman.records;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamThreeBatsMan {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("records.dat"));
		BatsMan[] bArray = new BatsMan[3];
		for (int i = 0; i < 3; i++) {
			bArray[i] = (BatsMan) ois.readObject();
		}
		for (BatsMan b : bArray) {
			System.out.println(b);
		}
	}
}