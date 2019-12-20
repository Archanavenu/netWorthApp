package com.archana.demospringboot16thdec.controller;

import com.archana.demospringboot16thdec.model.User;
import com.archana.demospringboot16thdec.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private UserService userService;

    public RestController(UserService userService){
        this.userService=userService;
    }

// here no jsp is linked, we are directly using to print in the web page and no need of response body like how u used in controller
    @GetMapping("/")
    public String hello(){
        return "This is welcome page";
    }

    @GetMapping("/save-user")
    // this request param will ask the user to enter all the details
    public String saveUser(@RequestParam String username, @RequestParam String FirstName, @RequestParam String LastName,
                           @RequestParam String password, @RequestParam int age){
        User user= new User(username,FirstName, LastName, age,password);
        userService.CreateUser(user);
        return "User saved";

    }



}
