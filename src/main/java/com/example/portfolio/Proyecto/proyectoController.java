package com.example.portfolio.Proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class proyectoController {

    @Autowired
    private IProyectoService interProyecto;

    @GetMapping("/proyectos")
    public List<proyecto> getProyecto(){
        return interProyecto.getProyecto();
    }

    @PostMapping("/proyectos")
    public proyecto createProyecto(@RequestBody proyecto proye){
        interProyecto.saveProyecto(proye);
        return proye;
    }

    @DeleteMapping("/proyectos/borrar/{id}")
    public Long deleteProyecto(@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        return id;
    }

    @PutMapping("/proyectos/{id}")
    public proyecto editProyecto(@PathVariable Long id,
                                 @RequestBody proyecto proye){

        proyecto proyec = interProyecto.findProyecto(id);

        proyec.setTitulo(proye.getTitulo());
        proyec.setDescripcion(proye.getDescripcion());

        interProyecto.saveProyecto(proyec);

        return proyec;
    }

}
