package com.siddhu.spring.controller;

import java.util.Date;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author shdhumale
 */
@Controller
public class HelloWorldController {
	@RequestMapping(path={"/"},method=RequestMethod.GET)
	//@Autowired
	@PreAuthorize("hasRole('Users')")
	public String sayHello(Model model) {
		model.addAttribute("message","Hello Spring MVC!");

		//Java 8 LocalDate
		/*DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date=LocalDate.now();*/
		Date objDate = new Date();
		model.addAttribute("date", objDate.toGMTString());

		return "index";
	}

	
}
