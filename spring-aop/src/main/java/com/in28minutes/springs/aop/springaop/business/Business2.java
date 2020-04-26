/**
 * 
 */
package com.in28minutes.springs.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.springs.aop.springaop.data.Dao2;

/**
 * @author sosilva
 *
 */
@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
}
