/**
 * 
 */
package com.in28minutes.springs.aop.springaop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.springs.aop.springaop.aspect.TrackTime;
import com.in28minutes.springs.aop.springaop.data.Dao1;

/**
 * @author sosilva
 *
 */
@Service
public class Business1 {

	@Autowired
	private Dao1 dao1;
	
	@TrackTime
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
}
