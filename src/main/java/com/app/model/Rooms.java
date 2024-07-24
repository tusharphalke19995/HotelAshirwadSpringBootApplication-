package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rooms {


	 @Id	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer roomType;
	private Integer roomNo;
    private Integer occupancy;
	private String bedType;
	private String availability;
	private Integer price;
	private String amenities;
	private Integer roomSize;
	private String view;
	private String description;
	private Integer floor;
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
	public Integer getRoomType() {
		return roomType;
	}
	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}
	public Integer getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Integer roomNo) {
		this.roomNo = roomNo;
	}
	public Integer getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(Integer occupancy) {
		this.occupancy = occupancy;
	}
	public String getBedType() {
		return bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public Integer getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(Integer roomSize) {
		this.roomSize = roomSize;
	}
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "Rooms [id=" + id + ", roomType=" + roomType + ", roomNo=" + roomNo + ", occupancy=" + occupancy
				+ ", bedType=" + bedType + ", availability=" + availability + ", price=" + price + ", amenities="
				+ amenities + ", roomSize=" + roomSize + ", view=" + view + ", description=" + description + ", floor="
				+ floor + ", image=" + Arrays.toString(image) + "]";
	}

	
}
