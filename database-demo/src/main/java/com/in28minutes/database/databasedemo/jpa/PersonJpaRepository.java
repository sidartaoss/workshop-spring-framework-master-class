/**
 * 
 */
package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

/**
 * @author sosilva
 *
 */
// Repository
@Repository
// Transaction
@Transactional
public class PersonJpaRepository {
	
	// connect to the database
	@PersistenceContext
	private EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id); // JPA
	}
	
	public Person update(Person person) {
		return entityManager.merge(person);
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public void deleteById(int id) {
		Person person = this.findById(id);
		entityManager.remove(person);
	}
	
	public List<Person> findAll() {
		return this.entityManager
				.createNamedQuery("find_all_persons", Person.class)
				.getResultList();
	}

}
