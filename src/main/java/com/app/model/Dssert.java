package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dssert {
	
	@Id	
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	public String name;
	public Double halfPrice;
	public Double fullPrice;
	private byte[] image; 
	 
	 
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getHalfPrice() {
		return halfPrice;
	}
	public void setHalfPrice(Double halfPrice) {
		this.halfPrice = halfPrice;
	}
	public Double getFullPrice() {
		return fullPrice;
	}
	public void setFullPrice(Double fullPrice) {
		this.fullPrice = fullPrice;
	}
	@Override
	public String toString() {
		return "Dssert [id=" + id + ", name=" + name + ", halfPrice=" + halfPrice + ", fullPrice=" + fullPrice + "]";
	}
	

}
