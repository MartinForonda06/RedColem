package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.RolDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Rol;
import com.RedColem.RedColem.com.redcolem.app.roles.repositories.RolRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolServiceImpl implements RolService {

    private final RolRepository rolRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RolServiceImpl(RolRepository rolRepository, ModelMapper modelMapper) {
        this.rolRepository = rolRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RolDTO> obtenerTodos() {
        List<Rol> roles = rolRepository.findAll();
        return roles.stream()
                .map(r -> modelMapper.map(r, RolDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public RolDTO obtenerPorId(Long id) {
        Rol rol = rolRepository.findById(id).orElseThrow();
        return modelMapper.map(rol, RolDTO.class);
    }

    @Override
    public RolDTO crear(RolDTO rolDTO) {
        Rol rol = modelMapper.map(rolDTO, Rol.class);
        rol = rolRepository.save(rol);
        return modelMapper.map(rol, RolDTO.class);
    }

    @Override
    public RolDTO actualizar(Long id, RolDTO rolDTO) {
        Rol rol = rolRepository.findById(id).orElseThrow();
        rol.setNombre(rolDTO.getNombre());
        rol = rolRepository.save(rol);
        return modelMapper.map(rol, RolDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        rolRepository.deleteById(id);
    }
}
