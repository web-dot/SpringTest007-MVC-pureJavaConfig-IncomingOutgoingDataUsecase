package com.spring.config;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.MsgService;

import Domain.RegBean;

@Controller
public class MessageController {

	@Autowired
	MsgService service;
	
	public MessageController() {
		System.out.println("in MC no-arg constr");
	}
	
	@RequestMapping({"/", "/home"})
	public String showHome() {
		System.out.println("in MC->showHome()");
		return "Home";
	}
	
	@RequestMapping("/showJoke")
	public String showJoke(Model model) {
		
		//get the joke from service
		String joke = service.getJoke();
		model.addAttribute("joke", joke);
		return "DisplayJoke";
	}
	
	@RequestMapping("/openRegisterView")
	public String showRegisterView(Model model) {
		System.out.println("in HC->showRegisterView()");
		//do pre-processing, store bean in Model in "reg" label
		model.addAttribute("reg", new RegBean());
		return "Register";
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("reg") @Valid RegBean bean, BindingResult result) {
		
		System.out.println("in MC->register() bean = " + bean);
		if(result.hasErrors()) {
			return "Register";
		}
		else {
			
			//invoke service and ask to register bean
			return "Success";
		}
		
	}
	
	
}
