package com.example.portfolio.service;

import java.util.List;
import com.example.portfolio.model.aboutMe;

public interface IAboutMeService {

    public List<aboutMe> getAboutMe();

    public void saveAboutMe(aboutMe about);

    public void deleteAboutMe(aboutMe about);

    public aboutMe findAboutMe(Long id);

}
