package com.example.portfolio.service;

import java.util.List;

import com.example.portfolio.model.aboutMe;

import com.example.portfolio.repository.aboutMeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class aboutMeService implements IAboutMeService {

    @Autowired
    private aboutMeRepository aboutRepository;

    @Override
    public List<aboutMe> getAboutMe() {
        List<aboutMe> listaAboutMe = aboutRepository.findAll();

        return listaAboutMe;
    }

}
