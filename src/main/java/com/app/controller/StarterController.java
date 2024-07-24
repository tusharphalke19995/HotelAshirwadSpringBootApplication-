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

import com.app.model.Starter;
import com.app.service.StarterService;

@RestController
@CrossOrigin()
public class StarterController {

	@Autowired
	private StarterService starterService;
	
	@PostMapping("/addStarter")
	public ResponseEntity<?> addStarter(@RequestParam("starterName") String starterName,
	        @RequestParam("price") String price,
	        @RequestParam("category") String category,
	        @RequestParam("image") MultipartFile imageFile) {
	    
	    Starter str = new Starter();
	    str.setStarterName(starterName);
	    str.setPrice(price);
	    str.setCategory(category);
	    
	    Starter savedStarter = starterService.addStarter(str, imageFile);
	    return new ResponseEntity<>(savedStarter, HttpStatus.OK);
	}

	
    @GetMapping("/getStarterList")
    public List<Starter> getStarterList() {
        List<Starter> starterList = starterService.getStarterList();
        return starterList;
    }

    @PutMapping("/updateStarter/{id}")
    public ResponseEntity<?> updateStarter(@PathVariable Integer id, @RequestPart("starter") Starter str, @RequestPart(value = "image", required = false) MultipartFile imageFile) {
        Starter updatedStarter = starterService.updateStarter(str, id, imageFile);
        if (updatedStarter != null) {
            return new ResponseEntity<>(updatedStarter, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Starter not found", HttpStatus.NOT_FOUND);
        }
    }

}
