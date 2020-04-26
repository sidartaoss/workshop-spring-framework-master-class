package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;

//@SpringBootApplication
//@Configuration
//@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsXmlContextApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		
		// 1. What are the beans?
		
		// 2. What are the dependencies of a bean?
		
		// 3. Where to search for beans?
		
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		// Application Context
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		try (ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");) {
			
			String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		
			LOGGER.info("Beans Loaded -> {}", (Object) beanDefinitionNames);
			
			XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{}", xmlPersonDao);
			LOGGER.info("{}", xmlPersonDao.getXmlJdbcConnection());
		}
	}

}
