package com.dan.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		var name = context.getBean("getName");
		System.out.println(name);
	}

}
