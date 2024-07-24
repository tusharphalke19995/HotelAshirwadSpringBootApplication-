package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Dssert;

public interface DssertRepository extends JpaRepository<Dssert, Integer> {
	
	public Dssert findByName(Dssert dssert);

}
