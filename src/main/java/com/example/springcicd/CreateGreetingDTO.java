package com.example.springcicd;

public class CreateGreetingDTO {
	String greeting;
	String name;
	
	public CreateGreetingDTO(String greeting, String name) {
		super();
		this.greeting = greeting;
		this.name = name;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
