package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//为mapper接口创建代理对象
@MapperScan("com.jt.mapper")
public class SpringBootRun {
	//你好
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootRun.class, args);
	}
}
