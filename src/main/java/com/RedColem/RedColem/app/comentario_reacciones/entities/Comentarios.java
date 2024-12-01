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
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComentarios;

    private String contenido;
    //private LocalDateTime fechaCreacion;
    //private LocalDateTime fechaModificacion;
    private String urlImagen;
    private String urlVideo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;

    @ManyToOne
    @JoinColumn(name = "id_actividad")
    private Actividad actividad;
}
