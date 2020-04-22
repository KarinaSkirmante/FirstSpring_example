package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller //Controller class
public class SimpleController {
	
	
	@GetMapping("/testmsg") //will be called from web browser url localhost:8080/testmsg
	public String testController(Model model)//Using Model object the object will be passed to View (html page)
	{
		String testMsg = "Hello World in Spring - JAVA Course"; //Message - can be any reference type object
		model.addAttribute("msg", testMsg); //add attribute to model object. "msg" <-- it is name for inner attribute it wll be used in View
		return "hello";//show hello.html file (from src/main.resources/templates)
	}

	
	
}
