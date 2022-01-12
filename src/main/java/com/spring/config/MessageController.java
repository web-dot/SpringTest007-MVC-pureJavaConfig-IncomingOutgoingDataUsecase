package com.spring.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

	
	@RequestMapping({"/", "/home"})
	public String showHome() {
		return "Home";
	}
}
