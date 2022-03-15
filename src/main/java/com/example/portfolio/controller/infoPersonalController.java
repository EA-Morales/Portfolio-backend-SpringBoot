package com.example.portfolio.controller;

import com.example.portfolio.model.infoPersonal;
import com.example.portfolio.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class infoPersonalController {

    @Autowired
    private IPersonalService interPersonal;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping ("/descripcion")
    public List<infoPersonal> getInfoPersonal() {
        return interPersonal.getInfoPersonal();
    }

    @PostMapping ("/descripcion")
    public String createInfoPersonal(@RequestBody infoPersonal infoPerso){
        interPersonal.saveInfoPersonal(infoPerso);

        return "la descripcion se ha cambiado correctamente";
    }

    @PutMapping ("/descripcion/{id}")
    public infoPersonal editInfoPersonal (@PathVariable Long id,
                                          @RequestParam ("nombreyapellido") String nuevoNombre,
                                          @RequestParam("puesto") String nuevoPuesto,
                                          @RequestParam("ubicacion") String nuevoUbicacion) {

        infoPersonal infoPerso = interPersonal.findInfoPersonal(id);

        infoPerso.setNombreyapellido(nuevoNombre);
        infoPerso.setPuesto(nuevoPuesto);
        infoPerso.setUbicacion(nuevoUbicacion);

        interPersonal.saveInfoPersonal(infoPerso);        

        return infoPerso;
    }



}
