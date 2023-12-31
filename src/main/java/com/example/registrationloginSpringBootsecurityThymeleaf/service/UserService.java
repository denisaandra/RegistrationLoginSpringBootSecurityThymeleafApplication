package com.example.registrationloginSpringBootsecurityThymeleaf.service;

import com.example.registrationloginSpringBootsecurityThymeleaf.model.User;
import com.example.registrationloginSpringBootsecurityThymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends UserDetailsService {
    /* dto = Data Transfer Object, is a design pattern and we use it to transfer data between server to client and vice versa.
    Instead of passing a single piece of information, we can use dto object to pass a bulk amount of information from server and client and vice versa. */

    User save(UserRegistrationDto registrationDto);
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
