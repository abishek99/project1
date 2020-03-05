package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="user_payment")
public class UserPayment {

	@NotBlank(message = "{error.blank}")
	private String cardType;
	
	@NotBlank(message = "{error.blank}")
	private String type;
	
	@Id
	@Size(min=15,message="{error.cardnumber.size}")
	@NotBlank(message ="{error.blank}")
	private String cardNumber;
	
	@Size(message="{error.firstName.size}")
	@NotBlank(message ="{error.blank}")
	private String name;
	
	@NotNull(message = "Enter the value")
	private Integer valid;
	
	@NotNull(message = "Enter the value")
	private Integer until;
	
	
	private Integer cvv;

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValid() {
		return valid;
	}

	public void setValid(Integer valid) {
		this.valid = valid;
	}

	public Integer getUntil() {
		return until;
	}

	public void setUntil(Integer until) {
		this.until = until;
	}

	public Integer getCvv() {
		return cvv;
	}

	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

}
