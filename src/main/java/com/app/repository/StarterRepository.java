package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Starter;

public interface StarterRepository extends JpaRepository<Starter, Integer>{
	public Starter findBystarterName(String name);

}
