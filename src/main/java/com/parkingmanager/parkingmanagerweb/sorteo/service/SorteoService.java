package com.parkingmanager.parkingmanagerweb.sorteo.service;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.*;

public interface SorteoService {
    
    public Iterable<Sorteo> getAll();
    
    public void register(Sorteo sorteo);
    
}