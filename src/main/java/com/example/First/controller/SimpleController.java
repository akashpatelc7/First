package com.example.First.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class SimpleController {
	
	@GetMapping(value="/getRequest")
	public String getString() {
		return "Welcome request got successs.";
	}

}
