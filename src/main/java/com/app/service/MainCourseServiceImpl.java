package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.MainCourse;
import com.app.model.Starter;
import com.app.repository.MainCourseRepository;

@Service
public class MainCourseServiceImpl implements MainCourseService{

	
	@Autowired
	private MainCourseRepository mainCourseRepository;
	

    @Override
    public MainCourse addMainCourse(MainCourse maincr, MultipartFile imageFile) {
        try {
            if (imageFile != null && !imageFile.isEmpty()) {
                byte[] imageData = imageFile.getBytes();
                maincr.setImage(imageData); // Set image data in the Starter object
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle exception
        }
        return mainCourseRepository.save(maincr); // Save the Starter object with image data
    }

	
	
	   @Override
	    public MainCourse updateMainCourse(MainCourse maincr, Integer id, MultipartFile imageFile) {
		   MainCourse existingMainCourse = mainCourseRepository.findById(id).orElse(null);
	        if (existingMainCourse != null) {
	        	existingMainCourse.setCategory(maincr.getCategory());
	        	existingMainCourse.setCrName(maincr.getCrName());
	        	existingMainCourse.setHalfPrice(maincr.getHalfPrice());
	        	existingMainCourse.setFullPrice(maincr.getFullPrice());
	            // Update other fields as needed
	            
	            try {
	                if (imageFile != null && !imageFile.isEmpty()) {
	                    byte[] imageData = imageFile.getBytes();
	                    existingMainCourse.setImage(imageData); // Update image data in the existing Starter object
	                }
	            } catch (IOException e) {
	                e.printStackTrace(); // Handle exception
	            }

	            return mainCourseRepository.save(existingMainCourse); // Save the updated Starter object
	        }
	        return null;
	    }


	@Override
	public List<MainCourse> getMainCourseList() {
		// TODO Auto-generated method stub
		return mainCourseRepository.findAll();
	}

}