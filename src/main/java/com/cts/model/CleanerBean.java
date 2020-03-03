package com.cts.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


public class CleanerBean implements Serializable {

	
	private String firstName;
	
	private String lastName;
	
	private Date dob;
	
	private Integer contactNumber;
	
	private String gender;
	

	private String cleanerId;
	
	private String password;
	
	private String license;
	
	private String aadharCard;
	
	
	private String roleStatus;
	
	
	
	
	
	

	public CleanerBean() {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.cleanerId = cleanerId;
		this.password = password;
		this.license = license;
		this.aadharCard = aadharCard;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Integer getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCleanerId() {
		return cleanerId;
	}

	public void setCleanerId(String cleanerId) {
		this.cleanerId = cleanerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public CleanerBean(String firstName, String lastName, Date dob, Integer contactNumber, String gender,
			String cleanerId, String password, String license, String aadharCard) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.cleanerId = cleanerId;
		this.password = password;
		this.license = license;
		this.aadharCard = aadharCard;
	}

	public String getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}
	



	
	
	
	
}
