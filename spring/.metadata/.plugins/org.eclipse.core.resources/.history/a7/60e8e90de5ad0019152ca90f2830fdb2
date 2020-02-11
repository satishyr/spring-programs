package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate j=(JdbcTemplate)ac.getBean("jtobj");
		String sql="update stdtab set sname=?,scourse=?,sfee=? where sid=?";
		int count=j.update(sql,"poja","java",25000,102);
		System.out.println("student details updated successfully:"+count);
	}

}
