package com.parkingmanager.parkingmanagerweb.sorteo.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.Sorteo;
import com.parkingmanager.parkingmanagerweb.sorteo.domain.SorteoRepository;


@Controller
public class SorteoController {

    @Autowired
    private SorteoRepository repository;


    @GetMapping("/sorteos")
    public String showAllSorteos(Model model){
        //Log.info("Devolviendo usuarios");
        model.addAttribute("sorteos", repository.findAll());
        return "sorteolist";

    }

    @GetMapping("/createSorteo")
    public String showForm(Model model){

        Sorteo sorteo = new Sorteo(null, null, null);
        model.addAttribute("sorteo", sorteo);

        return "sorteo/sorteolist";

    }
    
}

