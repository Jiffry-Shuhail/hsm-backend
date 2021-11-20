package com.hsenidmobile.jiffry.controllers;

import com.hsenidmobile.jiffry.models.User;
import com.hsenidmobile.jiffry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/status/{user}/{status}")
    public String allAccess(@PathVariable User user, @PathVariable String status) {
        System.out.println(user.getUsername());
        user.setStatus(status);
        userRepository.save(user);
        return "Status Updated.";
    }
}
