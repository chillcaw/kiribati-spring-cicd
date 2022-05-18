package com.example.springcicd;

import static org.junit.jupiter.api.Assertions.assertThrows;
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
	
	@Test
	void testCustomGreetingInfo() {
		// "Hello: %s, you are %d years old"
		
		String output1 = controller.customGreetingInfo("Calum", 24);
		String output2 = controller.customGreetingInfo("Sandra", 23);
		
		assertTrue("Hello: Calum, you are 24 years old".equals(output1));
		assertTrue("Hello: Sandra, you are 23 years old".equals(output2));
	}
	
	@Test
	void testCustomGreetingInfoNullInput() {
		
		Error thrown1 = assertThrows(
	           Error.class,
	           () -> controller.customGreetingInfo(null, 24),
	           "Expected customGreetingInfo() to throw Error, but it didn't"
	    );
		
		Error thrown2 = assertThrows(
	           Error.class,
	           () -> controller.customGreetingInfo("Sandra", null),
	           "Expected customGreetingInfo() to throw Error, but it didn't"
	    );

		assertTrue("age or name arguments are null and cannot be null".equals(thrown1.getMessage()));
		assertTrue("age or name arguments are null and cannot be null".equals(thrown2.getMessage()));
	}
}
