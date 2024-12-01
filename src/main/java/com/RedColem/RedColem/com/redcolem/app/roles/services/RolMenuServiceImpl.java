package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.RolMenuDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Rol;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Menu;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.RolMenu;
import com.RedColem.RedColem.com.redcolem.app.roles.repositories.RolMenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolMenuServiceImpl implements RolMenuService {

    private final RolMenuRepository rolMenuRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RolMenuServiceImpl(RolMenuRepository rolMenuRepository, ModelMapper modelMapper) {
        this.rolMenuRepository = rolMenuRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RolMenuDTO> obtenerTodos() {
        List<RolMenu> rolMenus = rolMenuRepository.findAll();
        return rolMenus.stream()
                .map(rolMenu -> modelMapper.map(rolMenu, RolMenuDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public RolMenuDTO obtenerPorId(Long id) {
        RolMenu rolMenu = rolMenuRepository.findById(id).orElseThrow();
        return modelMapper.map(rolMenu, RolMenuDTO.class);
    }

    @Override
    public RolMenuDTO crear(RolMenuDTO rolMenuDTO) {
        RolMenu rolMenu = modelMapper.map(rolMenuDTO, RolMenu.class);
        rolMenu = rolMenuRepository.save(rolMenu);
        return modelMapper.map(rolMenu, RolMenuDTO.class);
    }

    @Override
    public RolMenuDTO actualizar(Long id, RolMenuDTO rolMenuDTO) {
        RolMenu rolMenu = rolMenuRepository.findById(id).orElseThrow();
        rolMenu.setRol(modelMapper.map(rolMenuDTO.getIdRol(), Rol.class));
        rolMenu.setMenu(modelMapper.map(rolMenuDTO.getIdMenu(), Menu.class));
        rolMenu = rolMenuRepository.save(rolMenu);
        return modelMapper.map(rolMenu, RolMenuDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        rolMenuRepository.deleteById(id);
    }
}
