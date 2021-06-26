package com.green.java.spring.addcodes.LovingBookEntity.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {

	@Id
	@Column(name = "ORDER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderID;

	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Column(name = "DISCOUNT_ID")
	private Integer discountID;

	@Column(name = "STATUS")
	private Boolean orderStatus;

	public Order() {
		super();
	}

	public Order(Integer orderID, Date orderDate, Integer discountID, Boolean orderStatus) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.discountID = discountID;
		this.orderStatus = orderStatus;
	}

	public Integer getOrderID() {
		return orderID;
	}

	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getDiscountID() {
		return discountID;
	}

	public void setDiscountID(Integer discountID) {
		this.discountID = discountID;
	}

	public Boolean getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

}
