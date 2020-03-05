package com.cts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="user_service")
public class ServiceBooking {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private Integer roomCount;
	
	@NotBlank(message = "{error.blank}")
	private String street;
	
	@NotBlank(message = "{error.blank}")
	private String city;
	
	@NotBlank(message = "{error.blank}")
	private String pincode;
	
	
	@Pattern(regexp="[0-9]{2}-[0-9]{2}-[0-9]{4}",message="{error.dob.invalid}")
	private String date;
	
	@NotBlank(message = "{error.blank}")
	private String timeSlot;
	
	@Pattern(regexp = "[0-9]{10}", message = "{error.contactNumber.invalid}")
	@NotBlank(message = "{error.blank}")
	private String contactNumber;

	public Integer getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(Integer roomCount) {
		roomCount = roomCount;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
