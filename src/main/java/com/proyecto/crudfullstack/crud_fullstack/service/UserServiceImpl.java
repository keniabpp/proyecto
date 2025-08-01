package com.proyecto.crudfullstack.crud_fullstack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyecto.crudfullstack.crud_fullstack.entity.User;
import com.proyecto.crudfullstack.crud_fullstack.exception.ResourceNotFoundException;
import com.proyecto.crudfullstack.crud_fullstack.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
        
    }

    @Override
    public List<User> findAll() {
        
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {

        User user = userRepository.findById(id).orElseThrow(
            () ->{
                throw new ResourceNotFoundException("User con id " +id+ "No se encuentra");
            }
        );
        
        //return userRepository.findById(id).get();
        return user;
    }

    @Override
    public User save(User user) {
        
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        
        return userRepository.save(user);
    }

}
