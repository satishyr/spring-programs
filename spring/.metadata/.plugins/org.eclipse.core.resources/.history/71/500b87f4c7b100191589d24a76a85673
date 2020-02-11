package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Product;
import com.app.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Object o=ac.getBean("pobj");
		Product p=(Product)o;
		System.out.println(p);
	}
}
