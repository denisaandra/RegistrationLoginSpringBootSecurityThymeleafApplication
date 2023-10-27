package com.example.registrationloginSpringBootsecurityThymeleaf.service;

import com.example.registrationloginSpringBootsecurityThymeleaf.model.Role;
import com.example.registrationloginSpringBootsecurityThymeleaf.model.User;
import com.example.registrationloginSpringBootsecurityThymeleaf.repository.UserRepository;
import com.example.registrationloginSpringBootsecurityThymeleaf.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
