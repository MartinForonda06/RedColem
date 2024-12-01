package com.RedColem.RedColem.com.redcolem.app.mensajeria.entities;

import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Conversacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConversacion;

    private LocalDateTime fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario_creador")
    private Usuario usuarioCreador;

    public void setUsuarioCreador(Long idUsuarioCreador) {

    }
}
