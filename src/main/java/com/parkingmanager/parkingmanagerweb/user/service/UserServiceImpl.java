package com.parkingmanager.parkingmanagerweb.user.service;

import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingmanager.parkingmanagerweb.core.exceptions.UserExistsException;
import com.parkingmanager.parkingmanagerweb.user.domain.*;
/**
 * Este programa es un servicio implementado de la interfaz UserService para la obtención de datos que le pide.
 */
@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    /**
     * Constructor de UserServiceImpl que introduce nuevos usuarios al repositorio
     * @param userRepository repositorio de usuarios del sistema
     */
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    /**
     * Sobrescribe los datos que se le introducen, obtiene una lista de los usuarios dentro de la base de datos
     */
    @Override
    public Iterable<User> getAll() {
        return this.userRepository.findAll();
    }
    /**
     * Sobrescribre los datos que se le introducen, genera un nuevo objeto usuario, procede a copiar las porpiedades y a ser
     * guardado dentro del repositorio en la base de datos.
     */
    public void register(UserDao userDao) throws UserExistsException {
        if (userExists(userDao.getEmail())){
            throw new UserExistsException();
        }
        User usuario = new User();
        BeanUtils.copyProperties(userDao, usuario);
        this.userRepository.save(usuario);
    }
    @Override
    public boolean userExists(String email) {
       return this.userRepository.findByEmail(email) != null ? true : false;
    }
}
