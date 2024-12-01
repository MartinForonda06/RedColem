package com.RedColem.RedColem.app.usuario.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String ciudad;

    @Column(nullable = false, length = 50)
    private String apellido;

    @Column(nullable = false)
    private String correoElectronico;

    @Column(length = 20)
    private String telefono;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(length = 100)
    private String direccion;

    @Column(length = 255)
    private String fotoPerfil;

    @Column(columnDefinition = "TEXT")
    private String biografia;

    @Column(length = 255)
    private String sitioWeb;

    @Column(nullable = true)
    private Boolean activo;

    //@Column
    //private LocalDateTime ultimoAcceso;


    //@Column
    //private LocalDateTime fechaCreacion;

    //@JsonIgnore
    //@Column
    //private LocalDateTime fechaModificacion;
}
