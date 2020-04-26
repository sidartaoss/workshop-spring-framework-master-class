package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

//@SpringBootApplication
@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		// 1. What are the beans?
		
		// 2. What are the dependencies of a bean?
		
		// 3. Where to search for beans?
		
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		// Application Context
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);) {
		
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			
			System.out.println(binarySearch);
			
			System.out.println(binarySearch1);
			
			int result = binarySearch.binarySearch(new int [] { 12, 4, 6 }, 3);
			// com.in28minutes.spring.basics.springin5steps.BubbleSortAlgorithm@15db9742
			// com.in28minutes.spring.basics.springin5steps.QuickSortAlgorithm@15db9742
			System.out.println(result);
//			applicationContext.close();
		
		}
	}

}
