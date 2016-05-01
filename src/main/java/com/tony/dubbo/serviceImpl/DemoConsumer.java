package com.tony.dubbo.serviceImpl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tony.dubbo.service.CustomerService;

public class DemoConsumer {
	public static void main(String[] args) {

		// Consumer
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
		context.start();
		CustomerService userService = (CustomerService) context.getBean("demoService");
		System.out.println(userService.getName());
	}
}
