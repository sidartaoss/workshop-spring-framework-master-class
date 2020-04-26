package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessImplMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		// Scenario
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 6, 15 });
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		// Action
		int theGreatestFromAllData = someBusinessImpl.findTheGreatestFromAllData();
		
		// Verification
		assertEquals(24, theGreatestFromAllData);
		
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		// Scenario
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		// Action
		int theGreatestFromAllData = someBusinessImpl.findTheGreatestFromAllData();
		
		// Verification
		assertEquals(15, theGreatestFromAllData);
		
	}
	
}

//class DataServiceStub implements DataService {
//
//	@Override
//	public int[] retrieveAllData() {
//		return new int[] {24, 6, 15};
//	}
//	
//}
