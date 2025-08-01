package com.proyecto.crudfullstack.crud_fullstack.service;

import java.util.List;

import com.proyecto.crudfullstack.crud_fullstack.entity.User;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById (Long id);
    void deleteById(Long id);
    User update (User user);

}
