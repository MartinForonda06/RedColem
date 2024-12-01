package com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Emprendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprendimiento;
    private String nombre;
    //private LocalDateTime fechaCreacion;
    //private LocalDateTime fechaModificacion;
    private String descripcion;
    private String objetivo;
    private String calle;
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "id_departamento")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    private String urlImagen;
    private String urlVideo;

    public void setDepartamento(Long idDepartamento) {
    }

    public void setUsuario(Long idUsuario) {

    }
}
