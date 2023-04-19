package com.parkingmanager.parkingmanagerweb.sorteo.service;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.Sorteo;
/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 12/04/2023
 */

public interface SorteoService {
    
    public Iterable<Sorteo> getAll();
    
    public void register(Sorteo sorteo);
    
}