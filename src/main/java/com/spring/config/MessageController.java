package com.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.MsgService;

@Controller
public class MessageController {

	@Autowired
	MsgService service;
	
	public MessageController() {
		System.out.println("in MC no-arg constr");
	}
	
	@RequestMapping({"/", "/home"})
	public String showHome() {
		return "Home";
	}
}
