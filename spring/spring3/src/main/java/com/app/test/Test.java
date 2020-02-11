package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
		Object o=ac.getBean("empobj");
		Employee e=(Employee)o;
		System.out.println(e);
	}

}
