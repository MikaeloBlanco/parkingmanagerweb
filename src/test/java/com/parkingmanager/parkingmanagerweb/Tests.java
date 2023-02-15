package com.parkingmanager.parkingmanagerweb;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.util.Date;

import org.junit.jupiter.api.Test;

//import com.parkingmanager.parkingmanagerweb.sorteo.Sorteo;
import com.parkingmanager.parkingmanagerweb.user.User;

public class Tests {

    @Test
    public void check_user_name() {
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "David";

        String actual = david.getFirstName();

        assertEquals(expected, actual);
    }


    
}
