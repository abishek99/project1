package com.cts.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.CleanerBean;
import com.cts.model.UserBean;

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
	
	@RequestMapping(value="/cleanersignup")
	public String cleanersignup(@Valid @ModelAttribute("cleaner") CleanerBean cleaner,BindingResult br)
	{
		return "cleanersignup";
	}
	
	@RequestMapping(value="/usersignup")
	public String usersignup(@Valid @ModelAttribute("user") UserBean user,BindingResult br) 
	{
		return "usersignup";
	}
	
	

}
