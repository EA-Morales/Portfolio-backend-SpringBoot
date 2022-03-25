package com.example.portfolio.Experiencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class experienciaService implements IExperienciaService {

    @Autowired
    private experienciaRepository expRepository;

    @Override
    public List<experiencia> getExperiencia(){
        List<experiencia> listaExperiencia = expRepository.findAll();
        return listaExperiencia;
    }

    @Override
    public  void saveExperiencia(experiencia exp) {
        expRepository.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id){
        expRepository.deleteById(id);
    }

    @Override
    public experiencia findExperiencia(Long id){
        experiencia exp = expRepository.findById(id).orElse(null);
        return exp;
    }
}
