package com.parkingmanager.parkingmanagerweb.sorteo.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//import java.util.Date;
@Entity
public class Sorteo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Nonnull
    private String descripcion;
    private String fecha;
    private String estado;

    public Sorteo(String descripcion, String fecha, String estado){

        this.descripcion = descripcion;

        this.fecha = fecha;

        this.estado = estado;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

}
