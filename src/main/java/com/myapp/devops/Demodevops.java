package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demodevops {
	@GetMapping(value="/Data")
	public String getMsg() {
		return "This is a Devops Project";
	}
}
