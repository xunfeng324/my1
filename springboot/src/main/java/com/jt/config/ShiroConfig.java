package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.Shiro;

//该类中表示就是xml中数据@Configuration
@Configuration
public class ShiroConfig {
	@Bean
	public Shiro shiro() {
		return new Shiro();
	}
	 
}
