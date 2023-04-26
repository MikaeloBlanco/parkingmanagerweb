package com.parkingmanager.parkingmanagerweb.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;

//import java.util.Date;

import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.core.exceptions.UserExistsException;
import com.parkingmanager.parkingmanagerweb.user.domain.Role;
import com.parkingmanager.parkingmanagerweb.user.domain.User;
import com.parkingmanager.parkingmanagerweb.user.domain.UserDao;
import com.parkingmanager.parkingmanagerweb.user.service.UserServiceImpl;

public class UserTests {

    private User david;
    private Object userService;
    @BeforeEach
    public void init(){
        david = new User("dhorram@example.com","David", "Hormigo",  "Ramírez", Role.PROFESSOR, 'M');
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
        
        Role expected = Role.PROFESSOR;

        Role actual = david.getRole();

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
        Role expected = Role.PROFESSOR;
        david.setRole(Role.PROFESSOR);
        Role actual = david.getRole();
        assertEquals(expected, actual);
    }

    @Test
    void check_register(){
       UserDao mockDao = mock(UserDao.class);
       UserDao mockDao2 = mock(UserDao.class);
       mockDao.setEmail("miguel@gmail.com");
       try{
       ((UserServiceImpl) this.userService).register(mockDao);
       } catch(UserExistsException uee){

       }
       try{
        ((UserServiceImpl) this.userService).register(mockDao);
       } catch(UserExistsException uee){

       }
       mockDao2.setEmail("miguel@gmail.com");
       assertEquals(mockDao, mockDao2);
    }
    
}
