package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;



//@SpringBootApplication
@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static final Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);) {
		
			ComponentDAO componentDao = 
					applicationContext.getBean(ComponentDAO.class);
			
			LOGGER.info("{}", componentDao);
			LOGGER.info("{}", componentDao.getJdbcConnection());
			LOGGER.info("{}", componentDao.getJdbcConnection());
		
		}
		
//		System.out.println(String.format("%s", componentDao));
//		System.out.println(String.format("%s", componentDao.getJdbcConnection()));
//		System.out.println(String.format("%s", componentDao.getJdbcConnection()));
		
	}

}
