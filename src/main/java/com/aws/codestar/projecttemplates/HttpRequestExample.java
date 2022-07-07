package com.aws.codestar.projecttemplates;

import java.util.Collections;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpRequestExample {
	
	private final RestTemplate restTemplate;
	
	public HttpRequestExample(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public String getHttp(String path) {
		return this.restTemplate.getForObject("http://localhost:8080/"+path, String.class);
	}
	
	public String postHttp(String path) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		Book b = new Book(89, "Test", "dings");
		
		HttpEntity<Book> entity = new HttpEntity<Book>(b, headers);

		
		return this.restTemplate.postForObject("http://localhost:8080/"+path,entity ,String.class);
	}
}
