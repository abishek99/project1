package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.UserPayment;

public interface PaymentDao extends JpaRepository<UserPayment, String>{

}
