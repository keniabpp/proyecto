package com.proyecto.crudfullstack.crud_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.crudfullstack.crud_fullstack.entity.User;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {





}
