package com.example.portfolio.service;

import com.example.portfolio.model.infoPersonal;
import com.example.portfolio.repository.InfoPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoPersonalService implements IPersonalService {

    @Autowired
    private InfoPersonalRepository infoRepository;

    @Override
    public List<infoPersonal> getInfoPersonal() {
        List<infoPersonal> listaInfoPersonal = infoRepository.findAll();
        return listaInfoPersonal;
    }

    @Override
    public void saveInfoPersonal(infoPersonal info) {
        infoRepository.save(info);
    }

    @Override
    public void deleteInfoPersonal(Long id) {
        infoRepository.deleteById(id);
    }

    @Override
    public infoPersonal findInfoPersonal(Long id) {
        infoPersonal info = infoRepository.findById(id).orElse(null);
        return  info;
    }
}
