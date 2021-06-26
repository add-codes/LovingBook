package com.green.java.spring.addcodes.LovingBookEntity.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PUBLISHER")
public class Publisher {

	@Id
	@Column(name = "PUBLISHER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pubID;

	@Column(name = "PUBLISHER_NAME")
	private String pubName;

	@Column(name = "PHONE_CONTACT")
	private String pubContact;

	public Publisher() {
		super();
	}

	public Publisher(Integer pubID, String pubName, String pubContact) {
		super();
		this.pubID = pubID;
		this.pubName = pubName;
		this.pubContact = pubContact;
	}

	public Integer getPubID() {
		return pubID;
	}

	public void setPubID(Integer pubID) {
		this.pubID = pubID;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getPubContact() {
		return pubContact;
	}

	public void setPubContact(String pubContact) {
		this.pubContact = pubContact;
	}

}
