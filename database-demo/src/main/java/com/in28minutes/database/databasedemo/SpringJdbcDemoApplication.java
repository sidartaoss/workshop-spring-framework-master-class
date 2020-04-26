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
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJdbcDemoApplication.class);
	
	@Autowired
	private PersonJdbcDao personJdbcDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> allUsers = personJdbcDao.findAll();
		
		Person person10001 = personJdbcDao.findById(10001);
		
		int deletedCount = personJdbcDao.deleteById(10002);
		
		Person personToInsert = new Person(10004, "Tara", "Berlin", new Date());
		
		int insertedCount = personJdbcDao.insert(personToInsert);
		
		Person personToUpdate = new Person(10003, "Pieter", "Utrecht", new Date());
		
		int updatedCount = personJdbcDao.update(personToUpdate);
		
		LOGGER.info("All users - {}", allUsers);
		LOGGER.info("User id 10001 - {}", person10001);
		LOGGER.info("Deleting 10002 - Number of rows deleted - {}", deletedCount);
		LOGGER.info("Inserting 10004 - {}", insertedCount);
		LOGGER.info("Updating 10003 - {}", updatedCount);
	}

}
