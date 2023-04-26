package com.parkingmanager.parkingmanagerweb.user.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nonnull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 26/04/2023
 */
public class UserDao {
    @Email(message ="El formato del correo es invalido")
    @NotBlank(message = "El correo no puede estar vacio")
    private String email;
    @NotBlank(message = "El nombre es obligatorio")
    private String firstName;
    @NotBlank(message = "El primer apellido es obligatorio")
    private String lastName1;
    private String lastName2;
    private char role;
    /**
     * Constructor vacio
     */
    public UserDao() {
        this("","","","",Character.MIN_VALUE);
    }
    /**
     * Constructor con datos
     * @param email Correo del usuario
     * @param firstName Nombre del usuario
     * @param lastName1 Apellido Primero
     * @param lastName2 Apellido Segundo
     * @param role Rol
     */
    public UserDao(String email, String firstName, String lastName1, String lastName2, char role) {
        this.email = email;
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.role = role;
    }
    
    /**
     * Getter para correo
     * @return El correo del usuario
     */
    public String getEmail() {
        return email;
    }
    
    /** 
     * @deprecated 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
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
}