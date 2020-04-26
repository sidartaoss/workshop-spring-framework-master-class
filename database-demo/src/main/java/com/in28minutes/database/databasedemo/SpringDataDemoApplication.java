package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringDataDemoApplication.class);
	
	@Autowired
	private PersonSpringDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("User id 10001 -> {}", repository.findById(10001));
		
		LOGGER.info("Inserting -> {}",
				repository.save(new Person("Tara", "Berlin", new Date())));
		
		LOGGER.info("Update 10003 -> {}",
				repository.save(new Person(10003, "Pieter", "Utrecht", new Date())));
		
		repository.deleteById(10002);
		
		LOGGER.info("All users -> {}", repository.findAll());
		
		
	}

}
