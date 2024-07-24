package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Starter;
import com.app.repository.StarterRepository;
@Service
public class StarterServiceImpl implements StarterService{
	
	   @Autowired
	    private StarterRepository starterRepository;
	    
	    @Override
	    public Starter addStarter(Starter str, MultipartFile imageFile) {
	        try {
	            if (imageFile != null && !imageFile.isEmpty()) {
	                byte[] imageData = imageFile.getBytes();
	                str.setImage(imageData); // Set image data in the Starter object
	            }
	        } catch (IOException e) {
	            e.printStackTrace(); // Handle exception
	        }
	        return starterRepository.save(str); // Save the Starter object with image data
	    }

	    @Override
	    public Starter updateStarter(Starter str, Integer id, MultipartFile imageFile) {
	        Starter existingStarter = starterRepository.findById(id).orElse(null);
	        if (existingStarter != null) {
	            existingStarter.setStarterName(str.getStarterName());
	            existingStarter.setPrice(str.getPrice());
	            existingStarter.setCategory(str.getCategory());
	            // Update other fields as needed
	            
	            try {
	                if (imageFile != null && !imageFile.isEmpty()) {
	                    byte[] imageData = imageFile.getBytes();
	                    existingStarter.setImage(imageData); // Update image data in the existing Starter object
	                }
	            } catch (IOException e) {
	                e.printStackTrace(); // Handle exception
	            }

	            return starterRepository.save(existingStarter); // Save the updated Starter object
	        }
	        return null;
	    }

	    @Override
	    public List<Starter> getStarterList() {
	        return starterRepository.findAll(); // Retrieve all Starter objects from the repository
	    }


}
