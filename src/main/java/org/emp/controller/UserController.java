package org.emp.controller;

import lombok.RequiredArgsConstructor;
import org.emp.dto.User;
import org.emp.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

   final UserService service;
    @PostMapping("/auth/login")
    public boolean login(@RequestBody User user){
       return service.login(user);
    }
    @PostMapping("/register")
    public String register(@RequestBody User user){
        return service.register(user);
    }
}
