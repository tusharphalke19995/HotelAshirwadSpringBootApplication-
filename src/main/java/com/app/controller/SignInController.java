package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.AuthResponse;
import com.app.model.JwtUtil;
import com.app.model.SignIn;
import com.app.service.SignInService;

import io.jsonwebtoken.JwtException;
@RestController
@CrossOrigin()
public class SignInController {

	 @Autowired
	 private JwtUtil jwtUtil;
	 
    @Autowired
	private SignInService  signInService; 

    @PostMapping("/sign-in")
    public ResponseEntity<?> signInUserInfo(@RequestBody SignIn signInData) {
        if (signInData == null || signInData.getName() == null || signInData.getPassword() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid sign-in data");
        }

        try {
            boolean isAuthenticated = signInService.signInUser(signInData);

            if (isAuthenticated) {
                String token = jwtUtil.generateToken(signInData);
                return ResponseEntity.ok(new AuthResponse(token));
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
            }
        } catch (JwtException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error generating JWT token");
        }
    }
}
