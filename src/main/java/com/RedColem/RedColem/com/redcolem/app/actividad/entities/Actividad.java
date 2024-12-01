package com.RedColem.RedColem.com.redcolem.app.actividad.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActividad;
    private String nombre;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private String descripcion;
    private String estado;
    private String urlImagen;
    private String urlVideo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.Emprendimiento emprendimiento;
}
