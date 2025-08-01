package com.proyecto.crudfullstack.crud_fullstack.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.crudfullstack.crud_fullstack.entity.User;
import com.proyecto.crudfullstack.crud_fullstack.service.UserService;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;







@RestController
@RequestMapping("/api/users")
//http:localhost:8080/api/users
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    //localhost:8080/api/users/create
    @PostMapping("/create")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    

    //localhost:8080/api/users
    @GetMapping
    public List<User>  findAll(){
        return userService.findAll();
    }

    

    //localhost:8080/api/users/1
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }


    //localhost:8080/api/users/4
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);

    }

    
    //localhost:8080/api/users
    @PutMapping
    public User updateUser(@RequestBody User user){
        User userDB = userService.findById(user.getIdUser());
        userDB.setName(user.getName());
        userDB.setEmail(user.getEmail());
        //AQUI PONGO MAS COSAS SI QUIERO QUE SE ACTUALIZEN 

        return userService.update(userDB);


    }

}
