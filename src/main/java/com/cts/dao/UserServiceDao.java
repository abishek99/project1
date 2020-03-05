package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.ServiceBooking;

@Repository
public interface UserServiceDao extends JpaRepository<ServiceBooking, Integer>{


	
	
}
