package com.green.java.spring.addcodes.LovingBookEntity.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ACCOUNT")
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerID;

	@Column(name = "USERNAME")
	private String customerUsername;

	@Column(name = "PASSWORD")
	private String customerPassword;

	@Column(name = "FIRST_NAME")
	private String customerFirstName;

	@Column(name = "LAST_NAME")
	private String customerLastName;

	@Column(name = "YEAR_OF_BIRTH")
	private Integer customerYOB;

	@Column(name = "GENDER")
	private String customerGender;

	@Column(name = "EMAIL")
	private String customerEmail;

	@Column(name = "CUSTOMER_PHONE")
	private String customerPhone;

	@Column(name = "PHOTO")
	private String customerPhoto;

	@Column(name = "STATUS")
	private Boolean customerStatus;

	public Customer() {
		super();
	}

	public Customer(Integer customerID, String customerUsername, String customerFirstName, String customerLastName,
			Integer customerYOB, String customerGender, String customerEmail, String customerPhone,
			String customerPhoto, Boolean customerStatus) {
		super();
		this.customerID = customerID;
		this.customerUsername = customerUsername;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerYOB = customerYOB;
		this.customerGender = customerGender;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerPhoto = customerPhoto;
		this.customerStatus = customerStatus;
	}

	public Customer(Integer customerID, String customerUsername, String customerPassword, String customerFirstName,
			String customerLastName, Integer customerYOB, String customerGender, String customerEmail,
			String customerPhone, String customerPhoto, Boolean customerStatus) {
		super();
		this.customerID = customerID;
		this.customerUsername = customerUsername;
		this.customerPassword = customerPassword;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerYOB = customerYOB;
		this.customerGender = customerGender;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerPhoto = customerPhoto;
		this.customerStatus = customerStatus;
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public Integer getCustomerYOB() {
		return customerYOB;
	}

	public void setCustomerYOB(Integer customerYOB) {
		this.customerYOB = customerYOB;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerPhoto() {
		return customerPhoto;
	}

	public void setCustomerPhoto(String customerPhoto) {
		this.customerPhoto = customerPhoto;
	}

	public Boolean getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(Boolean customerStatus) {
		this.customerStatus = customerStatus;
	}

}
