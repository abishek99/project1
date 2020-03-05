package com.cts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.dao.CleanerCredentials;
import com.cts.dao.UserCredentials;
import com.cts.model.CleanerBean;
import com.cts.model.ProfileBean;
import com.cts.model.UserBean;
import com.cts.service.CleanerDetails;
import com.cts.service.UserDetails;

@Controller
public class MyController {
	
	
	@Autowired
	private UserCredentials userdata;
	
	@Autowired
	private CleanerCredentials cleanerdata;
	

	@RequestMapping(value="/")
	public String launcherPage(@ModelAttribute("login")ProfileBean pro)
	{
		return "home";
	}
	
	@RequestMapping(value="/signup")
	public String register()
	{
		return "register";
	}
	

	@PostMapping("/login")
	public ModelAndView signIn(@Valid @ModelAttribute("login")ProfileBean profileBean,BindingResult br,HttpSession session) {

	ModelAndView mv=new ModelAndView("home", "flag", 1);



	if(br.hasErrors()) {

	mv=new ModelAndView("home");
	}


	if(profileBean.getLoginAs().equals("Admin")) {

	if(profileBean.getUserName().equals("Admin")
	&& profileBean.getPassword().equals("Admin"))

	mv=new ModelAndView("adminpage");

	}


	if(profileBean.getLoginAs().equals("User")) {

	UserBean user=userdata.validateUser(profileBean.getUserName(), profileBean.getPassword());

	if(user != null)
	{
	mv=new ModelAndView("addservice");
	session.setAttribute("user", user);
	}


	return mv;
	}



	if(profileBean.getLoginAs().equals("Cleaner")) {

	CleanerBean cleaner=cleanerdata.validateCleaner(profileBean.getUserName(),profileBean.getPassword());

	if(cleaner!= null)
	{
	mv=new ModelAndView("ViewService");
	session.setAttribute("cleaner",cleaner);
	}
	}

	return mv;
	}


	
	

}
