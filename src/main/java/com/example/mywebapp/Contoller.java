package com.example.mywebapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Contoller {
	
	@Value("${my.greeting}")
	private String greeting;

	@GetMapping("/hello")
	public String ping(){
		return this.greeting;
	}
	
}
