package com.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.Rooms;

public interface RoomsService {
	
	public Rooms addRooms(Rooms rooms, MultipartFile imageFile);
	public Rooms updateRoomDetails(Rooms rooms, Integer id, MultipartFile imageFile);
	public List<Rooms> getRoomsDetails();
	

}
