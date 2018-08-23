package com.privalia.presentation.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		HelloWorld helloWorld =(HelloWorld)appContext.getBean("helloWorld");
		System.out.println(helloWorld.getHello());
		

		
AbstractApplicationContext appContext2 = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Alumno alumno =(Alumno)appContext.getBean("alumno");
		System.out.println(alumno.toString());
		appContext.close();
		appContext2.close();
	}

}
