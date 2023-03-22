package com.parkingmanager.parkingmanagerweb.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;


    @GetMapping("/users")
    public String showAllUsers(Model model){
        //Log.info("Devolviendo usuarios");
        model.addAttribute("users", repository.findAll());
        return "userlist";

    }

    @GetMapping("/createUser")
    public String showForm(Model model){

        User user = new User();
        model.addAttribute("user", user);

        return "user/userlist";

    }
    
}
