package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.CleanerBean;

@Repository
public interface CleanerCredentials extends JpaRepository<CleanerBean,String>{

	
	
	
	@Query("select c from CleanerBean c where c.cleanerId=:userName AND c.password=:password" )
	public CleanerBean validateCleaner(String userName,String password);

	
}
