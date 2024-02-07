package gov.edu.oupp.java.spring.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	//we can mention mapping url explicitly , then we have to rewrite url in browser
	public String home(Model model){
		
		model.addAttribute("name", "BiskFarm Biscuit");
		model.addAttribute("id", 1231);
		
		List<String> biscuits = new ArrayList<String>();
		biscuits.add("50-50  biscuits");
		biscuits.add("Happy Happy Cookies");
		biscuits.add("Good Day");
		
		model.addAttribute("biscuits", biscuits);

		return "index";		// it forwarded to "index.jsp"
	}
	
/*	@RequestMapping("/about")
	public String about()
	{
		return "about";
	}*/
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		//String text
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("about","MyAbout Page");
		modelView.setViewName("about");
		
		//TimeStamp
		LocalDateTime now = LocalDateTime.now();
		modelView.addObject("time", now);
		modelView.setViewName("about");
		
		return modelView;
	}
	
	
}
