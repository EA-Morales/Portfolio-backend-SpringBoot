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
    @GetMapping("/banner")
    public List<infoPersonal> getInfoPersonal() {
        return interPersonal.getInfoPersonal();
    }

    @PostMapping("/banner")
    public String createInfoPersonal(@RequestBody infoPersonal infoPerso) {
        interPersonal.saveInfoPersonal(infoPerso);

        return "la descripcion se ha cambiado correctamente";
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/banner/{id}")
    public infoPersonal editInfoPersonal(@PathVariable Long id,
            @RequestBody infoPersonal info) {

        infoPersonal infoPerso = interPersonal.findInfoPersonal(id);

        infoPerso.setNombreyapellido(info.getNombreyapellido());
        infoPerso.setPuesto(info.getPuesto());
        infoPerso.setUbicacion(info.getUbicacion());

        interPersonal.saveInfoPersonal(infoPerso);

        return infoPerso;
    }

}
