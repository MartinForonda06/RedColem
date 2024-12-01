package com.RedColem.RedColem.com.redcolem.app.roles.controllers;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.MenuDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menus")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuDTO> listarMenus() {
        return menuService.obtenerTodos();
    }

    @PostMapping
    public MenuDTO crearMenu(@RequestBody MenuDTO menuDTO) {
        return menuService.crear(menuDTO);
    }

    @PutMapping("/{id}")
    public MenuDTO actualizarMenu(@PathVariable Long id, @RequestBody MenuDTO menuDTO) {
        return menuService.actualizar(id, menuDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminarMenu(@PathVariable Long id) {
        menuService.eliminar(id);
    }
}
