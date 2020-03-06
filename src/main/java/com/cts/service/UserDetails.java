package com.cts.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.UserCredentials;
import com.cts.model.UserBean;

@Service
public class UserDetails {
	
	@Autowired
	private UserCredentials userdao;

	public void registerUser(UserBean user)
	{
	
		userdao.save(user);
	}
	
	public String updateUser(UserBean user) {
		
		
		  Optional<UserBean> opt= userdao.findById(user.getUserId());
		 
		  UserBean u=opt.get();
		  BeanUtils.copyProperties(user, u);
	
		
		UserBean ub=userdao.save(user);
		
		if(ub != null)
			return "Updated Sucessfully";
		
		
		
		return "not updated..";
		
		
	}
	
}
