package com.parkingmanager.parkingmanagerweb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

//import java.util.Date;

import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.user.User;

public class UserTests {

    private User david;
    @BeforeEach
    public void init(){
        david = new User("David", "Hormigo",  "Ramírez", "Profesor");
    }

    @Test
    public void check_user_name() {
        
        String expected = "David";

        String actual = david.getFirstName();

        assertEquals(expected, actual);
    }
    @Test
    public void check_user_lastName1() {
        
        String expected = "Hormigo";

        String actual = david.getLastName1();

        assertEquals(expected, actual);
    }
    @Test
    public void check_user_lastName2() {
        
        String expected = "Ramírez";

        String actual = david.getLastName2();

        assertEquals(expected, actual);
    }
    @Test
    public void check_user_role() {
        
        String expected = "Profesor";

        String actual = david.getRole();

        assertEquals(expected, actual);
    }
    
}
