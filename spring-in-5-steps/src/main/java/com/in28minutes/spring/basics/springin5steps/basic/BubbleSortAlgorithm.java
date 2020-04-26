/**
 * 
 */
package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author sosilva
 *
 */
//@Component
//@Primary
@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}

}
