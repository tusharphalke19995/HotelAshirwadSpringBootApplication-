package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Starter {
	@Id	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private Integer id;
	 private String starterName;
	 private String   price;
	 private String category;
	 private byte[] image; 
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStarterName() {
		return starterName;
	}
	public void setStarterName(String starterName) {
		this.starterName = starterName;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
    // Add getters and setters for the new 'image' field
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Starter [id=" + id + ", starterName=" + starterName + ", price=" + price + ", category=" + category
				+ ", image=" + Arrays.toString(image) + "]";
	}

    

}
