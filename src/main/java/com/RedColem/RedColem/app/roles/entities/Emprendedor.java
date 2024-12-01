package com.RedColem.RedColem.app.roles.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Emprendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprendedor;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    public void setUsuario(Long idUsuario) {

    }
}
