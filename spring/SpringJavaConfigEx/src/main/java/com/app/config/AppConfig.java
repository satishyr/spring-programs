package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Product;

@Configuration
public class AppConfig {
@Bean
	public Product pobj()
	{
		Product p=new Product();
		p.setPid(101);
		p.setPname("soap");
		p.setPcost(38);
		return p;
	}
}
