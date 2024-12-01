package com.RedColem.RedColem.com.redcolem.app.publicacion.entities;

import com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.Emprendimiento;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;

    private String titulo;
    private String contenido;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;

    private String urlImagen;
    private String urlVideo;

    public void setUsuario(Long idUsuario) {
    }

    public void setEmprendimiento(Long idEmprendimiento) {
    }
}
