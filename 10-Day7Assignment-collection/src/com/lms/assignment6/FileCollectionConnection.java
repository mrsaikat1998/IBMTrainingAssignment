package com.lms.assignment6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileCollectionConnection {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File("states.txt")));
		Set statesSet = new LinkedHashSet();
		String line;
		while ((line = br.readLine()) != null) {
			statesSet.add(line);
		}
		System.out.println(statesSet);
		System.out.println();
		System.out.println("Total No of states : " + statesSet.size());
		System.out.println();
		// remove delhi from Set
		if (statesSet.contains("Delhi")) {
			statesSet.remove("Delhi");
		}
		System.out.println(statesSet);
		// Display the states if starts with k
		System.out.println();
		for (Object o : statesSet) {
			String startsWithK = (String) o;
			if (startsWithK.charAt(0) == 'K') {
				System.out.println("States which starts with 'K' : " + startsWithK);
			}
		}
		System.out.println();

		// Sort the states
		System.out.println("After Sorting : ");
		Set sortedStatesSet = new TreeSet<>(statesSet);
		for (Object o : sortedStatesSet) {
			System.out.println(o);
		}
	}

}
