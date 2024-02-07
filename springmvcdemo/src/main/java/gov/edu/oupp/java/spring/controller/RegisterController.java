package gov.edu.oupp.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public String register() {

		return "register";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, 
							@RequestParam("username") String username,
							@RequestParam("password") String password,
							Model model) {

		System.out.println("Email: " + email);
		System.out.println("User Name: " + username);
		System.out.println("Password: " + password);
		
		model.addAttribute("email", email);
		model.addAttribute("username", username);
		model.addAttribute("password", password);

		return "welcome";
	}

}
