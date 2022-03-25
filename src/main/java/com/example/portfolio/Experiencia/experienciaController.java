package com.example.portfolio.Experiencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class experienciaController {

    @Autowired
    private IExperienciaService interExperiencia;

    @GetMapping("/experiencia")
    public List<experiencia> getExperiencia(){
        return interExperiencia.getExperiencia();
    }

    @PostMapping("/experiencia")
    public String createExperiencia (@RequestBody experiencia exp) {
        interExperiencia.saveExperiencia(exp);
        return "La experiencia ha sido añadida correctamente";
    }

    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        interExperiencia.deleteExperiencia(id);
        return "La experiencia fue borrada exitosamente";
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
