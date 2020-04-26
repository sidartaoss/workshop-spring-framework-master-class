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
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// TODO Logic for Quick Sort
		return numbers;
	}

}
