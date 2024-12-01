package com.RedColem.RedColem.com.redcolem.app.usuario.dtos;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioDTO {
    private Integer idUsuario;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;
    private String password;
    private String direccion;
    private String fotoPerfil;
    private String biografia;
    private String sitioWeb;
    private Boolean activo;
    private LocalDateTime ultimoAcceso;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private String ciudad;
}
