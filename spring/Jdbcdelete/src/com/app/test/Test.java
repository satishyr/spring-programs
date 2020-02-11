package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cxg.xml");
		JdbcTemplate jt=(JdbcTemplate)ac.getBean("jtobj");
		String sql="delete from stdtab where sid=?";
		int count=jt.update(sql,101);
		System.out.println("no of records deleted:"+count);
	}

}
