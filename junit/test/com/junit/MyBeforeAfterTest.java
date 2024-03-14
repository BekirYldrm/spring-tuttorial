package com.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void afterEach() {
		System.out.println("AfterEach");
	}

	@Test
	void test1() {
		System.out.println("Test1");
	}

	@Test
	void test2() {
		System.out.println("Test2");
	}

	@Test
	void test3() {
		System.out.println("Test3");
	}

}
