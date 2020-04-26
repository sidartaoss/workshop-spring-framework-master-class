/**
 * 
 */
package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author sosilva
 *
 */
public class ListTest {

	@Test
	public void test() {
		// Scenario
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		
		// Action
		
		// Verification
		assertEquals(10, listMock.size());
	}
	
	@Test
	public void testSize_multipleReturns() {
		// Scenario
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		
		// Action
		
		// Verification
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	@Test
	public void testGet_SpecificParameter() {
		// Scenario
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("SomeStringBack");
		
		// Action
		
		// Verification
		assertEquals("SomeStringBack", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void testGet_GenericParameter() {
		// Scenario
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("SomeStringBack");
		
		// Action
		
		// Verification
		assertEquals("SomeStringBack", listMock.get(0));
		assertEquals("SomeStringBack", listMock.get(1));
	}

}
