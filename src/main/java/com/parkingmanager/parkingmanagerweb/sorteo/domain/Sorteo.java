package com.parkingmanager.parkingmanagerweb.sorteo.domain;

import java.util.Set;

import com.parkingmanager.parkingmanagerweb.user.domain.User;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

//import java.util.Date;
/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 12/04/2023
 */
@Entity
public class Sorteo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Nonnull
    private String descripcion;
    private String fecha;
    private Status estado;
    @ManyToMany(mappedBy = "includedIn")
    private Set<User> usersIncluded;
/**
 * 
 * @param descripcion
 * @param fecha
 * @param string
 */
    public Sorteo(String descripcion, String fecha, Status string){

        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = string;

    }

protected Sorteo() {
    this("","",null );
   
}
/**
 * 
 * @return Devuelve la descripcion
 */
    public String getDescripcion() {
        return descripcion;
    }
/**
 * 
 * @param descripcion
 */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

/**
 * 
 * @return Devuelve la fecha registrada.
 */
    public String getFecha() {
        return fecha;
    }
/**
 * 
 * @param fecha
 */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
/**
 * 
 * @return Devuelve el estado registrado.
 */
    public Status getEstado() {
        return estado;
    }
/**
 * 
 * @param string
 */
    public void setEstado(Status string) {
        this.estado = string;
    }
/**
 * 
 * @return Devuelve  el id registrado.
 */
    public long getId() {
        return id;
    }

}
