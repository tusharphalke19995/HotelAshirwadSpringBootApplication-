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

import com.app.model.BreakFast;
import com.app.model.MainCourse;
import com.app.service.BreakFastService;


@RestController
@CrossOrigin()
public class BreakFastController {

	@Autowired
	private BreakFastService breakFastService; 
	
	
	@PostMapping("/addBreakfast")
	public ResponseEntity<?> addBreakfast(
			@RequestParam("crName") String crName,
	        @RequestParam("fullPrice") Long fullPrice,
	        @RequestParam("halfPrice") Long halfPrice,
	        @RequestParam("image") MultipartFile imageFile) {
	    
		BreakFast bkfast = new BreakFast();
		bkfast.setCrName(crName);
		bkfast.setHalfPrice(halfPrice);
		bkfast.setFullPrice(fullPrice);
	    
	    
		BreakFast savedBreakFast = breakFastService.addBreakfast(bkfast, imageFile);
	    return new ResponseEntity<>(savedBreakFast, HttpStatus.OK);
	}
	
	@GetMapping("/getBreakfastList")
	public List<BreakFast> getBreakFastList(){
		   List<BreakFast> breakFastList = breakFastService.getBreakFastList();
	        return breakFastList;
	}
	
	 @PutMapping("/updateBreakFast/{id}")
	    public ResponseEntity<?> updateBreakFast(@PathVariable Integer id, @RequestPart("breakfast") BreakFast breakfast, @RequestPart(value = "image", required = false) MultipartFile imageFile) {
	    	 BreakFast updatedBreakFast = breakFastService.updateBreakfast(breakfast, id, imageFile);
	        if (updatedBreakFast != null) {
	            return new ResponseEntity<>(updatedBreakFast, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Starter not found", HttpStatus.NOT_FOUND);
	        }
	    
	    }
	
}
