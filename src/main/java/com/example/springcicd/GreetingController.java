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
		return "hello, " + name;
	}
	
	@GetMapping(value = "/{name}/{age}")
	public String customGreetingInfo(@PathVariable String name, @PathVariable Integer age) {
		if (name == null || age == null) {
			throw new Error("age or name arguments are null and cannot be null");
		}
		
		return String.format("Hello: %s, you are %d years old", name, age);
	}
}
