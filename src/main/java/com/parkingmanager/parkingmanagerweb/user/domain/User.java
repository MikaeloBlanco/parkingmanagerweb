package com.parkingmanager.parkingmanagerweb.user.domain;

import java.util.Set;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.Sorteo;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
    private long id;
    @Nonnull    
    @Column(unique = true)
    private String email;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private Role role;
    private char gender;
    @ManyToMany
    @JoinTable(
        name = "user_sorteos",
        joinColumns = @JoinColumn(name="user_id"),
        inverseJoinColumns = @JoinColumn(name = "sorteo_id")
    )
    private Set<Sorteo>IncludedIn;
    // Constructores
    /**
     * Constructor de la clase User
     * @param email Parametro no nulo de tipo string de nombre email
     * @param firstName Parametro de tipo string de nombre firstName que almacena el nombre de la persona
     * @param lastName1 Parametro de tipo string de nombre lastName1 el cual tiene la función de almacenar el primer apellido de la persona
     * @param lastName2 Parametro de tipo string de nombre lastName2 el cual tiene la funcion de almacenar el segundo apellido de la persona
     * @param role Parametro de tipo character de nombre role para la asignación de un rol preasignado
     * @param gender Parametro de tipo character de nombre gender para la asignación de un género identificable
     */
    public User(String email,String firstName, String lastName1, String lastName2, Role role, char gender) {
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
     * @param email Parametro no nulo de tipo string de nombre email
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
     * @param firstName Parametro de tipo string de nombre firstName que almacena el nombre de la persona
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
     * @param lastName1 Parametro de tipo string de nombre lastName1 el cual tiene la función de almacenar el primer apellido de la persona
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
     * @param lastName2 Parametro de tipo string de nombre lastName2 el cual tiene la funcion de almacenar el segundo apellido de la persona
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
    /**
     * Getter del parametro role
     * @param role Parametro de tipo Role de nombre role para la adquisición de un rol restringido
     */
    public Role getRole() {
        return role;
    }
    /**
     * Setter del parametro role
     * @param role Parametro de tipo Role de nombre role para la asignación de un rol preasignado
     */
    public void setRole(Role role) {
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
     * @param gender Parametro de tipo character de nombre gender para la asignación de un género identificable
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    
}
