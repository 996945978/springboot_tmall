package com.zzh.springboot_tmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzh.springboot_tmall.mapper")
public class SpringbootTmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTmallApplication.class, args);
	}
}
