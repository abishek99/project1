package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.UserServiceDao;
import com.cts.model.ServiceBooking;

@Service
public class UserService {

	@Autowired
	private UserServiceDao userservicedao;
	
	public void addservice(ServiceBooking sb)
	{
		userservicedao.save(sb);
	}

}
