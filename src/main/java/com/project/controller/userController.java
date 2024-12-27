package com.project.controller;

import com.project.entity.userEntity;

import com.project.service.userService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class userController {
    public userService user_service;

    public userController(userService user_service) {
        this.user_service = user_service;
    }

    @POST
    public Response create_new_user(userEntity user) {
        return Response.status(Response.Status.CREATED).entity(user_service.createUser(user)).build();
    }
}
