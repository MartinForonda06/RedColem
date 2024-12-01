package com.RedColem.RedColem.app.publicacion.entities;

import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class EmprendimientoCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprendimientoCategoria;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public void setEmprendimiento(Long idEmprendimiento) {
    }

    public void setCategoria(Long idCategoria) {

    }
}
