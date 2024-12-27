package com.project.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

import java.util.UUID;

@Entity
@Table(name = "tb_user")
public class userEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID userId;

    public String userUsername;
    public String userName;
    public String userPassword;
    public String userEmail;
    public LocalDate userBirthday;

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public LocalDate getUserBirthday() {
        return userBirthday;
    }
    public void setUserBirthday(LocalDate userBirthday) {
        this.userBirthday = userBirthday;
    }
}
