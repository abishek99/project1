package com.cts.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="cleaner_profile")
public class CleanerBean implements Serializable {

	@Size(max=20,message="{error.firstName.size}")
	@NotBlank(message="{error.blank}")
	private String firstName;
	
	@Size(min=1,max=15,message="{error.lastName.size}")
	@NotBlank(message="{error.blank}")
	private String lastName;
	
	@Past(message="error.dob.invalid")
	private Date dob;
	
	@Pattern(regexp="[0-9]{10}",message="{error.contactNumber.invalid}")
	@NotBlank(message="{error.blank}")
	private String contactNumber;
	
	private String gender;
	
	@Size(min=3,message="{error.userId.size}")
	@Id
	private String cleanerId;
	
	private String password;
	
	@NotBlank(message="{error.blank}")
	@Size(min=10,message="{error.license.size}")
	private String license;
	
	@NotBlank(message="{error.blank}")
	@Size(min=16,message="{error.aadharcard.size}")
	private String aadharCard;
	

	
	
	
	
	

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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
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

	public CleanerBean(String firstName, String lastName, Date dob, String contactNumber, String gender,
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




	
	
	
	
}
