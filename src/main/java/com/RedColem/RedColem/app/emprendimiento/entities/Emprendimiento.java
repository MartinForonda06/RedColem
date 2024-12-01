package com.RedColem.RedColem.app.emprendimiento.entities;

import com.RedColem.RedColem.app.usuario.entities.Departamento;
import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

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
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String urlImagen;
    private String urlVideo;

    public void setDepartamento(Long idDepartamento) {
    }

    public void setUsuario(Long idUsuario) {

    }
}
