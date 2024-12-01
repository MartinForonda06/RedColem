package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.PermisoDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Permiso;
import com.RedColem.RedColem.com.redcolem.app.roles.repositories.PermisoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PermisoServiceImpl implements PermisoService {

    private final PermisoRepository permisoRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PermisoServiceImpl(PermisoRepository permisoRepository, ModelMapper modelMapper) {
        this.permisoRepository = permisoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PermisoDTO> obtenerTodos() {
        List<Permiso> permisos = permisoRepository.findAll();
        return permisos.stream()
                .map(p -> modelMapper.map(p, PermisoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PermisoDTO obtenerPorId(Long id) {
        Permiso permiso = permisoRepository.findById(id).orElseThrow();
        return modelMapper.map(permiso, PermisoDTO.class);
    }

    @Override
    public PermisoDTO crear(PermisoDTO permisoDTO) {
        Permiso permiso = modelMapper.map(permisoDTO, Permiso.class);
        permiso = permisoRepository.save(permiso);
        return modelMapper.map(permiso, PermisoDTO.class);
    }

    @Override
    public PermisoDTO actualizar(Long id, PermisoDTO permisoDTO) {
        Permiso permiso = permisoRepository.findById(id).orElseThrow();
        permiso.setNombre(permisoDTO.getNombre());
        permiso.setDescripcion(permisoDTO.getDescripcion());
        permiso.setEstado(permisoDTO.getEstado());
        permiso = permisoRepository.save(permiso);
        return modelMapper.map(permiso, PermisoDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        permisoRepository.deleteById(id);
    }
}
