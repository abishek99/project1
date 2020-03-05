package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.PaymentDao;
import com.cts.model.UserPayment;
@Service
public class PaymentService {

	@Autowired
	private PaymentDao paymentdetails;
	
	public void pay(UserPayment userPayment)
	{
		paymentdetails.save(userPayment);
	}
}
