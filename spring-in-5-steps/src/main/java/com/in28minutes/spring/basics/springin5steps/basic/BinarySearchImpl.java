/**
 * 
 */
package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author sosilva
 *
 */
//@Component
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);
	
	@Autowired
//	@Qualifier("quick")
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
//		BubbleSortAlgorithm bubbleSortAlgorithm =
//				new BubbleSortAlgorithm();
//		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		
		int[] sortedNumbers = this.sortAlgorithm.sort(numbers);
		
		System.out.println(this.sortAlgorithm);
		
		// Implement Sorting logic.
		// Bubble Sort Algorithm.
		
		
		// Search the array.
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy");
	}
	
}
