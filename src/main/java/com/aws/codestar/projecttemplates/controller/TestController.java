package com.aws.codestar.projecttemplates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aws.codestar.projecttemplates.TestClass;

@RestController
public class TestController {

	@Autowired
	private TestClass test;

	@GetMapping(path = "/test", produces = "application/json")
	public String test() {
		return test.getConfig();
	}

}
