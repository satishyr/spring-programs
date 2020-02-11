package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Employee;

@Configuration
public class AppConfig {

	@Bean
	public Employee empobj()
	{
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("satish");
		e.setEsal(50000);
		return e;
	}
}
