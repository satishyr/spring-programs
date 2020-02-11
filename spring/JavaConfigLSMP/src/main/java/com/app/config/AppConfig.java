package com.app.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Employee;

@Configuration
public class AppConfig {

	public Set<String> pobj()
	{
		Set<String> hs=new HashSet<String>();
		
		hs.add("warehouse");
		hs.add("services");
		hs.add("query");
		hs.add("cost_efficient");
		return hs;
	}
	public List<String> dobj()
	{
	
		List<String> al=new ArrayList<String>();
		al.add("java");
		al.add("adavance");
		al.add("hibernate");
		al.add("spring");
		return al;
	}
	public Map<Integer,String> vobj()
	{
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "v1");
		hm.put(102, "v2");
		hm.put(103, "v3");
		hm.put(104, "v4");
		return hm;
				
	}
	public Properties mobj()
	{
		Properties p=new Properties();
		p.put("10", "m1");
		p.put("11", "m2");
		p.put("12", "m3");
		p.put("13", "m4");
		return p;
	}
	@Bean
	public Employee empobj()
	{
		Employee e=new Employee();
		e.setEid(103);
		e.setEname("satish");
		e.setEdepts(dobj());
		e.setEprjs(pobj());
		e.setEvers(vobj());
		e.setEmpModes(mobj());
return e;
	}
}
