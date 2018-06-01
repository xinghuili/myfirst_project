package com.kuheng.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	 public static void main(String[] args) {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring-common.xml");
		 //Object userMapper = ctx.getBean("userMapper");
		 Object userMapper = ctx.getBean("userService");
		 
		 
		 System.out.println(userMapper);
	 }
}
