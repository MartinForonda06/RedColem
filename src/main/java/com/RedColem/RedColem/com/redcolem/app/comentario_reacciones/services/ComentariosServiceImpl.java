package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.services;

import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.dtos.ComentariosDTO;
import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.entities.Comentarios;
import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.repositories.ComentariosRepository;
import org.modelmapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComentariosServiceImpl implements com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.services.ComentariosService {

    private final ComentariosRepository comentariosRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ComentariosServiceImpl(ComentariosRepository comentariosRepository, ModelMapper modelMapper) {
        this.comentariosRepository = comentariosRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ComentariosDTO> obtenerTodos() {
        List<Comentarios> comentarios = comentariosRepository.findAll();
        return comentarios.stream()
                .map(comentario -> modelMapper.map(comentario, ComentariosDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ComentariosDTO obtenerPorId(Long id) {
        Comentarios comentario = comentariosRepository.findById(id).orElseThrow();
        return modelMapper.map(comentario, ComentariosDTO.class);
    }

    @Override
    public ComentariosDTO crear(ComentariosDTO comentariosDTO) {
        Comentarios comentario = modelMapper.map(comentariosDTO, Comentarios.class);
        comentario = comentariosRepository.save(comentario);
        return modelMapper.map(comentario, ComentariosDTO.class);
    }

    @Override
    public ComentariosDTO actualizar(Long id, ComentariosDTO comentariosDTO) {
        Comentarios comentario = comentariosRepository.findById(id).orElseThrow();
        comentario.setContenido(comentariosDTO.getContenido());
        comentario.setFechaCreacion(comentariosDTO.getFechaCreacion());
        comentario.setFechaModificacion(comentariosDTO.getFechaModificacion());
        comentario.setUrlImagen(comentariosDTO.getUrlImagen());
        comentario.setUrlVideo(comentariosDTO.getUrlVideo());
        comentario = comentariosRepository.save(comentario);
        return modelMapper.map(comentario, ComentariosDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        comentariosRepository.deleteById(id);
    }
}
