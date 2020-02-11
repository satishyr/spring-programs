package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Project;
import com.app.bean.Version;

@Configuration
public class AppConfig {

	@Bean
	public Version vobj()
	{
		Version v=new Version();
		v.setVid(101);
		v.setVcode("v101");
		return v;
	}
	@Bean
	public Project pobj()
	{
		Project p=new Project();
		p.setPid(101);
		p.setPname("soap");
		p.setVer(vobj());
		return p;
	}
}
