package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// Github: https://github.com/tuomasvalkamo

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("*")
	public String home() {
		return "Hello Spring";
	}

	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "location", required = false) String location) {
		return "Welcome to the " + location + " " + name + "!";
	}
}