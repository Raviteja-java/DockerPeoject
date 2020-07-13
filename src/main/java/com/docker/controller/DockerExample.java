package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("MyDemo")
public class DockerExample {
	@GetMapping("/docker")
	public String dockerController() {
		return "hello welcome new to the just docker";
	}
}
