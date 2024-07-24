package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SignUp {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	private String email;
	private String password;
	private String name;
	private String address;
	private Double mobNo;
	
	public void setAddress(String address) {
		this.address =address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMobNo() {
		return mobNo;
	}
	public void setMobNo(Double mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SignUp [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", address="
				+ address + ", mobNo=" + mobNo + "]";
	}
	


}
