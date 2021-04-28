package com.ibm.Junit_Assignment;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class DistanceUtilTest {

	private DistanceUtil dUtil = new DistanceUtil();

	@Test
	public void kmsToMilesTest() {
		float expected = 1.8641129f;
		float actual = dUtil.kmsToMiles(3);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void milesToKmsTest() {
		float expected=8.0467f;
		float actual=dUtil.milesToKms(5);
		Assertions.assertEquals(expected, expected);
	}
}
