package com.parkingmanager.parkingmanagerweb.sorteo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.Sorteo;
import com.parkingmanager.parkingmanagerweb.sorteo.domain.Status;


public class SorteoTests {

    private Sorteo sorteo;
    @BeforeEach
    public void init(){

        sorteo = new Sorteo("Realizado en Junio del 2003", "01-06-2003", Status.FINISHED);

    }
    
    @Test
    void testGetDescripcion() {
        String expected ="Realizado en Junio del 2003";
        String actual = sorteo.getDescripcion();

        assertEquals(expected,actual);
    }

    @Test
    void testGetEstado() {
        String expected ="Completado";
        Status actual = sorteo.getEstado();

        assertEquals(expected, actual);
    }

    @Test
    void testGetFecha() {
        String expected ="01-06-2003";
        String actual = sorteo.getFecha();

        assertEquals(expected, actual);
    }

    @Test
    void testSetDescripcion() {
        String expected = "descripcion";
        sorteo.setDescripcion("descripcion");
        String actual = sorteo.getDescripcion();
        assertEquals(expected,actual);
    }

    @Test
    void testSetEstado() {
        Status expected = Status.FINISHED;
        sorteo.setEstado(Status.FINISHED);
        Status actual = sorteo.getEstado();
        assertEquals(expected,actual);
    }

    @Test
    void testSetFecha() {
        String expected = "01-01-01";
        sorteo.setFecha("01-01-01");
        String actual = sorteo.getFecha();
        assertEquals(expected,actual);
    }
}
