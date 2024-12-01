package com.RedColem.RedColem.app.actividad.services;

import com.RedColem.RedColem.app.actividad.dtos.ActividadDTO;
import com.RedColem.RedColem.app.actividad.entities.Actividad;
import com.RedColem.RedColem.app.actividad.repositories.ActividadRepository;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActividadServiceImpl implements ActividadService {

    private final ActividadRepository actividadRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ActividadServiceImpl(ActividadRepository actividadRepository, ModelMapper modelMapper) {
        this.actividadRepository = actividadRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ActividadDTO> obtenerTodas() {
        List<Actividad> actividades = actividadRepository.findAll();
        return actividades.stream()
                .map(actividad -> modelMapper.map(actividad, ActividadDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ActividadDTO obtenerPorId(Long id) {
        Actividad actividad = actividadRepository.findById(id).orElseThrow();
        return modelMapper.map(actividad, ActividadDTO.class);
    }

    @Override
    public ActividadDTO crear(ActividadDTO actividadDTO) {
        Actividad actividad = modelMapper.map(actividadDTO, Actividad.class);
        actividad = actividadRepository.save(actividad);
        return modelMapper.map(actividad, ActividadDTO.class);
    }

    @Override
    public ActividadDTO actualizar(Long id, ActividadDTO actividadDTO) {
        Actividad actividad = actividadRepository.findById(id).orElseThrow();
        actividad.setNombre(actividadDTO.getNombre());
        actividad.setFechaInicio(actividadDTO.getFechaInicio());
        actividad.setFechaFin(actividadDTO.getFechaFin());
        actividad.setDescripcion(actividadDTO.getDescripcion());
        actividad.setEstado(actividadDTO.getEstado());
        actividad.setUrlImagen(actividadDTO.getUrlImagen());
        actividad.setUrlVideo(actividadDTO.getUrlVideo());
        actividad = actividadRepository.save(actividad);
        return modelMapper.map(actividad, ActividadDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        actividadRepository.deleteById(id);
    }
}
