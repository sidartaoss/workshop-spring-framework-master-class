/**
 * 
 */
package com.in28minutes.login;

import org.springframework.stereotype.Service;

/**
 * @author sosilva
 *
 */
// new LoginService()
@Service
public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("in28minutes") && password.equals("dummy")) {
			return true;
		}
		return false;
	}
}
