package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.RolesusuarioDTO;
import com.RedColem.RedColem.app.roles.entities.Rolesusuario;
import com.RedColem.RedColem.app.roles.repositories.RolesusuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RolesusuarioServiceImpl implements RolesusuarioService {

    private final RolesusuarioRepository rolesusuarioRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RolesusuarioServiceImpl(RolesusuarioRepository rolesusuarioRepository, ModelMapper modelMapper) {
        this.rolesusuarioRepository = rolesusuarioRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RolesusuarioDTO> obtenerTodos() {
        List<Rolesusuario> rolesusuarios = rolesusuarioRepository.findAll();
        return rolesusuarios.stream()
                .map(r -> modelMapper.map(r, RolesusuarioDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public RolesusuarioDTO obtenerPorId(Long id) {
        Rolesusuario rolesusuario = rolesusuarioRepository.findById(id).orElseThrow();
        return modelMapper.map(rolesusuario, RolesusuarioDTO.class);
    }

    @Override
    public RolesusuarioDTO crear(RolesusuarioDTO rolesusuarioDTO) {
        Rolesusuario rolesusuario = modelMapper.map(rolesusuarioDTO, Rolesusuario.class);
        rolesusuario = rolesusuarioRepository.save(rolesusuario);
        return modelMapper.map(rolesusuario, RolesusuarioDTO.class);
    }

    @Override
    public RolesusuarioDTO actualizar(Long id, RolesusuarioDTO rolesusuarioDTO) {
        Rolesusuario rolesusuario = rolesusuarioRepository.findById(id).orElseThrow();
        rolesusuario.setUsuario(rolesusuarioDTO.getIdUsuario());
        rolesusuario.setRol(rolesusuarioDTO.getIdRol());
        rolesusuario = rolesusuarioRepository.save(rolesusuario);
        return modelMapper.map(rolesusuario, RolesusuarioDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        rolesusuarioRepository.deleteById(id);
    }
}
