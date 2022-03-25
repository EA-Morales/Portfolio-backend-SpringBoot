package com.example.portfolio.AboutMe;

import java.util.List;

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

    @Override
    public void saveAboutMe(aboutMe about) {
        aboutRepository.save(about);
    }

    @Override
    public void deleteAboutMe(Long id) {
        aboutRepository.deleteById(id);
    }

    @Override
    public aboutMe findAboutMe(Long id) {
        aboutMe about = aboutRepository.findById(id).orElse(null);

        return about;
    }

}
