package com.app.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.model.MainCourse;

public interface MainCourseService {
	public MainCourse addMainCourse(MainCourse maincr,  MultipartFile imageFile);
	public MainCourse updateMainCourse(MainCourse maincr,Integer id,  MultipartFile imageFile);
	public List<MainCourse> getMainCourseList();
}
