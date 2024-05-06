package com.example.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.example.service.DemoService;

@Component
public class DemoFacade {
	@Autowired
	DemoService demoService;
	public String index() {
		return demoService.index();
	}
}
