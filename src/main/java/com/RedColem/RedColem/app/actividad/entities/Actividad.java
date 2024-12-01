package com.RedColem.RedColem.app.actividad.entities;

import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import com.RedColem.RedColem.app.usuario.entities.Usuario;
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
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;
}
