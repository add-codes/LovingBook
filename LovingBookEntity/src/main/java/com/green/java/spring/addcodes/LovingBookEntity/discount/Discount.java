package com.green.java.spring.addcodes.LovingBookEntity.discount;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISCOUNT")
public class Discount {

	@Id
	@Column(name = "DISCOUNT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer discountID;

	@Column(name = "DISCOUNT_NAME")
	private String discountName;

	@Column(name = "DISCOUNT_VALUE")
	private Integer discountValue;

	@Column(name = "DISCOUNT_EXPIRE")
	private Date discountExpire;

	public Discount() {
		super();
	}

	public Discount(Integer discountID, String discountName, Integer discountValue, Date discountExpire) {
		super();
		this.discountID = discountID;
		this.discountName = discountName;
		this.discountValue = discountValue;
		this.discountExpire = discountExpire;
	}

	public Integer getDiscountID() {
		return discountID;
	}

	public void setDiscountID(Integer discountID) {
		this.discountID = discountID;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public Integer getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(Integer discountValue) {
		this.discountValue = discountValue;
	}

	public Date getDiscountExpire() {
		return discountExpire;
	}

	public void setDiscountExpire(Date discountExpire) {
		this.discountExpire = discountExpire;
	}

}
