package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(value = {"","/","/home"})
	public String sayHello() {
		return "Hello";
	}
	@RequestMapping(method = RequestMethod.GET, value = {"/query"})
	public String sayHello(@RequestParam(value = "name") String name) {
		return "Hello "+name+"!";
		
	}
	@GetMapping("/param/{name}")
	public String sayHelloParam(@PathVariable String name) {
		return "Hello "+name+ "!";
		
	}
	
	
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello"+ user.getFirstName() + " "+user.getLastName() + "!";
		
	}
	
	
	@PutMapping("/put/{firstName}")
	public String sayHelloPut(@PathVariable String firstName, @RequestParam(value= "lastName") String lastName) {
		return "Hello" + firstName + " " + lastName + "!";
	}
	

}
