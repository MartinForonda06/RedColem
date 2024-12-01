package com.RedColem.RedColem.com.redcolem.app.publicacion.entities;

import com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.Emprendimiento;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;

    public void setEmprendimiento(Long idEmprendimiento) {

    }
}
