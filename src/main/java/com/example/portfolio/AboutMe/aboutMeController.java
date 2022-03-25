package com.example.portfolio.AboutMe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class aboutMeController {

    @Autowired
    private IAboutMeService aboutMe;

    @GetMapping("/descripcion")
    public List<aboutMe> getAboutMe() {
        return aboutMe.getAboutMe();
    }

    @PostMapping("/descripcion")
    public String createAboutMe(@RequestBody aboutMe about) {
        aboutMe.saveAboutMe(about);
        return "La descripcion fue cambiado exitosamen";
    }


    @PutMapping("/descripcion/{id}")
    public aboutMe editAboutMe(@PathVariable Long id, @RequestBody aboutMe about) {
        aboutMe aboutDesc = aboutMe.findAboutMe(id);
        aboutDesc.setTexto(about.getTexto());

        aboutMe.saveAboutMe(aboutDesc);
        System.out.println(aboutDesc.getTexto());
        return aboutDesc;
    }

}
