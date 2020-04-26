/**
 * 
 */
package com.in28minutes.jee;

/**
 * @author sosilva
 *
 */
public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("in28minutes") && password.equals("dummy")) {
			return true;
		}
		return false;
	}
}
