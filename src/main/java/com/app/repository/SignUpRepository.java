package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.SignUp;
import java.util.List;


public interface SignUpRepository extends JpaRepository<SignUp, String>{
	public SignUp  findByName(String name);
}
