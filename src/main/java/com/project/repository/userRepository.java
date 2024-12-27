package com.project.repository;

import com.project.entity.userEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import jakarta.enterprise.context.Dependent;

import java.util.UUID;

@Dependent
public class userRepository implements PanacheRepositoryBase<userEntity, UUID> {
}
