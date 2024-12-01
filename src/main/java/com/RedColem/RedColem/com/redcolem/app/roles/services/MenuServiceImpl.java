package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.MenuDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Menu;
import com.RedColem.RedColem.com.redcolem.app.roles.repositories.MenuRepository;
import com.RedColem.RedColem.com.redcolem.app.roles.services.MenuService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<MenuDTO> obtenerTodos() {
        return menuRepository.findAll().stream()
                .map(menu -> modelMapper.map(menu, MenuDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public MenuDTO crear(MenuDTO menuDTO) {
        Menu menu = modelMapper.map(menuDTO, Menu.class);
        menu = menuRepository.save(menu);
        return modelMapper.map(menu, MenuDTO.class);
    }

    @Override
    public MenuDTO actualizar(Long id, MenuDTO menuDTO) {
        Menu menu = menuRepository.findById(id).orElseThrow(() -> new RuntimeException("Menu no encontrado"));
        menu.setNombre(menuDTO.getNombre());
        menu.setIcono(menuDTO.getIcono());
        menu.setUrl(menuDTO.getUrl());
        menu = menuRepository.save(menu);
        return modelMapper.map(menu, MenuDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        menuRepository.deleteById(id);
    }
}
