package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	private MyMath myMath = new MyMath();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	/**
	 * MyMath.sum
	 * 1,2,3 => 6
	 */
	@Test
	public void sum_with3numbers() {
//		fail("Not yet implemented");
		// Absence of failure is success

		// Scenario
//		MyMath myMath = new MyMath();
		
		// Action
		
//		System.out.println(sum);
		System.out.println("Test 1");
		
		// Validation
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
		
	}
	
	@Test
	public void sum_with1numbers() {
		// Scenario
//		MyMath myMath = new MyMath();
		
		// Action
		
//		System.out.println(sum);
		System.out.println("Test 2");
		
		// Validation
		assertEquals(3, myMath.sum(new int[] { 3 }));
		
	}

}
