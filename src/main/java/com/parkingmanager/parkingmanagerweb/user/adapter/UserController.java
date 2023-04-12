package com.parkingmanager.parkingmanagerweb.user.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.domain.UserRepository;

/**
 * @author Miguel Blanco Fernández, Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 29/03/2023
 * Este es el controlador de la clase User la cual maneja los datos de la base de datos de User.
 */

@Controller
public class UserController {
    /**
     * Respositorio de la clase UserController que almacena los usuarios dentro de una base de datos. Esta autoconectado
    */
    @Autowired
    private UserRepository repository;

    /**
     * Auto mapeo de los usuarios dentro de la pagina web
     * @param model
     * @return todos los usuarios de la base de datos
     */
    @GetMapping("/users")
    public String showAllUsers(Model model){
        //Log.info("Devolviendo usuarios");
        model.addAttribute("users", repository.findAll());
        return "users";

    }
    /**
     * Auto mapeo del menú de creación de usuario dentro de la pagina web
     * @param model
     * @return Error de pagina blanca Ya que no se puede crear un usuario 
     */
    @GetMapping("/createUser")
    public String showForm(Model model){

        User user = new User();
        model.addAttribute("user", user);
        return "user/userlist";

    }
    
}
