package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.MainCourse;
import com.app.model.Rooms;
import com.app.service.RoomsService;

@RestController
@CrossOrigin()
public class RoomsController {
	

	@Autowired
	private RoomsService roomsService;
	
	@GetMapping("/getRooms")
	public List<Rooms> getRoomsList(){
		
		List<Rooms> roomData = roomsService.getRoomsDetails();
		return roomData;
		
		
	}
	
	
	@PostMapping("/addRooms")
	public ResponseEntity<?> addRoomInfo(
			
			 @RequestParam("roomType") Integer roomType,
			 @RequestParam("roomNo") Integer roomNo,
			 @RequestParam("occupancy") Integer occupancy,
			 @RequestParam("price") Integer price,
			 @RequestParam("roomSize") Integer roomSize,
			 @RequestParam("floor") Integer floor,
			 @RequestParam("bedType") String bedType,
			 @RequestParam("availability") String availability,
			 @RequestParam("amenities") String amenities,
			 @RequestParam("view") String view,
			  @RequestParam("description") String description,
			     @RequestParam("image") MultipartFile imageFile
			) {
		
		Rooms rmobj = new Rooms();
		
		
		rmobj.setAmenities(amenities);
		rmobj.setAvailability(availability);
		rmobj.setBedType(bedType);
		rmobj.setDescription(description);
		rmobj.setFloor(floor);
		rmobj.setOccupancy(occupancy);
		rmobj.setPrice(price);
		rmobj.setRoomNo(roomNo);
		rmobj.setRoomSize(roomSize);
		rmobj.setRoomType(roomType);
		rmobj.setView(view);
				
		
		
		
	    Rooms saveRooms =roomsService.addRooms(rmobj, imageFile);
	    return new ResponseEntity<>(saveRooms, HttpStatus.OK);
	}
	
	
	 @PutMapping("/updateRooms/{id}")
	    public ResponseEntity<?> updateRooms(@PathVariable Integer id, @RequestPart("rooms") Rooms rooms, @RequestPart(value = "image", required = false) MultipartFile imageFile) {
	    	 Rooms updatedRooms = roomsService.updateRoomDetails(rooms, id, imageFile);
	        if (updatedRooms != null) {
	            return new ResponseEntity<>(updatedRooms, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Rooms not found", HttpStatus.NOT_FOUND);
	        }
	 }
}
