package com.nuance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.nuance.cdi.mappers")
@SpringBootApplication
public class CdiNextApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdiNextApplication.class, args);
	}
}
