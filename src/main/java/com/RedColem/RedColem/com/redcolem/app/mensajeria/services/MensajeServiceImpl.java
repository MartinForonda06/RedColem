package com.RedColem.RedColem.com.redcolem.app.mensajeria.services;

import com.RedColem.RedColem.com.redcolem.app.mensajeria.dtos.MensajeDTO;
import com.RedColem.RedColem.com.redcolem.app.mensajeria.entities.Mensaje;
import com.RedColem.RedColem.com.redcolem.app.mensajeria.repositories.MensajeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MensajeServiceImpl implements MensajeService {

    private final MensajeRepository mensajeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MensajeServiceImpl(MensajeRepository mensajeRepository, ModelMapper modelMapper) {
        this.mensajeRepository = mensajeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<MensajeDTO> obtenerTodos() {
        List<Mensaje> mensajes = mensajeRepository.findAll();
        return mensajes.stream()
                .map(mensaje -> modelMapper.map(mensaje, MensajeDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public MensajeDTO obtenerPorId(Long id) {
        Mensaje mensaje = mensajeRepository.findById(id).orElseThrow();
        return modelMapper.map(mensaje, MensajeDTO.class);
    }

    @Override
    public MensajeDTO crear(MensajeDTO mensajeDTO) {
        Mensaje mensaje = modelMapper.map(mensajeDTO, Mensaje.class);
        mensaje = mensajeRepository.save(mensaje);
        return modelMapper.map(mensaje, MensajeDTO.class);
    }

    @Override
    public MensajeDTO actualizar(Long id, MensajeDTO mensajeDTO) {
        Mensaje mensaje = mensajeRepository.findById(id).orElseThrow();
        mensaje.setContenido(mensajeDTO.getContenido());
        mensaje.setFechaEnvio(mensajeDTO.getFechaEnvio());
        mensaje.setConversacion(mensajeDTO.getIdConversacion());
        mensaje.setUsuario(mensajeDTO.getIdUsuario());
        mensaje = mensajeRepository.save(mensaje);
        return modelMapper.map(mensaje, MensajeDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        mensajeRepository.deleteById(id);
    }
}
