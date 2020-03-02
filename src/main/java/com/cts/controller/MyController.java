package com.cts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/")
	public String launcherPage()
	{
		return "home";
	}
	
	@RequestMapping(value="/signup")
	public String register()
	{
		return "register";
	}
	

}
