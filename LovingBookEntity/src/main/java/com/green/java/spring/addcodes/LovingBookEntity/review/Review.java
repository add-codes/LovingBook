package com.green.java.spring.addcodes.LovingBookEntity.review;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REVIEW")
public class Review {

	@Id
	@Column(name = "REVIEW_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewID;

	@Column(name = "CONTENT")
	private String content;

	@Column(name = "REVIEW_DATE")
	private Date reviewDate;

	public Review() {
		super();
	}

	public Review(Integer reviewID, String content, Date reviewDate) {
		super();
		this.reviewID = reviewID;
		this.content = content;
		this.reviewDate = reviewDate;
	}

	public Integer getReviewID() {
		return reviewID;
	}

	public void setReviewID(Integer reviewID) {
		this.reviewID = reviewID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
