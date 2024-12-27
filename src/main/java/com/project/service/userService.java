package com.project.service;

import com.project.entity.userEntity;

import com.project.exception.customException;

import com.project.repository.userRepository;

import jakarta.enterprise.context.Dependent;

import jakarta.transaction.Transactional;

import java.util.UUID;

@Dependent
public class userService {
    public userRepository user_repository;

    public userService(userRepository user_repository) {
        this.user_repository = user_repository;
    }

    @Transactional
    public userEntity filterUser(UUID userId) {
        return user_repository.findByIdOptional(userId).orElseThrow(customException::new);
    }

    @Transactional
    public userEntity createUser(userEntity user) {
        if (user == null) {
            throw new IllegalArgumentException("User entity cannot be null");
        }
        user_repository.persist(user);
        return user;
    }

    @Transactional
    public userEntity updateUser(UUID userId, userEntity user){
        userEntity usuario = filterUser(userId);
        usuario.setUserName(usuario.getUserName());
        usuario.setUserUsername(usuario.getUserUsername());
        usuario.setUserEmail(usuario.getUserEmail());
        usuario.setUserPassword(usuario.getUserPassword());
        usuario.setUserBirthday(usuario.getUserBirthday());
        user_repository.persist(usuario);
        return usuario;
    }

    @Transactional
    public void delete_user(UUID userId) {
        user_repository.delete(filterUser(userId));
    }
}
