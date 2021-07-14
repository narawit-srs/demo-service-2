package com.javainuse.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

import com.javainuse.model.Company;

@RestController
public class TestController {

//	@Value("${USERHELLO}")
//		String user_hello;

	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public Company firstPage() {

		Company com = new Company();
		com.setName("My Company");
		com.setGoal("To the moon!!");
		com.setComId("1");
		com.setCEO("Timmy and Jimmy");
		
		return com;
	}

}