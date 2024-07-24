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
import com.app.model.RoomType;
import com.app.service.RoomTypeService;

@RestController
@CrossOrigin()
public class RoomTypeController {
	
	@Autowired
	private RoomTypeService  roomTypeService;
	
	@GetMapping("/getRoomType")
	public List<RoomType> getRoomTypes(){
		   List<RoomType> getRoomTypeList = roomTypeService.getRoomTypeDetails();
	        return getRoomTypeList;
	}
	

}
