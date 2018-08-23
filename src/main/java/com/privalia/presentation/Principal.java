package com.privalia.presentation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//setter Injection
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		
		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("spring-config.xml");
		
		Alumno alumno = (Alumno) context.getBean("alumno");
		System.out.println(alumno.toString());


	}

}
