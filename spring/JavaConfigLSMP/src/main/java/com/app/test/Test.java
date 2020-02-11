package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Employee;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Object o=ac.getBean("empobj");
		Employee e=(Employee)o;
		System.out.println(e);
	}

}
