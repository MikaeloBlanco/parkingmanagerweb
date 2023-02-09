package com.parkingmanager.parkingmanagerweb.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private List<User> userList;

    public UserRepository(){
        userList = new ArrayList<User>();
    }

    public List<User> getAll() {

        //TODO: Eliminar este codigo, es una simulación
        userList.clear();

        userList.add(new User("David","Hormigo","Ramírez",'p'));
        userList.add(new User("Perez","Hormigo","Ramírez",'p'));
        userList.add(new User("Guillermo","Hormigo","Ramírez",'p'));
        return userList;
        
    }
    
}
