package com.spring;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@RequestMapping({"/hellouser"})
	public String helloUser(){
		return "Hello User";
	}
	
	@RequestMapping({"/helloadmin"})
	public String helloAdmin(){
		return "Hello Admin Welcome";
	}
	
	
	
	
}
