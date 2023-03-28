package com.parkingmanager.parkingmanagerweb.user.adapter;

public package com.parkingmanager.parkingmanagerweb.user.adapter;

import com.parkingmanager.parkingmanagerweb.user.service.*;
import org.springframework.web.bind.annotation.RestController;

import com.parkingmanager.parkingmanagerweb.user.domain.User;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService UserService){
        this.userService = UserService;
    }

    @GetMapping("/api/users/{id}")
    public EntityModel<User> getUserById(@PathVariable Long id) {
            User user = userService.getById(id);
            return EntityModel.of(user,
            linkTo(methodOn(UserRestController.class).getUserById(id)).withSelfRel(),
            linkTo(methodOn(UserRestController.class).getAll()).withRel("users"));
    }
    @GetMapping(value="/api/users")
    public CollectionModel<EntityModel<User>> getAll() {
        List<EntityModel<User>> users = userService.readAll().stream()
        .map(user -> EntityModel.of(user,
            linkTo(methodOn(UserRestController.class).getUserById(user.getId())).withSelfRel(),
            linkTo(methodOn(UserRestController.class).getAll()).withRel("users")))
        .collect(Collectors.toList());
  
    return CollectionModel.of(users, linkTo(methodOn(UserRestController.class).getAll()).withSelfRel());
        
    }
    
    
}
 {
    
}
