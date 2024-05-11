// LoginController.java
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
public class LoginController {

    @Autowired
    private SignUpRepository signUpRepository;
    @CrossOrigin(origins = "http://localhost:5173") 
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody SignUp loginRequest) {
        // Validation: Check if username and password are provided
        if (loginRequest.getUsername() == null || loginRequest.getUsername().isEmpty() ||
                loginRequest.getPassword() == null || loginRequest.getPassword().isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username and password are required!");
        }

        // Check if the provided username exists in the database
        SignUp existingUser = signUpRepository.findByUsername(loginRequest.getUsername());

        // If user does not exist or password does not match, return error
        if (existingUser == null || !existingUser.getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password!");
        }

        // If username and password match, return success message
        return ResponseEntity.ok("Login successful!");
    }
}
