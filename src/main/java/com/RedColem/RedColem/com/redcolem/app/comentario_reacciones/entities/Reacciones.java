package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.entities;

import com.RedColem.RedColem.com.redcolem.app.actividad.entities.Actividad;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Reacciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReacciones;

    private String tipo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_comentario")
    private Comentarios comentario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.Emprendimiento emprendimiento;

    @ManyToOne
    @JoinColumn(name = "id_actividad")
    private Actividad actividad;

    public void setUsuario(Long idUsuario) {
    }

    public void setComentario(Long idComentario) {
    }

    public void setEmprendimiento(Long idEmprendimiento) {

    }

    public void setActividad(Long idActividad) {
    }
}
