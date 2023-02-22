package com.parkingmanager.parkingmanagerweb;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.util.Date;

import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.sorteo.Sorteo;
import com.parkingmanager.parkingmanagerweb.user.User;

public class Tests {

    @Test
    public void check_user_name() {
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "David";

        String actual = david.getFirstName();

        assertEquals(expected, actual);
    }

    public void check_user_lastName1() {
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "Hormigo";

        String actual = david.getLastName1();

        assertEquals(expected, actual);
    }

    public void check_user_lastName2() {
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "Ramírez";

        String actual = david.getLastName2();

        assertEquals(expected, actual);
    }

    public void check_user_role() {
        User david = new User("David", "Hormigo",  "Ramírez", "Profesor");
        String expected = "Profesor";

        String actual = david.getRole();

        assertEquals(expected, actual);
    }


    public void check_sorteo_estado(){

        Sorteo sorteo1 = new Sorteo("Primer sorteo Junio","19-06-2023","Completado");
        String expected = "Completado";

        String actual = sorteo1.getEstado();

        assertEquals(expected, actual);
    }
    
}
