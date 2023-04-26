package com.parkingmanager.parkingmanagerweb.user.service;

import com.parkingmanager.parkingmanagerweb.core.exceptions.UserExistsException;
import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.domain.UserDao;
/**
 * Interfaz de servicio para la clase User
 * @author Miguel Blanco Fernández, Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 29/03/2023
 */
public interface UserService{
    /**
     * Parametro Iterable que obtiene una lista de los usuarios vinculados a la clase User
     * @return Obtiene todos los usuarios de la clase User
     */
    public Iterable<User> getAll();
    /**
     * Registra un objeto de la clase User y no devuelve nada
     * @param user Es un objeto de la clase User que se introduce dentro de la base de datos
     */
    public void register(UserDao userDao) throws UserExistsException;
    /**
     * 
     */
    public boolean userExists(String email);

}