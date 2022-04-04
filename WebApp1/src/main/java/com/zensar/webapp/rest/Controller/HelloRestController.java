package com.zensar.webapp.rest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Writing test case for every piece of business code including spring controller is mandatory
@RestController
public class HelloRestController {

	@GetMapping("/hello")
	public String sayHello() {
		System.out.println("Testing sayHello");
		return "Welcome to zensar";
	}

	@PostMapping("/hello")
	public ResponseEntity<String> createMessage(@RequestBody String msg) {
		
		System.out.println("message created");
		return new ResponseEntity<String>("message created "+msg,HttpStatus.CREATED);
	}
}
