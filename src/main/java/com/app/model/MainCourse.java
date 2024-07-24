package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainCourse {
	@Id	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String crName;
	 private Long fullPrice;
	 private Long halfPrice;
	 private String category;
	 private byte[] image; 
		
	 
	 public MainCourse() {
			super();
			// TODO Auto-generated constructor stub
		}
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public Long getFullPrice() {
		return fullPrice;
	}
	public void setFullPrice(Long fullPrice) {
		this.fullPrice = fullPrice;
	}
	public Long getHalfPrice() {
		return halfPrice;
	}
	public void setHalfPrice(Long halfPrice) {
		this.halfPrice = halfPrice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "MainCourse [id=" + id + ", crName=" + crName + ", fullPrice=" + fullPrice + ", halfPrice=" + halfPrice
				+ ", category=" + category + ", image=" + Arrays.toString(image) + "]";
	}
	
}
