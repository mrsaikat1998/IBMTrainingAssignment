package com.batsman.records;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamOneBatsMan {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("records.dat"));
		BatsMan bt1 = (BatsMan) ois.readObject();
		System.out.println(bt1);

	}
}