package com.cts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.model.CleanerBean;
import com.cts.model.ServiceBooking;
import com.cts.service.CleanerDetails;

@Controller
public class CleanerController {

	@Autowired
	private CleanerDetails cleanerDao;
	
	
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
		cleanerDao.registerCleaner(cleaner);
		return "cleanerdetailsadded";
	}
	

	

	
	@InitBinder
	public void datebind(WebDataBinder wdb)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD");
		CustomDateEditor cde = new CustomDateEditor(sdf,true);
		wdb.registerCustomEditor(Date.class,"dob",cde);
	}

}
