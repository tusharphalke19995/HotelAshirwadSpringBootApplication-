package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.MainCourse;


public interface MainCourseRepository extends JpaRepository<MainCourse, Integer>{
	public MainCourse findBycrName(String name);

}
