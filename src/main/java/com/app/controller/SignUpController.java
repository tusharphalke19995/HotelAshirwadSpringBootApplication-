package com.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.SignUp;
import com.app.service.SignUpService;


@RestController
@CrossOrigin()
public class SignUpController {
	
    @Autowired
	private SignUpService  loginService; 

	@PostMapping("/sign-up")
	public ResponseEntity<?> signUpUSerInfo(@RequestBody SignUp signUpData){
		return new ResponseEntity(loginService.SignUpUser(signUpData), HttpStatus.OK);
		
	}
	@GetMapping("/getUserList")
	public List<SignUp> getMainCourseList(){
		   List<SignUp> useList = loginService.getUserList();
	        return useList;
	}
}
