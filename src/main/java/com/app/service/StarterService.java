package com.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.Starter;

public interface StarterService {
	 public Starter addStarter(Starter str, MultipartFile imageFile); // Add MultipartFile parameter for image
	    public Starter updateStarter(Starter str, Integer id, MultipartFile imageFile); // Add MultipartFile parameter for image update
	public List<Starter> getStarterList();
}
