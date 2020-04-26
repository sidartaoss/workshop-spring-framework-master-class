/**
 * 
 */
package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.jee.UserValidationService;

/**
 * @author sosilva
 *
 */
@Controller
public class LoginController {
	
	// Set the Login Service
//	LoginService service = new LoginService();
	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@ResponseBody
	public String showLoginPage() {
//		return "Hello dummy";
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@ResponseBody
	public String handleLoginRequest(@RequestParam String name, 
			@RequestParam String password,
			ModelMap model) {
		if (!this.service.isUserValid(name, password)) {
			model.put("errorMessage", "Invalid Credentials!");
			return "login";
		}
		model.put("name", name);
		model.put("password", password);
		System.out.println(name);
		return "welcome";
//		return "Hello dummy";
	}
}
