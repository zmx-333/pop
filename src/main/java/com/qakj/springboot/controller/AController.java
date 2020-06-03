package com.qakj.springboot.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/aController")
@Controller
public class AController {
	@RequestMapping("/login")
	public String login(){
		return "/login.jsp";
	}
	@Autowired
	private ResourceBundleMessageSource resource;
	
	@RequestMapping("/hello")
	public String hello(Locale locale){
		String username = resource.getMessage("login.username", null, locale);
		System.out.println(username);
		return "/login.jsp";
	}
	
	
	
}
