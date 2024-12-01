package com.RedColem.RedColem.app.emprendimiento.entities;

import com.RedColem.RedColem.app.usuario.entities.Usuario;
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
    private Emprendimiento emprendimiento;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String rol;

    private LocalDateTime fechaIncorporacion;

    public void setEmprendimiento(Long idEmprendimiento) {
    }

    public void setUsuario(Long idUsuario) {
    }
}
