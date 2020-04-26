/**
 * 
 */
package com.in28minutes.springs.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author sosilva
 *
 */
// AOP
// Configuration
@Aspect
@Configuration
public class AfterAopAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(AfterAopAspect.class);

	// What kind of method calls I would intercept
//	@Before("execution(* com.in28minutes.springs.aop.springaop.business.*.*(..))")
	@AfterReturning(
			value = "execution(* com.in28minutes.springs.aop.springaop.business.*.*(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		// What to do?
		LOGGER.info("{} returned with value {}", joinPoint, result);
	}
	
	@After("com.in28minutes.springs.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void afterReturning(JoinPoint joinPoint) {
		// What to do?
		LOGGER.info("after execution of {}", joinPoint);
	}
	
	// Pointcut: execution(* com.in28minutes.springs.aop.springaop.business.*.*(..))
	// JoinPoint: com.in28minutes.springs.aop.springaop.data.Dao1.retrieveSomething()
	/*
	@AfterThrowing(
			value = "execution(* com.in28minutes.springs.aop.springaop.business.*.*(..))", throwing = "exception")
	public void after(JoinPoint joinPoint, Object exception) {
		// Advice
		// What to do?
		LOGGER.info("{} returned with value {}", joinPoint, exception);
	}
	*/
	
	

}
