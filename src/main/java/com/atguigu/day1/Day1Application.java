package com.atguigu.day1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;



@SpringBootApplication
@ComponentScan(basePackages = {"com.atguigu"})
@MapperScan("com.atguigu.mapper")
@EnableScheduling //事物开启调度功能
public class Day1Application {



	public static void main(String[] args) {
		SpringApplication.run(Day1Application.class, args);
		System.out.println("程序正在运行");
	}

}
