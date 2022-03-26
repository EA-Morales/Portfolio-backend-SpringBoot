package com.example.portfolio.Educacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class educacionController {

    @Autowired
    private IEducacionService interEducacion;

    @GetMapping("/educacion")
    public List<educacion> getEducacion(){
        return interEducacion.getEducacion();
    }

    @PostMapping("/educacion")
    public educacion createEducacion(@RequestBody educacion educ){
        interEducacion.saveEducacion(educ);
        return educ;
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public Long deleteEducacion(@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        return id;
    }

    @PutMapping("/educacion/{id}")
    public educacion editEducacion(@PathVariable Long id,
                                   @RequestBody educacion educ){
        educacion educa = interEducacion.findEducacion(id);

        educa.setEstablecimiento(educ.getEstablecimiento());
        educa.setEspecialidad(educ.getEspecialidad());
        educa.setYear(educ.getYear());

        interEducacion.saveEducacion(educa);

        return educ;
    }
}
