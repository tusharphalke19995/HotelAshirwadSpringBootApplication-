package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BreakFast {
	@Id	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String crName;
	 private Long fullPrice;
	 private Long halfPrice;
	 private byte[] image; 
	 
	 public BreakFast() {
			super();
			// TODO Auto-generated constructor stub
		}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
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


	@Override
	public String toString() {
		return "BreakFast [id=" + id + ", crName=" + crName + ", fullPrice=" + fullPrice + ", halfPrice=" + halfPrice
				+ ", image=" + Arrays.toString(image) + "]";
	}
	
}
