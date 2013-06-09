package com.share.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShareController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "Hello World, Spring 3.1.1 Release!";
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
	}
}