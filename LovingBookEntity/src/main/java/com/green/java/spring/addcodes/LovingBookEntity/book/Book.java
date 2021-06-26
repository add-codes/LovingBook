package com.green.java.spring.addcodes.LovingBookEntity.book;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@Column(name = "BOOK_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookID;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "PUBLICATION_DATE")
	private Date publicationDate;

	@Column(name = "PRICE")
	private Double price;

	@Column(name = "QUANTITY")
	private Integer quantity;

	@Column(name = "PHOTO")
	private String photo;

	@Column(name = "PUBLISHER_ID")
	private Integer pubID;

	public Book() {
		super();
	}

	public Book(Integer bookID, String title, Date publicationDate, Double price, Integer quantity, String photo,
			Integer pubID) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.publicationDate = publicationDate;
		this.price = price;
		this.quantity = quantity;
		this.photo = photo;
		this.pubID = pubID;
	}

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getPubID() {
		return pubID;
	}

	public void setPubID(Integer pubID) {
		this.pubID = pubID;
	}

}
