package com.example.registrationloginSpringBootsecurityThymeleaf.web;

import com.example.registrationloginSpringBootsecurityThymeleaf.service.UserService;
import com.example.registrationloginSpringBootsecurityThymeleaf.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto) { // We are going to use the ModelAttribute and we pass s user object, so basically this objet contains form data and we bind this form data to the dto object userRegistrationDto, this data comes from the UI layer
    userService.save(userRegistrationDto);
    return "redirect:/registration?success";
    }
}
