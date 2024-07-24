package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.BreakFast;
import com.app.repository.BreakFastRepository;



@Service
public class BreakFastServiceImpl implements BreakFastService {
	
	@Autowired
	private BreakFastRepository breakFastRepository;

	
	  @Override
	    public BreakFast addBreakfast(BreakFast breakfast, MultipartFile imageFile) {
	        try {
	            if (imageFile != null && !imageFile.isEmpty()) {
	                byte[] imageData = imageFile.getBytes();
	                breakfast.setImage(imageData); // Set image data in the Starter object
	            }
	        } catch (IOException e) {
	            e.printStackTrace(); // Handle exception
	        }
	        return breakFastRepository.save(breakfast); // Save the Starter object with image data
	    }

	  
	@Override
	public List<BreakFast> getBreakFastList() {
		// TODO Auto-generated method stub
		return breakFastRepository.findAll();
	}


	 @Override
	    public BreakFast updateBreakfast(BreakFast breakfast, Integer id, MultipartFile imageFile) {
		 BreakFast existingBreakFast = breakFastRepository.findById(id).orElse(null);
	        if (existingBreakFast != null) {
	        	existingBreakFast.setCrName(breakfast.getCrName());
	        	existingBreakFast.setHalfPrice(breakfast.getHalfPrice());
	        	existingBreakFast.setFullPrice(breakfast.getFullPrice());
	            // Update other fields as needed
	            
	            try {
	                if (imageFile != null && !imageFile.isEmpty()) {
	                    byte[] imageData = imageFile.getBytes();
	                    existingBreakFast.setImage(imageData); // Update image data in the existing Starter object
	                }
	            } catch (IOException e) {
	                e.printStackTrace(); // Handle exception
	            }

	            return breakFastRepository.save(existingBreakFast); // Save the updated Starter object
	        }
	        return null;
	    }



}
