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
import com.app.model.Starter;
import com.app.service.MainCourseService;

@RestController
@CrossOrigin()
public class MainCourseController {
	
	@Autowired
	private MainCourseService mainCourseService; 

	
	@PostMapping("/addMianCourse")
	public ResponseEntity<?> addStarter(
	        @RequestParam("fullPrice") Long fullPrice,
	        @RequestParam("halfPrice") Long halfPrice,
	        @RequestParam("category") String category,
	        @RequestParam("crName") String crName,
	        @RequestParam("image") MultipartFile imageFile) {
	    
		MainCourse maincourse = new MainCourse();
		maincourse.setCrName(crName);
		maincourse.setCategory(category);
		maincourse.setHalfPrice(halfPrice);
		maincourse.setFullPrice(fullPrice);
	    
	    
	    MainCourse savedMainCourse = mainCourseService.addMainCourse(maincourse, imageFile);
	    return new ResponseEntity<>(savedMainCourse, HttpStatus.OK);
	}
	
	@GetMapping("/getMainCourseList")
	public List<MainCourse> getMainCourseList(){
		   List<MainCourse> mainCourseList = mainCourseService.getMainCourseList();
	        return mainCourseList;
	}
	
	
	
    @PutMapping("/updateMainCourse/{id}")
    public ResponseEntity<?> updateMainCourse(@PathVariable Integer id, @RequestPart("maincourse") MainCourse maincourse, @RequestPart(value = "image", required = false) MultipartFile imageFile) {
    	 MainCourse updatedMainCourse = mainCourseService.updateMainCourse(maincourse, id, imageFile);
        if (updatedMainCourse != null) {
            return new ResponseEntity<>(updatedMainCourse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Starter not found", HttpStatus.NOT_FOUND);
        }
    
    }
}
