package com.cts.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.dao.UserCredentials;
import com.cts.model.ServiceBooking;
import com.cts.model.UserBean;
import com.cts.model.UserPayment;
import com.cts.service.PaymentService;
import com.cts.service.UserDetails;
import com.cts.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserDetails userDetails;
	
	@Autowired
	private UserService userservice;
	
	
	
	@Autowired
	private PaymentService paymentService;
	
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
		
		userDetails.registerUser(user);
		
		return "userdetailsadded";
	}
	
	
	
	@RequestMapping(value="/viewuser")
	public String viewService()
	{
		return "viewuser";
	}
	
	
	@RequestMapping(value="/bookingservice")
	public String addService(@ModelAttribute("service")ServiceBooking sb)
	{
		return "servicebooking";
	}
	
	@PostMapping("/serviceadded")
	public String service(@Valid @ModelAttribute("service")ServiceBooking sb,BindingResult br,Model m)
	{
		if(br.hasErrors())
		{
			return "servicebooking";

		}
		
		userservice.addservice(sb);
		
		m.addAttribute("id",sb.getId());
		
		return "paymethod";
		
	}
	
	@RequestMapping("/payment")
	public String payment(@ModelAttribute("payment")UserPayment up)
	{
		return "payment";
	}
	
	@PostMapping("/usersuccess")
	public String usersuccess(@Valid  @ModelAttribute("payment")UserPayment up,BindingResult br)
	{
		if(br.hasErrors())
		{
			return "payment";
		}
		
		paymentService.pay(up);
		return "serviceaddedsuccessfully";
	}
	
	
	@GetMapping("/updateUser")
	public String updateUser(HttpSession session,Model m) {
		
		
		UserBean user=(UserBean)session.getAttribute("user");
		
		m.addAttribute("user", user);
		
		
		
		
		return "updateUser";
		
	}
	
	
	@PostMapping("/updateUserProfile")
	public String updateUserProfile(UserBean user,Model m) {
		
		
		
	
		String msg=userDetails.updateUser(user);
		
		m.addAttribute("message", msg);
		
		
		return "updateSucess";
	}
	
	
	
	
	
	
	
	
	
	
	@InitBinder
	public void datebind(WebDataBinder wdb)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor cde = new CustomDateEditor(sdf,true);
		wdb.registerCustomEditor(Date.class,"date",cde);
		//wdb.registerCustomEditor(Date.class,"dob",cde);
	}

}
