package com.parkingmanager.parkingmanagerweb.sorteo.domain;

/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 26/04/2023
 */
public class SorteoDao {

    private long id;
    private String descripcion;
    private String fecha;
    private Status estado;
/** 
 * 
 * @param descripcion
 * @param fecha
 * @param string
 */
    public SorteoDao(String descripcion, String fecha, Status string){

        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = string;

    }

protected SorteoDao() {
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