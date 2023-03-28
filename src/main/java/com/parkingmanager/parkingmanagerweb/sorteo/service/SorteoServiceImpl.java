package com.parkingmanager.parkingmanagerweb.sorteo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.*;

@Service
public class SorteoServiceImpl implements SorteoService{

    private SorteoRepository sorteoRepository;

    @Autowired
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
        BeanUtils.copyProperties(sorteo, sorteo);
        this.sorteoRepository.save(sorteo);
    }
    
}