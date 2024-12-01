package com.RedColem.RedColem.com.redcolem.app.usuario.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDepartamento;

    @Column(name = "Nombre_departamento", nullable = false, length = 50)
    private String nombreDepartamento;
}
