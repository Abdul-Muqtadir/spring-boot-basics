package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facade.DemoFacade;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("")
public class DemoController {
	@Autowired
	DemoFacade demoFacade;
	
	@GetMapping("/")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok(demoFacade.index());
	}
	
//	@GetMapping("/error")
//	public Object error(Exception e) {
//		return e.printStackTrace();
//	}
}
