package com.example.egrobots.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

    public UserEntity addUser(UserEntity user){
     return userRepository.save(user);
    }

    public UserEntity getUser(int id){
        return userRepository.findById(id).get();
    }
}
