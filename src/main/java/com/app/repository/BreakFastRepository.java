package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.BreakFast;



public interface BreakFastRepository extends JpaRepository<BreakFast, Integer>{
	public BreakFast findBycrName(String name);

}
