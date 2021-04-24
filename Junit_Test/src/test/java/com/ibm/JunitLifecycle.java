package com.ibm;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JunitLifecycle {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all");
		System.out.println(" ");
	}

	@BeforeEach
	public void setup() {
		System.out.println("Before Every Test Case");

	}

	@Test
	public void test1() {
		System.out.println("Test 1 Executed");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 Executed");
	}

	@Test
	public void test3() {
		System.out.println("Test 3 Executed");
	}

	@AfterEach
	public void testDown() {
		System.out.println("After Each Test Case");

	}

	@AfterAll
	public static void afterAll() {
		System.out.println(" ");
		System.out.println("After All");
	}
}
