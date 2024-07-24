package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.SignUp;
import com.app.repository.SignUpRepository;

@Service
public class SignUpServiceIml implements SignUpService {
	
	@Autowired
	private SignUpRepository loginRepository;
	

	@Override
	public SignUp SignUpUser(SignUp loginData) {
		// TODO Auto-generated method stub
		return loginRepository.save(loginData);
	}


	@Override
	public List<SignUp> getUserList() {
		// TODO Auto-generated method stub
		return loginRepository.findAll();
	}
	
	
	


}
