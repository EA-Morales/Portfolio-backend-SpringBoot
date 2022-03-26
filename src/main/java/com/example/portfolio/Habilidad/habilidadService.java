package com.example.portfolio.Habilidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class habilidadService implements IHabilidadService {

    @Autowired
    private habilidadRepository habiRepository;

    @Override
    public List<habilidad> getHabilidad(){
        List<habilidad> listaHabilidad = habiRepository.findAll();
        return listaHabilidad;
    }

    @Override
    public void saveHabilidad(habilidad habi){
        habiRepository.save(habi);
    }

    @Override
    public void deleteHabilidad(Long id){
        habiRepository.deleteById(id);
    }

    @Override
    public habilidad findHabilidad(Long id){
        habilidad habi = habiRepository.findById(id).orElse(null);
        return habi;
    }

}
