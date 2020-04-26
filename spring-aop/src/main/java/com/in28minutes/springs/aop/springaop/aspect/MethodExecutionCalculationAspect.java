	/**
 * 
 */
package com.in28minutes.springs.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author sosilva
 *
 */
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodExecutionCalculationAspect.class);

	@Around("com.in28minutes.springs.aop.springaop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		
		// startTime = x
		// allow execution of method
		// endTime = y
		
		LOGGER.info("Time taken by {} is {}", joinPoint, timeTaken);
		
		
	}
	
}
