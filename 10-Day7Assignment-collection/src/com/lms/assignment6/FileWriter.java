package com.lms.assignment6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileWriter {

	public static void main(String[] args) throws IOException {
		File fout = new File("states.txt");
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		bw.write("Karnataka");
		bw.newLine();
		bw.write("Panjab");
		bw.newLine();
		bw.write("Telangana");
		bw.newLine();
		bw.write("Maharashtra");
		bw.newLine();
		bw.write("Tamilnadu");
		bw.newLine();
		bw.write("Uttar Pradesh");
		bw.newLine();
		bw.write("Panjab");
		bw.newLine();
		bw.write("Karnataka");
		bw.newLine();
		bw.write("Panjab");
		bw.newLine();
		bw.write("Delhi");
		bw.close();
	}

}
