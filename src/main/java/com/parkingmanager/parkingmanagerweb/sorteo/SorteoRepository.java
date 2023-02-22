package com.parkingmanager.parkingmanagerweb.sorteo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SorteoRepository {
    
    private List<Sorteo> sorteoList;

    public SorteoRepository(){
        sorteoList = new ArrayList<Sorteo>();
    }

    public List<Sorteo> getAll() {

        sorteoList.clear();

        sorteoList.add(new Sorteo("Realizado el Junio de 2022","01-06-2022","Completado"));
        sorteoList.add(new Sorteo("Realizado el Septiembre de 2022","01-09-2022","Completado"));
        sorteoList.add(new Sorteo("Realizado el Octubre de 2022","01-10-2022","Error"));
        return sorteoList;
        
    }

}
