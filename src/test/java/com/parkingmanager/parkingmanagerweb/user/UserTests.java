package com.parkingmanager.parkingmanagerweb.user;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

//import java.util.Date;

import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.user.domain.User;

public class UserTests {

    private User david;
    private long id;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private String role;
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

    @Test
    void testGetFirstName() {
        david.getFirstName();
    }

    @Test
    void testGetFullName() {
        david.getFullName();
    }

    @Test
    void testGetId() {
        david.getId();
    }

    @Test
    void testGetLastName1() {
        david.getLastName1();
    }

    @Test
    void testGetLastName2() {
        david.getLastName2();
    }

    @Test
    void testGetRole() {
        david.getRole();
    }

    @Test
    void testSetFirstName() {
        this.firstName = david.getFirstName();
    }

    @Test
    void testSetId() {
        this.id = 54674;
    }

    @Test
    void testSetLastName1() {
        this.lastName1 = david.getLastName1();
    }

    @Test
    void testSetLastName2() {
        this.lastName2 = david.getLastName2();
    }

    @Test
    void testSetRole() {
        this.role = david.getRole();
    }
    
}
