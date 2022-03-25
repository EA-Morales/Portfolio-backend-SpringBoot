package com.example.portfolio.Experiencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class experienciaController {

    @Autowired
    private IExperienciaService interExperiencia;

    @GetMapping("/experiencia")
    public List<experiencia> getExperiencia(){
        return interExperiencia.getExperiencia();
    }

    @PostMapping("/experiencia")
    public experiencia createExperiencia (@RequestBody experiencia exp) {
        interExperiencia.saveExperiencia(exp);
        return exp;
    }

    @DeleteMapping("/experiencia/borrar/{id}")
    public Long deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return id;
    }

    @PutMapping("/experiencia/{id}")
    public experiencia editExperiencia(@PathVariable Long id,
                                       @RequestBody experiencia exp){
        experiencia exper = interExperiencia.findExperiencia(id);

        exper.setEstablecimiento(exp.getEstablecimiento());
        exper.setEspecialidad(exp.getEspecialidad());
        exper.setYear(exp.getYear());

        interExperiencia.saveExperiencia(exper);

        return exper;
    }

}
