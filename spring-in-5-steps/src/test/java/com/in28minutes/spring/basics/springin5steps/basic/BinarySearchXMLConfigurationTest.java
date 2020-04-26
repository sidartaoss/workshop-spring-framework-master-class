/**
 * 
 */
package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

/**
 * @author sosilva
 *
 */
// Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {

	// Get this bean from the context
	@Autowired
	private BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		// Scenario
		
		// Action
		int actualResult= binarySearch.binarySearch(new int[]{}, 5);
		
		// Verification
		assertEquals(3, actualResult);
//		assertEquals(4, actualResult);
	}

}
