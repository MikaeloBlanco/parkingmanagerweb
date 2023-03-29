package com.parkingmanager.parkingmanagerweb.user.service;

import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingmanager.parkingmanagerweb.user.domain.*;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public void register(User user) {

        User usuario = new User();
        BeanUtils.copyProperties(user, usuario);
        this.userRepository.save(usuario);
    }
    
}
