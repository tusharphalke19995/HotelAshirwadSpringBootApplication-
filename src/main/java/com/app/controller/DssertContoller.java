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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Dssert;
import com.app.service.DssertService;

@RestController
@CrossOrigin()
public class DssertContoller {

	@Autowired
	private DssertService dssertService;
	
	
	@PostMapping("/addDssert")
	public ResponseEntity<?> addDssert(
			
			@RequestParam("name") String name,
			@RequestParam("halfPrice") Double halfPrice,
			@RequestParam("fullPrice") Double fullPrice,
			@RequestParam("image") MultipartFile imageFile){
		
		Dssert objDssert = new Dssert();
		objDssert.setName(name);
		objDssert.setFullPrice(fullPrice);
		objDssert.setHalfPrice(halfPrice);
		
		Dssert savedssert =dssertService.addDssert(objDssert, imageFile);
		
        return new ResponseEntity<>(savedssert,HttpStatus.OK);
	
	}
	
	
	@GetMapping("/getDssertList")
	public List<Dssert> getDssertList(){
		List<Dssert> dssertData =dssertService.getDssertList();
		return dssertData;
		
	}
			
	
	@PutMapping("/updateDssert/{id}")
	
	 public ResponseEntity<?> updateDssert(@PathVariable Integer id, @RequestPart("dssert") Dssert dssert, @RequestPart(value = "image", required = false) MultipartFile imageFile) {
		Dssert updatedDssert = dssertService.updateDssert(dssert, id, imageFile);
       if (updatedDssert != null) {
           return new ResponseEntity<>(updatedDssert, HttpStatus.OK);
       } else {
           return new ResponseEntity<>("Dssert not found", HttpStatus.NOT_FOUND);
       }
   
   }	
			
	
	
}
