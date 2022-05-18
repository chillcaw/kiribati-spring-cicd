package com.example.springcicd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingControllerTests {

	@Autowired
	private GreetingController controller;
	
	@Test
	void testGreetingEndpoint() {
		String output = controller.greeting();
		System.out.println("GREETING ENDPOINT" + output);
		assertTrue("hello, there".equals(output));
	}
	
	@Test
	void testCustomGreeting() {
		String output = controller.customGreeting("Sam");
		System.out.println("GREETING ENDPOINT" + output);
		assertTrue("hello, Sam".equals(output));
	}
}
