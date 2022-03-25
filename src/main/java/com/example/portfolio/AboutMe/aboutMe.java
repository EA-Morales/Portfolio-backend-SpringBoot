package com.example.portfolio.AboutMe;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class aboutMe {

    @Id
    private Long id;

    private String texto;

}
