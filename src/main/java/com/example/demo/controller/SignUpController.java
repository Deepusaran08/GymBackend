// SignUpController.java
package com.example.demo.controller;

import com.example.demo.model.SignUp;
import com.example.demo.repositories.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class SignUpController {

    @Autowired
    private SignUpRepository signUpRepository;
     
    @PostMapping("/signup")
    public ResponseEntity<String> signUp(@RequestBody SignUp signUpRequest) {
        // Validation: Check if all fields are provided
        if (signUpRequest.getName() == null || signUpRequest.getName().isEmpty() ||
                signUpRequest.getUsername() == null || signUpRequest.getUsername().isEmpty() ||
                signUpRequest.getPassword() == null || signUpRequest.getPassword().isEmpty() ||
                signUpRequest.getGymName() == null || signUpRequest.getGymName().isEmpty() ||
                signUpRequest.getMobileNumber() == null || signUpRequest.getMobileNumber().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("All fields are required!");
        }
        
        // Check if the username already exists
        if (signUpRepository.existsByUsername(signUpRequest.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists");
        }

        // Save the signup data into the database
        signUpRepository.save(signUpRequest);

        return ResponseEntity.status(HttpStatus.OK).body("SignUp Successfully");
    }
}
