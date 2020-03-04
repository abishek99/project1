package com.cts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String cleanersignup(@ModelAttribute("cleaner") CleanerBean cleaner,BindingResult br)
	{
		return "cleanersignup";
	}
	
	@PostMapping(value="/addcleaner")
	public String cleanerSignup(@Valid @ModelAttribute("cleaner") CleanerBean cleaner,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "cleanersignup";
		}
		return "home";
	}
	
	@RequestMapping(value="/usersignup")
	public String userSignup(@ModelAttribute("user") UserBean user) 
	{
		return "usersignup";
	}
	
	@PostMapping("/adduser")
	public String usersuccess(@Valid @ModelAttribute("user") UserBean user,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "usersignup";
		}
	return "home";
	}
	
	
	@InitBinder
	public void datebind(WebDataBinder wdb)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor cde = new CustomDateEditor(sdf,true);
		wdb.registerCustomEditor(Date.class,"dob",cde);
	}

}
