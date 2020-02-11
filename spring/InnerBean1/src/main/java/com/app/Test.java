package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
	Object o=ac.getBean("aobj");
	Account a=(Account)o;
	System.out.println(a);
}
}
