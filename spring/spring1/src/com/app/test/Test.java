package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
		Object o=ac.getBean("stobj");
		Student s=(Student)o;
		System.out.println(s);
	}

}
