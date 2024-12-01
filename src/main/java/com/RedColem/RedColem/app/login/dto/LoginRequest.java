package com.RedColem.RedColem.app.login.dto;

public class LoginRequest {
    private String correoElectronico;
    private String password;

    // Constructor vacío
    public LoginRequest() {}

    // Constructor con parámetros
    public LoginRequest(String correoElectronico, String password) {
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    // Getters y setters
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
