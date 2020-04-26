package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {
	
	private static final Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {
		
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);) {
		
			SomeCdiBusiness business = 
					applicationContext.getBean(SomeCdiBusiness.class);
			
			LOGGER.info("{}, dao-{}", business, business.getSomeCDIDAO());
		
		}
		
//		System.out.println(String.format("%s, dao-%s", business, business.getSomeCDIDAO()));
		
	}

}
