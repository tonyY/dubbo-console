package com.tony.dubbo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tony.dubbo.service.CustomerService;

public class UserServiceImpl {
	@Autowired
	CustomerService demoService;

	public void invoke() {
		demoService.getName();
	}
}
