package com.parkingmanager.parkingmanagerweb.sorteo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SorteoController {

    @Autowired
    private SorteoRepository repository;


    @GetMapping("/sorteos")
    public String showAllSorteos(Model model){
        //Log.info("Devolviendo usuarios");
        List<Sorteo> allSorteos = repository.getAll();

        model.addAttribute("sorteos",allSorteos);
        return "sorteolist";

    }

    @GetMapping("/createSorteo")
    public String showForm(Model model){

        Sorteo sorteo = new Sorteo(null, null, null);
        model.addAttribute("sorteo", sorteo);

        return "sorteo/sorteolist";

    }
    
}

