package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.CleanerCredentials;
import com.cts.dao.UserCredentials;
import com.cts.model.CleanerBean;
import com.cts.model.UserBean;

@Service
public class CleanerDetails {
	
	@Autowired
	private CleanerCredentials cleanerDao;

	public void registerCleaner(CleanerBean cleaner)
	{
	
		cleanerDao.save(cleaner);
	}

}
