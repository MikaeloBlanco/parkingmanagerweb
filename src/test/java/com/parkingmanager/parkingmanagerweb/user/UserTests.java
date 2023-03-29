package com.parkingmanager.parkingmanagerweb.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

//import java.util.Date;

import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.user.domain.User;

public class UserTests {

    private User david;
    @BeforeEach
    public void init(){
        david = new User("dhorram@example.com","David", "Hormigo",  "Ramírez", 'P', 'M');
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
        
        char expected = 'P';

        char actual = david.getRole();

        assertEquals(expected, actual);
    }

    @Test
    void check_user_email() {
        String expected = david.getEmail();

        String actual = "dhorram@example.com";

        assertEquals(expected, actual);
    }

    @Test
    void check_user_gender() {
        char expected = david.getGender();

        char actual = 'M';

        assertEquals(expected, actual);
    }

    @Test
    void check_user_set_firstName() {
        String expected = "david";
        david.setFirstName("david");
        String actual = david.getFirstName();
        assertEquals(expected, actual);
    }

    @Test
    void check_user_set_gender() {
        char expected = 'M';
        david.setGender('M');
        char actual = david.getGender();
        assertEquals(expected, actual);
    }

    @Test
    void check_user_set_lastName1() {
        String expected = "Hormigo";
        david.setFirstName("Hormigo");
        String actual = david.getLastName1();
        assertEquals(expected, actual);
    }

    @Test
    void check_user_set_lastName2() {
        String expected = "Ramirez";
        david.setFirstName("Ramirez");
        String actual = david.getFirstName();
        assertEquals(expected, actual);
    }

    @Test
    void check_user_set_role() {
        char expected = 'P';
        david.setRole('P');
        char actual = david.getRole();
        assertEquals(expected, actual);
    }
    
}
