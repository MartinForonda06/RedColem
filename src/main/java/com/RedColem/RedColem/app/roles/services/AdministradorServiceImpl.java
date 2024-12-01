package com.RedColem.RedColem.app.roles.services;

import com.RedColem.RedColem.app.roles.dtos.AdministradorDTO;
import com.RedColem.RedColem.app.roles.entities.Administrador;
import com.RedColem.RedColem.app.roles.repositories.AdministradorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    private final AdministradorRepository administradorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AdministradorServiceImpl(AdministradorRepository administradorRepository, ModelMapper modelMapper) {
        this.administradorRepository = administradorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AdministradorDTO> obtenerTodos() {
        List<Administrador> administradores = administradorRepository.findAll();
        return administradores.stream()
                .map(a -> modelMapper.map(a, AdministradorDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public AdministradorDTO obtenerPorId(Long id) {
        Administrador administrador = administradorRepository.findById(id).orElseThrow();
        return modelMapper.map(administrador, AdministradorDTO.class);
    }

    @Override
    public AdministradorDTO crear(AdministradorDTO administradorDTO) {
        Administrador administrador = modelMapper.map(administradorDTO, Administrador.class);
        administrador = administradorRepository.save(administrador);
        return modelMapper.map(administrador, AdministradorDTO.class);
    }

    @Override
    public AdministradorDTO actualizar(Long id, AdministradorDTO administradorDTO) {
        Administrador administrador = administradorRepository.findById(id).orElseThrow();
        administrador.setUsuario(administradorDTO.getIdUsuario());
        administrador.setFechaAsignacion(administradorDTO.getFechaAsignacion());
        administrador = administradorRepository.save(administrador);
        return modelMapper.map(administrador, AdministradorDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        administradorRepository.deleteById(id);
    }
}
