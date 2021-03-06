package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Course;
import com.app.bean.Student;
import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
	       Student s=ac.getBean("sobj",Student.class);
	       
		
		
		s.getScours().add("Java");
		s.getScours().add("C");
		s.getScours().add("Spring");
		
		s.getSaddr().put(101, "hyderabad");
		s.getSaddr().put(102, "kklr");
		s.getSaddr().put(103, "kaikaluru");
		
		Course c=new Course();
		c.getCnames().add("C");
		c.getCnames().add("java");
		c.getCnames().add("spring");
		
		c.getCcost().put(101, "1000");
		c.getCcost().put(102, "2000");
		c.getCcost().put(103, "3000");
		s.setCobj(c);
		
System.out.println(s);
	}

}
