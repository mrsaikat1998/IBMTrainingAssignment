package com.lms.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
		int totalScore = 0;
		String name = "";
		scores.put("Rahane", 20);
		scores.put("Rahul", 30);
		scores.put("Kohli", 150);
		scores.put("Dhoni", 50);
		scores.put("Lokesh", 2);
		System.out.println("Score by players :");
		Iterator<Map.Entry<String, Integer>> ite = scores.entrySet().iterator();
		while (ite.hasNext()) {
			Map.Entry<String, Integer> entry = ite.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// calculate total runs
			int run = (int) entry.getValue();
			totalScore = totalScore + run;
		}
		System.out.println();
		System.out.println("Total Score : " + totalScore);
			
		System.out.println();
		System.out.println("Run score by Dhoni : " + scores.get("Dhoni"));
	}

}
