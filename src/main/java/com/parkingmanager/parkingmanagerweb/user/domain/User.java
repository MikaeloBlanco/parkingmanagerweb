package com.parkingmanager.parkingmanagerweb.user.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/**
 * @author Miguel Blanco Fernández, Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 29/03/2023
 * La entidad clase User que permite la creación e identificación de usuarios de sistema.
 */
@Entity
public class User {

    // Propiedades
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * Parametro de valor autogenerado e identificación de nombre id
     */
    private long id;
    @Nonnull
    /**
     * Parametro no nulo de tipo string de nombre email
     */
    private String email;
    /**
     * Parametro de tipo string de nombre firstName que almacena el nombre de la persona
     */
    private String firstName;
    /**
     * Parametro de tipo string de nombre lastName1 el cual tiene la función de almacenar el primer apellido de la persona
     */
    private String lastName1;
    /**
     * Parametro de tipo string de nombre lastName2 el cual tiene la funcion de almacenar el segundo apellido de la persona
     */
    private String lastName2;

    private char role;

    private char gender;
 
    // Constructores
    public User(String email,String firstName, String lastName1, String lastName2, char role, char gender) {
        this.email = email;
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.role = role;
        this.gender = gender;
    }
    public User() {
    }
    public long getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    
}
