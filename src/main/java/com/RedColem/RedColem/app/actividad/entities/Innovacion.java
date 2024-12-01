package com.RedColem.RedColem.app.actividad.entities;

import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Innovacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInnovacion;

    private String tipoInnovacion;
    private String impacto;
    private String descripcion;
    private LocalDateTime fecha;
    private String urlImagen;
    private String urlVideo;

    @ManyToOne
    @JoinColumn(name = "id_emprendimiento")
    private Emprendimiento emprendimiento;
}
