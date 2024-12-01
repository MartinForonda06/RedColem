package com.RedColem.RedColem.com.redcolem.app.actividad.services;

import com.RedColem.RedColem.com.redcolem.app.actividad.dtos.InnovacionDTO;
import com.RedColem.RedColem.com.redcolem.app.actividad.entities.Innovacion;
import com.RedColem.RedColem.com.redcolem.app.actividad.repositories.InnovacionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InnovacionServiceImpl implements InnovacionService {

    private final InnovacionRepository innovacionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public InnovacionServiceImpl(InnovacionRepository innovacionRepository, ModelMapper modelMapper) {
        this.innovacionRepository = innovacionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<InnovacionDTO> obtenerTodas() {
        List<Innovacion> innovaciones = innovacionRepository.findAll();
        return innovaciones.stream()
                .map(innovacion -> modelMapper.map(innovacion, InnovacionDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public InnovacionDTO obtenerPorId(Long id) {
        Innovacion innovacion = innovacionRepository.findById(id).orElseThrow();
        return modelMapper.map(innovacion, InnovacionDTO.class);
    }

    @Override
    public InnovacionDTO crear(InnovacionDTO innovacionDTO) {
        Innovacion innovacion = modelMapper.map(innovacionDTO, Innovacion.class);
        innovacion = innovacionRepository.save(innovacion);
        return modelMapper.map(innovacion, InnovacionDTO.class);
    }

    @Override
    public InnovacionDTO actualizar(Long id, InnovacionDTO innovacionDTO) {
        Innovacion innovacion = innovacionRepository.findById(id).orElseThrow();
        innovacion.setTipoInnovacion(innovacionDTO.getTipoInnovacion());
        innovacion.setImpacto(innovacionDTO.getImpacto());
        innovacion.setDescripcion(innovacionDTO.getDescripcion());
        innovacion.setFecha(innovacionDTO.getFecha());
        innovacion.setUrlImagen(innovacionDTO.getUrlImagen());
        innovacion.setUrlVideo(innovacionDTO.getUrlVideo());
        innovacion = innovacionRepository.save(innovacion);
        return modelMapper.map(innovacion, InnovacionDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        innovacionRepository.deleteById(id);
    }
}
