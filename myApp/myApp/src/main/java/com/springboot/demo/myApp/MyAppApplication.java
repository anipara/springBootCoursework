package com.springboot.demo.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("Hello Word");
	}
}