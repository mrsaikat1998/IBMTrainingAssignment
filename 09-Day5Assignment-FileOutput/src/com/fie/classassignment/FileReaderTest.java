//Copy data from one file to other file by using Character Stream. Accept file names from command prompt.

package com.fie.classassignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		String sfile= args[0];
		String dfile= args[1];
		FileReader fin = new FileReader(sfile);  
		FileWriter fout = new FileWriter(dfile, true);  
		int c;  
		while ((c = fin.read()) != -1) {  
		 fout.write(c);  
		}  
		System.out.println("Copy finish...");  
		fin.close();  
		fout.close();
	}

}
