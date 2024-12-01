package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.services;

import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.dtos.HistorialAccionDTO;
import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.entities.HistorialAccion;
import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.repositories.HistorialAccionRepository;
import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistorialAccionServiceImpl implements HistorialAccionService {

    private final HistorialAccionRepository historialAccionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public HistorialAccionServiceImpl(HistorialAccionRepository historialAccionRepository, ModelMapper modelMapper) {
        this.historialAccionRepository = historialAccionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<HistorialAccionDTO> obtenerTodos() {
        List<HistorialAccion> historialAcciones = historialAccionRepository.findAll();
        return historialAcciones.stream()
                .map(historial -> modelMapper.map(historial, HistorialAccionDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public HistorialAccionDTO obtenerPorId(Long id) {
        HistorialAccion historial = historialAccionRepository.findById(id).orElseThrow();
        return modelMapper.map(historial, HistorialAccionDTO.class);
    }

    @Override
    public HistorialAccionDTO crear(HistorialAccionDTO historialAccionDTO) {
        HistorialAccion historial = modelMapper.map(historialAccionDTO, HistorialAccion.class);
        historial = historialAccionRepository.save(historial);
        return modelMapper.map(historial, HistorialAccionDTO.class);
    }

    @Override
    public HistorialAccionDTO actualizar(Long id, HistorialAccionDTO historialAccionDTO) {
        HistorialAccion historial = historialAccionRepository.findById(id).orElseThrow();
        historial.setAccion(historialAccionDTO.getAccion());
        historial.setFecha(historialAccionDTO.getFecha());
        historial.setUsuario(modelMapper.map(historialAccionDTO.getIdUsuario(), Usuario.class));
        historial = historialAccionRepository.save(historial);
        return modelMapper.map(historial, HistorialAccionDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        historialAccionRepository.deleteById(id);
    }
}
