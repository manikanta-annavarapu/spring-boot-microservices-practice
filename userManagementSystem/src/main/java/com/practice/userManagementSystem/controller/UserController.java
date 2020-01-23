package com.practice.userManagementSystem.controller;

import com.practice.userManagementSystem.dto.User;
import com.practice.userManagementSystem.service.UserService;
import com.practice.userManagementSystem.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import java.net.URI;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return  userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id){
        return  userService.getUser(id);
    }

    @PostMapping("/user")
    public ResponseEntity<Object> addUser(@RequestBody User user){
        userService.addUser(user);
        URI path = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        System.out.println(path.toString());
        return ResponseEntity.created(path).build();
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public User deleteUser(@PathVariable int  id){
        return userService.deleteUser(id);
    }
}
