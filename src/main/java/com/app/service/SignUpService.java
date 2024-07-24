package com.app.service;

import java.util.List;

import com.app.model.SignUp;

public interface SignUpService  {
	public SignUp SignUpUser(SignUp loginData);
	public List<SignUp> getUserList();
}
