/**
 * 
 */
package com.in28minutes.springs.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sosilva
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
// Methods
// Runtime
public @interface TrackTime {

}
