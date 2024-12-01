package com.RedColem.RedColem.app.comentario_reacciones.entities;

import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import com.RedColem.RedColem.app.actividad.entities.Actividad;
import com.RedColem.RedColem.app.usuario.entities.Usuario;
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
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_comentario")
    private Comentarios comentario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;

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
