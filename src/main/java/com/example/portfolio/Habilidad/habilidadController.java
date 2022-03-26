package com.example.portfolio.Habilidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class habilidadController {

    @Autowired
    private IHabilidadService interHabilidad;

    @GetMapping("/skills")
    public List<habilidad> getHabilidad(){
        return interHabilidad.getHabilidad();
    }

    @PostMapping("/skills")
    public habilidad createHabilidad(@RequestBody habilidad habi){
        interHabilidad.saveHabilidad(habi);
        return habi;
    }

    @DeleteMapping("/skills/borrar/{id}")
    public Long deleteHabilidad(@PathVariable Long id){
        interHabilidad.deleteHabilidad(id);
        return id;
    }

    @PutMapping("/skills/{id}")
    public habilidad editHabilidad(@PathVariable Long id,
                                   @RequestBody habilidad habi){
        habilidad habili = interHabilidad.findHabilidad(id);

        habili.setTitulo(habi.getTitulo());
        habili.setColor(habi.getColor());
        habili.setValue(habi.getValue());

        interHabilidad.saveHabilidad(habili);

        return habili;
    }
}
