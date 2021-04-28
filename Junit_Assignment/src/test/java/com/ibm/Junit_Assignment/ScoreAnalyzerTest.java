package com.ibm.Junit_Assignment;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ScoreAnalyzerTest {
	private ScoreAnalyzer sc;

	@Before
	public void BeforeEach() {
		sc = new ScoreAnalyzer();
	}

	@Test
	public void InitialSizeCheck() {
		int expected = 0;
		int actual = sc.scoreList.size();
		Assertions.assertEquals(expected, actual);
	}
	@Test
	public void addRunsToList1() {
		sc.addRunsToList(20);
		Assertions.assertEquals(1, sc.scoreList.size());
		Assertions.assertEquals(20, sc.scoreList.get(0));
	}
	@Test
	public void addRunsToList() {
		sc.addRunsToList(20, 30, 50);
		Assertions.assertEquals(3, sc.scoreList.size());
		Assertions.assertEquals(20, sc.scoreList.get(0));
		Assertions.assertEquals(30, sc.scoreList.get(1));
		Assertions.assertEquals(50, sc.scoreList.get(2));
	}
	@Test
	public void lowestRunsScoredTest() {
		sc.addRunsToList(100, 30, 50);
		sc.lowestRunToScored();
		Assertions.assertEquals(30, sc.scoreList.get(0));
	}

}
