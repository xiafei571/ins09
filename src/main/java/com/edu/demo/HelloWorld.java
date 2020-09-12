package com.edu.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class HelloWorld {
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot";
	}
}
