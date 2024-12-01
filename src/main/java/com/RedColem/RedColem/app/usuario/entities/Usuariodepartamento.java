package com.RedColem.RedColem.app.usuario.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Usuariodepartamento")
public class Usuariodepartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuariodepartamento;

    @ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_Departamento", nullable = false)
    private Departamento departamento;
}
