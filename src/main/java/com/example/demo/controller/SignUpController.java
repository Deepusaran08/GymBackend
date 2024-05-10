// SignUpController.java
package com.example.demo.controller;

import com.example.demo.model.SignUp;
import com.example.demo.repositories.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {

    @Autowired
    private SignUpRepository signUpRepository;

    @PostMapping("/signup")
    public String signUp(@RequestBody SignUp signUpRequest) {
        // Validation: Check if all fields are provided
        if (signUpRequest.getName() == null || signUpRequest.getName().isEmpty() ||
                signUpRequest.getUsername() == null || signUpRequest.getUsername().isEmpty() ||
                signUpRequest.getPassword() == null || signUpRequest.getPassword().isEmpty() ||
                signUpRequest.getGymName() == null || signUpRequest.getGymName().isEmpty() ||
                signUpRequest.getMobileNumber() == null || signUpRequest.getMobileNumber().isEmpty()) {
            return "All fields are required!";
        }

        // Save the signup data into the database
        signUpRepository.save(signUpRequest);

        return "Signup successful!";
    }
}
