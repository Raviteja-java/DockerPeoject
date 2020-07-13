package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.docker")
public class DockerDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemo1Application.class, args);
	}
}
