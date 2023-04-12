package com.parkingmanager.parkingmanagerweb.sorteo.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.parkingmanager.parkingmanagerweb.sorteo.domain.Sorteo;
import com.parkingmanager.parkingmanagerweb.sorteo.domain.SorteoRepository;

/**
 * @author Miguel Blanco Fernández
 * @author Adolfo Burgos Belgrano
 * @version 0.0.1
 * @since 12/04/2023
 */
@Controller
public class SorteoController {

    @Autowired
    private SorteoRepository repository;
  

    @GetMapping("/sorteos")
   /** 
    * 
    * @param model
    * @return Devuelve el usuario de los sorteos.
   */
    public String showAllSorteos(Model model){
        //Log.info("Devolviendo usuarios");
        model.addAttribute("sorteos", repository.findAll());
        return "sorteolist";

    }

    @GetMapping("/createSorteo")
    /**
     * @param model
     * @return Devuelve la lista de sorteos.
     */
    public String showForm(Model model){

        Sorteo sorteo = new Sorteo(null, null, null);
        model.addAttribute("sorteo", sorteo);

        return "sorteo/sorteolist";

    }
    
}

