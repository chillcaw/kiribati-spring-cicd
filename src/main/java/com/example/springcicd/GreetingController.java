package com.example.springcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/greetings")
public class GreetingController {
	@GetMapping
	public String greeting() {
		return "hello, there";
	}
	
	@GetMapping(value = "/{name}")
	public String customGreeting(@PathVariable String name) {
		return String.format("hello, %s", name);
	}
}
