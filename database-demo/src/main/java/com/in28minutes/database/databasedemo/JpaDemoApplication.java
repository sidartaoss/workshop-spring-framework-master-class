package com.in28minutes.database.databasedemo;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(JpaDemoApplication.class);
	
//	@Autowired
//	private PersonJdbcDao personJdbcDao;
	
	@Autowired
	private PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LOGGER.info("User id 10001 -> {}", repository.findById(10001));
		
		LOGGER.info("Inserting -> {}",
				repository.insert(new Person("Tara", "Berlin", new Date())));
		
		LOGGER.info("Update 10003 -> {}",
				repository.update(new Person(10003, "Pieter", "Utrecht", new Date())));
		
		repository.deleteById(10002);
		
		LOGGER.info("All users -> {}", repository.findAll());
		
		/*
		List<Person> allUsers = repository.findAll();)
		
		
		int deletedCount = repository.deleteById(10002);
		
		Person personToInsert = new Person(10004, "Tara", "Berlin", new Date());
		
		int insertedCount = repository.insert(personToInsert);
		
		Person personToUpdate = new Person(10003, "Pieter", "Utrecht", new Date());
		
		int updatedCount = repository.update(personToUpdate);
		
		LOGGER.info("All users - {}", allUsers);
		LOGGER.info("User id 10001 - {}", person10001);
		LOGGER.info("Deleting 10002 - Number of rows deleted - {}", deletedCount);
		LOGGER.info("Inserting 10004 - {}", insertedCount);
		LOGGER.info("Updating 10003 - {}", updatedCount);
		*/
	}

}
