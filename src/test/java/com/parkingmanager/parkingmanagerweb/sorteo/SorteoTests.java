package com.parkingmanager.parkingmanagerweb.sorteo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SorteoTests {

    private Sorteo sorteo;
    @BeforeEach
    public void init(){

        sorteo = new Sorteo("Realizado en Junio del 2003", "01-06-2003", "Completado");

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
        String actual = sorteo.getEstado();

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
        String actual = "descripcion";

        assertEquals(expected,actual);
    }

    @Test
    void testSetEstado() {
        String expected = "Completado";
        String actual = "Completado";

        assertEquals(expected,actual);
    }

    @Test
    void testSetFecha() {
        String expected = "01-01-01";
        String actual = "01-01-01";

        assertEquals(expected,actual);
    }
}
