package com.in28minutes.springs.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.springs.aop.springaop.business.Business1;
import com.in28minutes.springs.aop.springaop.business.Business2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringAopApplication.class);
	
	@Autowired
	private Business1 business1;
	
	@Autowired
	private Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(business1.calculateSomething());
		LOGGER.info(business2.calculateSomething());
	}

}