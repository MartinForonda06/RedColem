package com.RedColem.RedColem.app.login.controllers;

import com.RedColem.RedColem.app.login.dto.LoginRequest;
import com.RedColem.RedColem.app.login.dto.LoginResponse;
import com.RedColem.RedColem.app.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse response = loginService.validateLogin(loginRequest.getCorreoElectronico(), loginRequest.getPassword());
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }
    }
}
