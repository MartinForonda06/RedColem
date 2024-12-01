package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.entities;

import com.RedColem.RedColem.com.redcolem.app.actividad.entities.Actividad;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

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
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.Emprendimiento emprendimiento;

    @ManyToOne
    @JoinColumn(name = "id_actividad")
    private Actividad actividad;
}
