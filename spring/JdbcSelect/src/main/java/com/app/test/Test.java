package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.bean.Student;
import com.app.config.AppConfig;
import com.app.mapper.StudentRowMapper;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate j=(JdbcTemplate)ac.getBean("jtobj");
		
		//select one row
		/**
		String sql="select * from stdtab where sid=?";
		StudentRowMapper srm=new StudentRowMapper();
		Student s=j.queryForObject(sql, srm,102);
		System.out.println(s);
		
		*/
		
		//SELECT ALL ROWS IN A TABLE
		
		
		String sql="select * from stdtab";
		StudentRowMapper srm=new StudentRowMapper();
		List<Student> list=j.query(sql, srm);
		list.forEach(System.out::println);
		
	}

}
