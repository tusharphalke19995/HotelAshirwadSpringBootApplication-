package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Dssert;
import com.app.model.Rooms;
import com.app.repository.RoomsRepository;

@Service
public class RoomsServiceImpl implements RoomsService {
	
	
	
	@Autowired
	
	private RoomsRepository  roomsRepository;



	@Override
	public List<Rooms> getRoomsDetails() {
		return roomsRepository.findAll();
	}


	@Override
	public Rooms updateRoomDetails(Rooms rooms, Integer id, MultipartFile imageFile) {
		Rooms existingRooms = roomsRepository.findById(id).orElse(null);
	        if (existingRooms != null) {
	        	existingRooms.setAmenities(rooms.getAmenities());
	        	existingRooms.setAvailability(rooms.getAvailability());
	        	existingRooms.setBedType(rooms.getBedType());
	        	existingRooms.setDescription(rooms.getDescription());
	        	existingRooms.setFloor(rooms.getFloor());
	        	existingRooms.setOccupancy(rooms.getOccupancy());
	        	existingRooms.setPrice(rooms.getPrice());
	        	existingRooms.setRoomNo(rooms.getRoomNo());
	        	existingRooms.setRoomSize(rooms.getRoomSize());
	        	existingRooms.setRoomType(rooms.getRoomType());
	        	existingRooms.setView(rooms.getView());
	   

	            // Update other fields as needed
	            
	            try {
	                if (imageFile != null && !imageFile.isEmpty()) {
	                    byte[] imageData = imageFile.getBytes();
	                    existingRooms.setImage(imageData); // Update image data in the existing Starter object
	                }
	            } catch (IOException e) {
	                e.printStackTrace(); // Handle exception
	            }

	            return roomsRepository.save(existingRooms); // Save the updated Starter object
	        }
	        return null;
	}


	@Override
	public Rooms addRooms(Rooms rooms, MultipartFile imageFile) {
        try {
			
			if(imageFile != null && !imageFile.isEmpty()) {
				
				byte[] imgData =imageFile.getBytes();
				rooms.setImage(imgData);
				
			}
			
		}
		 catch (IOException e) {
	            e.printStackTrace(); // Handle exception
	        }
		
		return roomsRepository.save(rooms);
	}
	

	
	

}
