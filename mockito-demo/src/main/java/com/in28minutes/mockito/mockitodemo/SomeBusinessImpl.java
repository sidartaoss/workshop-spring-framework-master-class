/**
 * 
 */
package com.in28minutes.mockito.mockitodemo;

/**
 * @author sosilva
 *
 */
public class SomeBusinessImpl {
	private DataService dataService;
	
	public SomeBusinessImpl() {
		
	}
	
	public SomeBusinessImpl(DataService dataService) {
		this.dataService = dataService;
	}
	
	public int findTheGreatestFromAllData() {
		int[] allData = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for (int value : allData) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}


