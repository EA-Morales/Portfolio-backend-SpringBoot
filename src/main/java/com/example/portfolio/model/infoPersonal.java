package com.example.portfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class infoPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;

    private String nombreyapellido;
    private String puesto;
    private String ubicacion;
}
