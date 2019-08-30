package com.jt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//要求:如果放回的是json串用这个注解
public class Hello {
	@RequestMapping("/hello")
	public String Hello() {
		return "hello springboot";
	}
}
