package com.aws.codestar.projecttemplates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
public class TestClass {
	
	private String name;
	private String test;
	private String ex;
	
	@Autowired
	private TestProperties testP;
	
	public TestClass(TestProperties testP) {
		this.name = testP.getName();
		this.test = testP.getExample();
		this.ex = testP.getExampleTest();
	}

	public String getTest(String name) {
		return "test";
	}	
	
	public String getN() {
		return this.name +"; "+ this.ex +"; "+ this.test+"; "+ testP.toString();
	}
}
