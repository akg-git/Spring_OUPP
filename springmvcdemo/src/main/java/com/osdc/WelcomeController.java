package com.osdc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/osdc")
	public ModelAndView welcome_greet()
	{
		String greetMessage = "Welcome to OSDC Spring MVC Application";
		greetMessage += "Happy New Year 2024";
		
		return new ModelAndView("welcomePage","welcomeMessage", greetMessage);
		
	}
	
	@RequestMapping("/view")
	public ModelAndView display(){
		return null;
	}

}
