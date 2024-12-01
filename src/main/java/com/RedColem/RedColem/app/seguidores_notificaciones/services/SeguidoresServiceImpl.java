package com.RedColem.RedColem.app.seguidores_notificaciones.services;

import com.RedColem.RedColem.app.seguidores_notificaciones.dtos.SeguimientoDTO;
import com.RedColem.RedColem.app.seguidores_notificaciones.entities.Seguimiento;
import com.RedColem.RedColem.app.seguidores_notificaciones.repositories.SeguidoresRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeguidoresServiceImpl implements SeguidoresService {

    private final SeguidoresRepository seguidoresRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public SeguidoresServiceImpl(SeguidoresRepository seguidoresRepository, ModelMapper modelMapper) {
        this.seguidoresRepository = seguidoresRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<SeguimientoDTO> obtenerTodos() {
        List<Seguimiento> seguimientos = seguidoresRepository.findAll();
        return seguimientos.stream()
                .map(seguimiento -> modelMapper.map(seguimiento, SeguimientoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public SeguimientoDTO obtenerPorId(Long id) {
        Seguimiento seguimiento = seguidoresRepository.findById(id).orElseThrow();
        return modelMapper.map(seguimiento, SeguimientoDTO.class);
    }

    @Override
    public SeguimientoDTO crear(SeguimientoDTO seguimientoDTO) {
        Seguimiento seguimiento = modelMapper.map(seguimientoDTO, Seguimiento.class);
        seguimiento = seguidoresRepository.save(seguimiento);
        return modelMapper.map(seguimiento, SeguimientoDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        seguidoresRepository.deleteById(id);
    }
}
