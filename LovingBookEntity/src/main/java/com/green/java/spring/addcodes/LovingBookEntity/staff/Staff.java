package com.green.java.spring.addcodes.LovingBookEntity.staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAFF_ACCOUNT")
public class Staff {

	@Id
	@Column(name = "STAFF_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer staffID;

	@Column(name = "USERNAME")
	private String staffUsername;

	@Column(name = "PASSWORD")
	private String staffPassword;

	@Column(name = "FIRST_NAME")
	private String staffFirstName;

	@Column(name = "LAST_NAME")
	private String staffLastName;

	@Column(name = "YEAR_OF_BIRTH")
	private Integer staffYOB;

	@Column(name = "GENDER")
	private String staffGender;

	@Column(name = "EMAIL")
	private String staffEmail;

	@Column(name = "STAFF_PHONE")
	private String staffPhone;

	@Column(name = "PHOTO")
	private String staffPhoto;

	@Column(name = "STATUS")
	private Boolean staffStatus;

	public Staff() {
		super();
	}

	public Staff(Integer staffID, String staffUsername, String staffFirstName, String staffLastName, Integer staffYOB,
			String staffGender, String staffEmail, String staffPhone, String staffPhoto, Boolean staffStatus) {
		super();
		this.staffID = staffID;
		this.staffUsername = staffUsername;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffYOB = staffYOB;
		this.staffGender = staffGender;
		this.staffEmail = staffEmail;
		this.staffPhone = staffPhone;
		this.staffPhoto = staffPhoto;
		this.staffStatus = staffStatus;
	}

	public Staff(Integer staffID, String staffUsername, String staffPassword, String staffFirstName,
			String staffLastName, Integer staffYOB, String staffGender, String staffEmail, String staffPhone,
			String staffPhoto, Boolean staffStatus) {
		super();
		this.staffID = staffID;
		this.staffUsername = staffUsername;
		this.staffPassword = staffPassword;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffYOB = staffYOB;
		this.staffGender = staffGender;
		this.staffEmail = staffEmail;
		this.staffPhone = staffPhone;
		this.staffPhoto = staffPhoto;
		this.staffStatus = staffStatus;
	}

	public Integer getStaffID() {
		return staffID;
	}

	public void setStaffID(Integer staffID) {
		this.staffID = staffID;
	}

	public String getStaffUsername() {
		return staffUsername;
	}

	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}

	public String getStaffPassword() {
		return staffPassword;
	}

	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Integer getStaffYOB() {
		return staffYOB;
	}

	public void setStaffYOB(Integer staffYOB) {
		this.staffYOB = staffYOB;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffPhone() {
		return staffPhone;
	}

	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}

	public String getStaffPhoto() {
		return staffPhoto;
	}

	public void setStaffPhoto(String staffPhoto) {
		this.staffPhoto = staffPhoto;
	}

	public Boolean getStaffStatus() {
		return staffStatus;
	}

	public void setStaffStatus(Boolean staffStatus) {
		this.staffStatus = staffStatus;
	}

}
