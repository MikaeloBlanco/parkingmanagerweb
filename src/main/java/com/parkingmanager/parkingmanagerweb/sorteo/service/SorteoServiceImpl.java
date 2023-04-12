package com.parkingmanager.parkingmanagerweb.sorteo.service;

import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.*;
/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 12/04/2023
 */
@Service
public class SorteoServiceImpl implements SorteoService{

    private SorteoRepository sorteoRepository;
/**
 * 
 * @param sorteoRepository
 */
    public SorteoServiceImpl(SorteoRepository sorteoRepository){
        this.sorteoRepository = sorteoRepository;
    }

    @Override
    public Iterable<Sorteo> getAll() {
        return this.sorteoRepository.findAll();
    }

    @Override
    public void register(Sorteo pool) {

        Sorteo sorteo = new Sorteo(null, null, null);
        BeanUtils.copyProperties(pool, sorteo);
        this.sorteoRepository.save(sorteo);
    }
    
}