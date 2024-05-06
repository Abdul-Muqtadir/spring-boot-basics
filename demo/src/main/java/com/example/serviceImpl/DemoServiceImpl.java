package com.example.serviceImpl;

import org.springframework.stereotype.Service;
import demo.example.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
