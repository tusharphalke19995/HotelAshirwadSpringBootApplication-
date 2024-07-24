package com.app.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.model.Dssert;
import com.app.repository.DssertRepository;

@Service
public class DssertServiceImpl implements DssertService{
	
	@Autowired
	private DssertRepository dsserRepository;

	@Override
	public Dssert addDssert(Dssert dssert, MultipartFile imageFile) {
		try {
			if(imageFile !=null && !imageFile.isEmpty()) {
				
				byte[] imgData =imageFile.getBytes();
				dssert.setImage(imgData);
				
			}
			
		} catch (IOException e) {
            e.printStackTrace(); // Handle exception
        }
		return dsserRepository.save(dssert);
	}

	@Override
	public Dssert updateDssert(Dssert dssert, Integer id, MultipartFile imageFile) {
		Dssert existingDssert = dsserRepository.findById(id).orElse(null);
	        if (existingDssert != null) {
	        	existingDssert.setName(dssert.getName());
	        	existingDssert.setFullPrice(dssert.getFullPrice());
	        	existingDssert.setHalfPrice(dssert.getHalfPrice());
	            // Update other fields as needed
	            
	            try {
	                if (imageFile != null && !imageFile.isEmpty()) {
	                    byte[] imageData = imageFile.getBytes();
	                    existingDssert.setImage(imageData); // Update image data in the existing Starter object
	                }
	            } catch (IOException e) {
	                e.printStackTrace(); // Handle exception
	            }

	            return dsserRepository.save(existingDssert); // Save the updated Starter object
	        }
	        return null;
	}

	@Override
	public List<Dssert> getDssertList() {
		// TODO Auto-generated method stub
		return dsserRepository.findAll();
	}
	

}
