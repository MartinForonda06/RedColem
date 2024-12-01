package com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class ColaboradoresEmprendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idColaborador;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.Emprendimiento emprendimiento;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario usuario;

    private String rol;

    private LocalDateTime fechaIncorporacion;

    public void setEmprendimiento(Long idEmprendimiento) {
    }

    public void setUsuario(Long idUsuario) {
    }
}
