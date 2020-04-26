/**
 * 
 */
package com.in28minutes.junit;

/**
 * @author sosilva
 *
 */
public class MyMath {
	
	public int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
//		return sum + 20;
		return sum;
	}

}
