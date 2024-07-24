package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.SignIn;
import com.app.repository.SignInRepository;


@Service
public class SignInServiceIml implements SignInService {


    @Autowired
    private SignInRepository signInRepository;

    @Override
    public boolean signInUser(SignIn signInData) {
        // Implement your authentication logic here
        SignIn user = signInRepository.findByName(signInData.getName());

        if (user != null && user.getPassword().equals(signInData.getPassword())) {
            return true; // Authentication successful
        } else {
            return false; // Authentication failed
        }
    }


}
