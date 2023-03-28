package com.parkingmanager.parkingmanagerweb.user.service;

import com.parkingmanager.parkingmanagerweb.user.domain.User;

public interface UserService{
    public Iterable<User> getAll();

    public void register(User user);

}