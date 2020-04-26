/**
 * 
 */
package com.in28minutes.springs.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
public class UserAccessAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserAccessAspect.class);

	// What kind of method calls I would intercept
//	@Before("execution(* com.in28minutes.springs.aop.springaop.business.*.*(..))")
	// Weaving & Weaver
	// Pointcut execution(* com.in28minutes.springs.aop.springaop.data.*.*(..))
	// Joinpoint: execution(String com.in28minutes.springs.aop.springaop.business.Business2.calculateSomething())
	@Before("com.in28minutes.springs.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution()")
	public void before(JoinPoint joinPoint) {
		// What to do?
		// Advice
		LOGGER.info("Check for user access");
		LOGGER.info(" Allowed execution for {}", joinPoint);
	}

}
