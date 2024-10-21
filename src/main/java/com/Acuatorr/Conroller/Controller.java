package com.Acuatorr.Conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ayush")
public class Controller {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello i everyone";
	}
	
	@GetMapping("/hi")
	public String sayhello() {
		return "thanks";
	}

}
