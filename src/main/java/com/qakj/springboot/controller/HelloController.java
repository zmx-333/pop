package com.qakj.springboot.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.springboot.pojo.Person;
@RequestMapping("/helloController")
@RestController
public class HelloController {
	@RequestMapping("/handle1")
	public Person handle1(){
		return new Person(2,"张三",12,new Date());
	}
	@RequestMapping("/handle2")
	public String handle2(HttpSession session){
		session.setAttribute("name", "jerry");
		return "向session中保存name值";
	}
	
	
	@RequestMapping("/handle3")
	public String handle3(HttpSession session){
		String name = (String) session.getAttribute("name");
		System.out.println(name);
		return "得到session的值:"+name;
	}
}
