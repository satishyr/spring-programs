package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
		Object o=ac.getBean("empobj",Employee.class);
		Employee e=new Employee();
		e.setEmpid(101);
		e.setEmpname("satish");
		System.out.println(e);
	}

}
