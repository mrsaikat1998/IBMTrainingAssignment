package com.batsman.records;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamThreeBatsMan {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BatsMan bt1 = new BatsMan(101, "Virat", 120, 720, 4587621);
		BatsMan bt2 = new BatsMan(101, "Dhoni", 500, 1200, 458762145);
		BatsMan bt3 = new BatsMan(101, "Rahul", 30, 420, 587621221);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
		oos.writeObject(bt2);
		oos.writeObject(bt3);
	}
}
