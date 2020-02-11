package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Admin;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
		Object o=ac.getBean("aobj");
		Admin a=(Admin)o;
		System.out.println(a);
	}

}
