package com.luizxdev.userdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizxdev.userdept.entities.User;
import com.luizxdev.userdept.repositories.UserRepository;



@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){ //Busca Todos Usuarios
        return repository.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public User findUserById (@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping
    public User newUser(@RequestBody User user){
        return repository.save(user);
    }

    @DeleteMapping(value = "/{id}")
    public void deletUser(@PathVariable Long id){
        repository.deleteById(id);
    }


}
