package com.aws.codestar.projecttemplates;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "test")
public class TestProperties {

	private String name;
	private int id;
	private String example;
	private String exampleTest;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public String getExampleTest() {
		return exampleTest;
	}
	public void setExampleTest(String exampleTest) {
		this.exampleTest = exampleTest;
	}
	@Override
	public String toString() {
		return "TestProperties [name=" + name + ", id=" + id + ", example=" + example + "]";
	}
	
	
}
