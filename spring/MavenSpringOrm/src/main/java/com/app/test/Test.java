package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.User;
import com.app.config.AppConfig;
import com.app.service.IUserService;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	Object o=ac.getBean("serviceUserImpl");
	IUserService u=(IUserService)o;
	User user=new User();
	user.setUid(7);
	user.setUname("sam");
	user.setUcode("s106");
	u.save(user);
    System.out.println("update successfully");
}
	
}
