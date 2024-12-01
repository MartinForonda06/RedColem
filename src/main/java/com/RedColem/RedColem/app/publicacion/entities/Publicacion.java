package com.RedColem.RedColem.app.publicacion.entities;

import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;

    private String titulo;
    private String contenido;

    //@Column(name = "fecha_creacion")
    //private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

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
