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
    /**
     * Parametro de tipo character de nombre role para la asignación de un rol preasignado
     */
    private char role;
    /**
     * Parametro de tipo character de nombre gender para la asignación de un género identificable
     */
    private char gender;
 
    // Constructores
    /**
     * Constructor de la clase User
     * @param email
     * @param firstName
     * @param lastName1
     * @param lastName2
     * @param role
     * @param gender
     */
    public User(String email,String firstName, String lastName1, String lastName2, char role, char gender) {
        this.email = email;
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.role = role;
        this.gender = gender;
    }
    /**
     * Constructor secundario de la clase User
     */
    public User() {
    }
    /**
     * Getter del parametro id
     * @return identificador de usuario
     */
    public long getId() {
        return id;
    }
    /**
     * Getter del parametro email
     * @return email de usuario 
     */
    public String getEmail() {
        return email;
    }
    /**
     * Setter del parametro email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    // Métodos
    /**
     * Getter del parametro firstName
     * @return nombre del usuario
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter del parametro firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Getter del parametro lastName1
     * @return primer apellido del usuario
     */
    public String getLastName1() {
        return lastName1;
    }
    /**
     * Setter del parametro lastName1
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }
    /**
     * Getter del parametro lastName2
     * @return segundo apellido del usuario
     */
    public String getLastName2() {
        return lastName2;
    }
    /**
     * Setter del parametro lastName2
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Getter del parametro role
     * @return rol del usuario
     */
    public char getRole() {
        return role;
    }
    /**
     * Setter del parametro role
     * @param role
     */
    public void setRole(char role) {
        this.role = role;
    }
    /**
     * Getter del parametro gender
     * @return genero del usuario
     */
    public char getGender() {
        return gender;
    }
    /**
     * Setter del parametro gender
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    
}
