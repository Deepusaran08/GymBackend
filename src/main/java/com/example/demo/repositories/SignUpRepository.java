// SignUpRepository.java
package com.example.demo.repositories;

import com.example.demo.model.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignUpRepository extends JpaRepository<SignUp, Integer> {
	SignUp findByUsername(String username);

	boolean existsByUsername(String username);
	
}
