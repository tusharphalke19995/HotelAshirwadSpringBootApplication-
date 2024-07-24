package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomType {
	
	 @Id	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	private String standard;
	private String deulx;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDeulx() {
		return deulx;
	}
	public void setDeulx(String deulx) {
		this.deulx = deulx;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "RoomType [standard=" + standard + ", deulx=" + deulx + "]";
	}
	
	

}
