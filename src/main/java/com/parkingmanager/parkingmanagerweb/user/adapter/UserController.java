package com.parkingmanager.parkingmanagerweb.user.adapter;

//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.parkingmanager.parkingmanagerweb.core.exceptions.UserExistsException;
import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.domain.UserDao;
import com.parkingmanager.parkingmanagerweb.user.domain.UserRepository;
import com.parkingmanager.parkingmanagerweb.user.service.UserService;
//import com.parkingmanager.parkingmanagerweb.user.service.UserServiceImpl;

import jakarta.validation.Valid;

/**
 * @author Miguel Blanco Fernández, Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 29/03/2023
 * Este es el controlador de la clase User la cual maneja los datos de la base de datos de User.
 */

@Controller
public class UserController {
    @Autowired
    private UserRepository repository;
    private Object userService;

    /**
     * Auto mapeo de los usuarios dentro de la pagina web
     * @param model Modelo de datos del controlador
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
     * @param model Modelo de datos del controlador 
     * @return Error de pagina blanca Ya que no se puede crear un usuario 
     */
    @GetMapping("/createUser")
    public String showForm(Model model){

        User user = new User();
        model.addAttribute("user", user);
        return "user/userlist";

    }
    @PostMapping("/newUser")
    public String showUserCreateForm(final @Valid @ModelAttribute("userDao") UserDao userDao,
            final BindingResult bindingResult, final Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("userDao", userDao);
            return "user/createform";
        }
        try {
            ((UserService) this.userService).register(userDao);
        } catch (UserExistsException exception) {
            bindingResult.rejectValue("email", "userData.email", "Ya existe un usuario con el correo");
            model.addAttribute("userDao", userDao);
            return "user/createform";
        }
        return "redirect:/users";
    }
    
}
