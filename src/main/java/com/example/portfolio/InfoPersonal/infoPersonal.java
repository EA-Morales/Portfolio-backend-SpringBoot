package com.example.portfolio.InfoPersonal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class infoPersonal {

    @Id
    private Long id;

    private String nombreyapellido;
    private String puesto;
    private String ubicacion;
}
