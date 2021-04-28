package com.ibm.Junit_Assignment;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {
	LinkedList scoreList;

	public ScoreAnalyzer() {
		scoreList = new LinkedList();
	}

	public void addRunsToList(int runs) {
		scoreList.add(runs);
	}

	public void addRunsToList(int runs1, int runs2, int runs3) {
		scoreList.add(runs1);
		scoreList.add(runs2);
		scoreList.add(runs3);
	}

	public int lowestRunToScored() {
		Collections.sort(scoreList);
		return (int) scoreList.get(0);
	}
}
