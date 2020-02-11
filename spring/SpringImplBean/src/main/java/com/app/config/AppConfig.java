package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.ModelImpl;
import com.app.Product;

@Configuration
public class AppConfig {
	@Bean
	public ModelImpl mobj()
	{
		ModelImpl m=new ModelImpl();
		m.setMid(101);
		m.setMname("style");
		return m;

	}
	@Bean
	public Product pobj()
	{
		Product p=new Product();
		p.setPid(10);
		p.setM(mobj());
		return p;
	}
}
