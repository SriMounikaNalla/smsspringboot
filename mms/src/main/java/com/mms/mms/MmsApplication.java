package com.mms.mms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmsApplication.class, args);
		System.out.println("hello project");
		System.out.println("----started----");
	}

}
