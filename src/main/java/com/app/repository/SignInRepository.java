package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.SignIn;



public interface SignInRepository extends JpaRepository <SignIn,String> {
	
	public SignIn findByName(String name);

}
