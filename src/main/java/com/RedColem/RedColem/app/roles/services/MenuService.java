package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.MenuDTO;

import java.util.List;

public interface MenuService {
    List<MenuDTO> obtenerTodos();
    MenuDTO crear(MenuDTO menuDTO);
    MenuDTO actualizar(Long id, MenuDTO menuDTO);
    void eliminar(Long id);
}
