package com.zensar.webapp.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {

	@Autowired  // To enable autowireing for mockMvc test class must be annotated with @AutoConfigureMockmvc
	private MockMvc mock;
	// mockmvc is a class using by spring mvc to do perform testing of spring
	// contr0ller

	@Test
	public void sayHelloTest() throws Exception {
     mock
     	.perform(MockMvcRequestBuilders.get("/hello"))
     	.andExpect(MockMvcResultMatchers.status().isOk())
     	.andExpect(MockMvcResultMatchers.content().string("Welcome to zensar"));
	}
	
	@Test
	public void createMessage() throws Exception {
	 mock
		.perform(MockMvcRequestBuilders.post("/hello").content("Welcome"))
		.andExpect(MockMvcResultMatchers.status().isCreated())
		.andExpect(MockMvcResultMatchers.content().string("message created Welcome"));
	
	}
}
