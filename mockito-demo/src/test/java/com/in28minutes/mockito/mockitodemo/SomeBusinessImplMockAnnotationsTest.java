package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessImplMockAnnotationsTest {

	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Test
	public void testFindTheGreatestFromAllData() {
		// Scenario
//		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 6, 15 });
//		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		// Action
		// Verification
		assertEquals(24, someBusinessImpl.findTheGreatestFromAllData());
		
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		// Scenario
//		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });
//		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		// Action
		// Verification
		assertEquals(15, someBusinessImpl.findTheGreatestFromAllData());
		
	}
	
	@Test
	public void testFindTheGreatestFromAllData_NoValues() {
		// Scenario
//		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
//		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		
		// Action
		// Verification
		assertEquals(Integer.MIN_VALUE, someBusinessImpl.findTheGreatestFromAllData());
		
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
