//package com.example.demo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
////import com.becoder.entity.User;
////import com.becoder.repository.UserRepo;
//import com.example.demo.model.SignUp;
//import com.example.demo.repositories.SignUpRepository;
//
//@Component
//public class CustomUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private SignUpRepository userRepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		SignUp user = userRepo.findByUsername(username);
//		System.out.println(user);
//		if (user == null) {
//			throw new UsernameNotFoundException("user not found");
//		} else {
//			return new CustomUser(user);
//		}
//
//	}
//
//}
