package com.devTools.devTools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(
		scanBasePackages =  {"com.devTools.devTools" ,
							 "com.devTools.util"}
)
public class DevToolsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevToolsApplication.class, args);
		System.out.println("Hello My friend");
	}
}