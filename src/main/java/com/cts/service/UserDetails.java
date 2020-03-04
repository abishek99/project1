package com.cts.service;

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
}
