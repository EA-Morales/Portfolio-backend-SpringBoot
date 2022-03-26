package com.example.portfolio.Educacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class educacionService implements IEducacionService {

    @Autowired
    private educacionRepository educRepository;

    @Override
    public List<educacion> getEducacion(){
        List<educacion> listaEducacion = educRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(educacion educ){
        educRepository.save(educ);
    }

    @Override
    public void deleteEducacion(Long id){
        educRepository.deleteById(id);
    }

    @Override
    public educacion findEducacion(Long id){
        educacion educ = educRepository.findById(id).orElse(null);
        return educ;
    }


}
