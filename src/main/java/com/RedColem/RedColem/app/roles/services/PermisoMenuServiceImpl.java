package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.PermisoMenuDTO;
import com.RedColem.RedColem.app.roles.entities.PermisoMenu;
import com.RedColem.RedColem.app.roles.repositories.PermisoMenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermisoMenuServiceImpl implements PermisoMenuService {

    private final PermisoMenuRepository permisoMenuRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PermisoMenuServiceImpl(PermisoMenuRepository permisoMenuRepository, ModelMapper modelMapper) {
        this.permisoMenuRepository = permisoMenuRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PermisoMenuDTO> obtenerTodos() {
        List<PermisoMenu> permisoMenus = permisoMenuRepository.findAll();
        return permisoMenus.stream()
                .map(p -> modelMapper.map(p, PermisoMenuDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PermisoMenuDTO obtenerPorId(Long id) {
        PermisoMenu permisoMenu = permisoMenuRepository.findById(id).orElseThrow();
        return modelMapper.map(permisoMenu, PermisoMenuDTO.class);
    }

    @Override
    public PermisoMenuDTO crear(PermisoMenuDTO permisoMenuDTO) {
        PermisoMenu permisoMenu = modelMapper.map(permisoMenuDTO, PermisoMenu.class);
        permisoMenu = permisoMenuRepository.save(permisoMenu);
        return modelMapper.map(permisoMenu, PermisoMenuDTO.class);
    }

    @Override
    public PermisoMenuDTO actualizar(Long id, PermisoMenuDTO permisoMenuDTO) {
        PermisoMenu permisoMenu = permisoMenuRepository.findById(id).orElseThrow();
        permisoMenu.setPermiso(permisoMenuDTO.getIdPermiso());
        permisoMenu.setMenu(permisoMenuDTO.getIdMenu());
        permisoMenu = permisoMenuRepository.save(permisoMenu);
        return modelMapper.map(permisoMenu, PermisoMenuDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        permisoMenuRepository.deleteById(id);
    }
}
