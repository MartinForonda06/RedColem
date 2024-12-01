package com.RedColem.RedColem.app.mensajeria.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensaje;

    private String contenido;
    private LocalDateTime fechaEnvio;

    @ManyToOne
    @JoinColumn(name = "id_conversacion")
    private Conversacion conversacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public void setConversacion(Long idConversacion) {
    }

    public void setUsuario(Long idUsuario) {

    }
}
