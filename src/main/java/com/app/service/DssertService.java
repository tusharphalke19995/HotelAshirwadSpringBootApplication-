package com.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.Dssert;


public interface DssertService {
	
	public Dssert addDssert(Dssert dssert,  MultipartFile imageFile);
	
	public Dssert updateDssert(Dssert dssert,Integer id, MultipartFile imageFile);
	
	public List<Dssert> getDssertList();
	
	

}
