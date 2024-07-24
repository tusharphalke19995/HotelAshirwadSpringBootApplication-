package com.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.BreakFast;

public interface BreakFastService {
	public BreakFast addBreakfast(BreakFast breakfast,  MultipartFile imageFile);
	public BreakFast updateBreakfast(BreakFast breakfast,Integer id,  MultipartFile imageFile);
	public List<BreakFast> getBreakFastList();
}
