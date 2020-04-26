package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

//@SpringBootApplication
@Configuration
@ComponentScan()
// app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		
		// 1. What are the beans?
		
		// 2. What are the dependencies of a bean?
		
		// 3. Where to search for beans?
		
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		// Application Context
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);) {
		
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceUrl());
		
		}
	}

}
