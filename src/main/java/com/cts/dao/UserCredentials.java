package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.UserBean;

@Repository
public interface UserCredentials extends JpaRepository<UserBean,String>{

	
	
	
}
