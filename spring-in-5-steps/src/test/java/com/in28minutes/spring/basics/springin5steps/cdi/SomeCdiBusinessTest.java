/**
 * 
 */
package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sosilva
 *
 */
// Load the context
//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = SpringIn5StepsCdiApplication.class)
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	/** Inject Mock **/
	// Get this bean from the context
//	@Autowired
	@InjectMocks
	private SomeCdiBusiness someCdiBusiness;
	
	/** Create Mock **/
	@Mock
	private SomeCdiDao daoMock;
	
	@Test
	public void testBasicScenario() {
		// Scenario
		/** when daoMock.getData() is called, return int[]{2, 4} **/
		when(daoMock.getData()).thenReturn(new int[] {2, 4});
		
		// Action
		// Verification
		assertEquals(4, someCdiBusiness.findGreatest());
	}
	
	@Test
	public void testBasicScenario_NoElements() {
		// Scenario
		when(daoMock.getData()).thenReturn(new int[] {});
		
		// Action
		// Verification
		assertEquals(Integer.MIN_VALUE, someCdiBusiness.findGreatest());
	}
	
	@Test
	public void testBasicScenario_EqualElements() {
		// Scenario
		when(daoMock.getData()).thenReturn(new int[] {2, 2});
		
		// Action
		// Verification
		assertEquals(2, someCdiBusiness.findGreatest());
	}

}
