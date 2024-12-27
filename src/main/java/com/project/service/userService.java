package com.project.service;

import com.project.entity.userEntity;

import com.project.repository.userRepository;

import jakarta.enterprise.context.Dependent;

import jakarta.transaction.Transactional;

@Dependent
public class userService {
    public userRepository user_repository;

    public userService(userRepository user_repository) {
        this.user_repository = user_repository;
    }

    @Transactional
    public userEntity createUser(userEntity user){
        user_repository.persist(user);
        return user;
    }
}
