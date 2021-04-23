package com.lms.assignment2;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	LinkedList runsData;

	public ScoreAnalyzer() {
		this.runsData = new LinkedList();
	}

	public void addRunsToList(int score) {
		runsData.add(score);
	}

	public double calcRunRate() {
		int total=0;
		for (int i = 0; i < runsData.size(); i++) {
			int run = (int) runsData.get(i);
			total = total + run;	
		}
		return (total / 50);
	}

	public int lowestRunsScored() {
		Collections.sort(runsData);
		return (int) runsData.get(0);
	}

	public void displayRuns() {
		System.out.print("Run scored : ");
		 for(int i=0;i<runsData.size();i++) {
				System.out.print(runsData.get(i)+" ");
		 }
		 System.out.println();
	 }
}
