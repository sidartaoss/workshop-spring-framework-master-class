/**
 * 
 */
package com.in28minutes.springs.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.in28minutes.springs.aop.springaop.aspect.TrackTime;

/**
 * @author sosilva
 *
 */
@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething() {
		return "Dao1";
	}
}
