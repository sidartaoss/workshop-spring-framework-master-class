package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeBusinessImplStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		// Scenario
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		
		// Action
		int theGreatestFromAllData = someBusinessImpl.findTheGreatestFromAllData();
		
		// Verification
		assertEquals(24, theGreatestFromAllData);
		
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {24, 6, 15};
	}
	
}