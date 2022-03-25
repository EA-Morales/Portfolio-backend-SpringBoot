package com.example.portfolio.AboutMe;

import java.util.List;


public interface IAboutMeService {

    public List<aboutMe> getAboutMe();

    public void saveAboutMe(aboutMe about);

    public void deleteAboutMe(Long id);

    public aboutMe findAboutMe(Long id);

}
