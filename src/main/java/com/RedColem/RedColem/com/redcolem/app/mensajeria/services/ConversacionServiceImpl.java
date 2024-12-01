package com.RedColem.RedColem.com.redcolem.app.mensajeria.services;

import com.RedColem.RedColem.com.redcolem.app.mensajeria.dtos.ConversacionDTO;
import com.RedColem.RedColem.com.redcolem.app.mensajeria.entities.Conversacion;
import com.RedColem.RedColem.com.redcolem.app.mensajeria.repositories.ConversacionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConversacionServiceImpl implements ConversacionService {

    private final ConversacionRepository conversacionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ConversacionServiceImpl(ConversacionRepository conversacionRepository, ModelMapper modelMapper) {
        this.conversacionRepository = conversacionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ConversacionDTO> obtenerTodas() {
        List<Conversacion> conversaciones = conversacionRepository.findAll();
        return conversaciones.stream()
                .map(conversacion -> modelMapper.map(conversacion, ConversacionDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ConversacionDTO obtenerPorId(Long id) {
        Conversacion conversacion = conversacionRepository.findById(id).orElseThrow();
        return modelMapper.map(conversacion, ConversacionDTO.class);
    }

    @Override
    public ConversacionDTO crear(ConversacionDTO conversacionDTO) {
        Conversacion conversacion = modelMapper.map(conversacionDTO, Conversacion.class);
        conversacion = conversacionRepository.save(conversacion);
        return modelMapper.map(conversacion, ConversacionDTO.class);
    }

    @Override
    public ConversacionDTO actualizar(Long id, ConversacionDTO conversacionDTO) {
        Conversacion conversacion = conversacionRepository.findById(id).orElseThrow();
        conversacion.setFechaCreacion(conversacionDTO.getFechaCreacion());
        conversacion.setUsuarioCreador(conversacionDTO.getIdUsuarioCreador());
        conversacion = conversacionRepository.save(conversacion);
        return modelMapper.map(conversacion, ConversacionDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        conversacionRepository.deleteById(id);
    }
}
