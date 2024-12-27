package com.project.controller;

import com.project.entity.userEntity;

import com.project.service.userService;

import jakarta.ws.rs.*;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class userController {
    public userService user_service;

    public userController(userService user_service) {
        this.user_service = user_service;
    }

    @GET
    @Path("/{userId}")
    public Response find_user(@PathParam("userId") UUID userId){
        return Response.ok(user_service.filterUser(userId)).build();
    }

    @POST
    public Response create_new_user(userEntity user) {
        return Response.status(Response.Status.CREATED).entity(user_service.createUser(user)).build();
    }

    @PUT
    @Path("/{userId}")
    public Response update_user(@PathParam("userId") UUID userId, userEntity user) {
        return Response.ok(user_service.updateUser(userId, user)).build();
    }

    @DELETE
    @Path("/{userId}")
    public Response delete_user(@PathParam("userId") UUID userId) {
        user_service.delete_user(userId);
        return Response.noContent().build();
    }
}

