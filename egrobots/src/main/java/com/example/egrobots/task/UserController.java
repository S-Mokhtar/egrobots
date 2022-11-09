package com.example.egrobots.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping
    public UserEntity addUser(@RequestBody UserEntity user){
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable int id){
        return userService.getUser(id);
    }

}
