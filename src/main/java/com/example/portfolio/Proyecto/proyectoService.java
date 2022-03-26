package com.example.portfolio.Proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class proyectoService implements IProyectoService {

    @Autowired
    private  proyectoRepository proyecRepository;

    @Override
    public List<proyecto> getProyecto(){
        List<proyecto> listaProyecto = proyecRepository.findAll();
        return listaProyecto;
    }

    @Override
    public void saveProyecto(proyecto proye){
        proyecRepository.save(proye);
    }

    @Override
    public void deleteProyecto(Long id){
        proyecRepository.deleteById(id);
    }

    @Override
    public proyecto findProyecto(Long id){
        proyecto proye = proyecRepository.findById(id).orElse(null);
        return proye;
    }
}
