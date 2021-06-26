package com.green.java.spring.addcodes.LovingBookEntity.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category {

	@Id
	@Column(name = "CATEGORY_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cateID;

	@Column(name = "CATEGORY_NAME")
	private String cateName;

	public Category() {
		super();
	}

	public Category(Integer cateID, String cateName) {
		super();
		this.cateID = cateID;
		this.cateName = cateName;
	}

	public Integer getCateID() {
		return cateID;
	}

	public void setCateID(Integer cateID) {
		this.cateID = cateID;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

}
