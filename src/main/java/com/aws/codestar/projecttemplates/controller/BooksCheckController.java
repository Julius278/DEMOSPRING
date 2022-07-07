package com.aws.codestar.projecttemplates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.codestar.projecttemplates.HttpRequestExample;

@RestController
public class BooksCheckController {
	
	@Autowired
	private HttpRequestExample http;
	
	@GetMapping("/1")
	public String test1() {
		return http.getHttp("addBook");
	}
	
	@GetMapping("/2")
	public String test2() {
		
		return http.postHttp("postBook");
	}
	
}
