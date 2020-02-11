package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Course;
import com.app.bean.Student;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		Object o=ac.getBean("stobj");
		Student s=(Student)o;
System.out.println(s);		

	}

}
