package com.controller;

import com.jpa.User;
import com.jpa.UserJPARepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserJPARepository userJPARepository;

    @GetMapping(path = "/whoAmI")
    public String message() {
        return "Hello User Controller";
    }

    @GetMapping(path = "/user/{userId}")
    public String user(@PathVariable("userId") String userId) {
        User user = new User();
        user.setId(userId);
        user.setPassword("pass");
        user.setName("Sandeep");
        userJPARepository.save(user);
        log.info(" User is successfully created ");
        return "Hello ".concat(userId);
    }

}
