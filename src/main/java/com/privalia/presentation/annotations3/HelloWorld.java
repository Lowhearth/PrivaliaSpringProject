package com.privalia.presentation.annotations3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld {
	
	private String hello;
	
	public String getHello() {
		return hello;
	}
	

	@Autowired
	public void setHello(@Value("HelloWorld from constructor")String hello) {
		this.hello = hello;
	}

}
