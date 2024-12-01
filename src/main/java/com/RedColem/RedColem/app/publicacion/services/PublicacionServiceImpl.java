package com.RedColem.RedColem.app.publicacion.services;

import com.RedColem.RedColem.app.publicacion.dtos.PublicacionDTO;
import com.RedColem.RedColem.app.publicacion.entities.Publicacion;
import com.RedColem.RedColem.app.publicacion.repositories.PublicacionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublicacionServiceImpl implements PublicacionService {

    private final PublicacionRepository publicacionRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public PublicacionServiceImpl(PublicacionRepository publicacionRepository, ModelMapper modelMapper) {
        this.publicacionRepository = publicacionRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<PublicacionDTO> obtenerTodos() {
        List<Publicacion> publicaciones = publicacionRepository.findAll();
        return publicaciones.stream()
                .map(p -> modelMapper.map(p, PublicacionDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PublicacionDTO obtenerPorId(Long id) {
        Publicacion publicacion = publicacionRepository.findById(id).orElseThrow();
        return modelMapper.map(publicacion, PublicacionDTO.class);
    }

    @Override
    public PublicacionDTO crear(PublicacionDTO publicacionDTO) {
        Publicacion publicacion = modelMapper.map(publicacionDTO, Publicacion.class);
        publicacion = publicacionRepository.save(publicacion);
        return modelMapper.map(publicacion, PublicacionDTO.class);
    }

    @Override
    public PublicacionDTO actualizar(Long id, PublicacionDTO publicacionDTO) {
        Publicacion publicacion = publicacionRepository.findById(id).orElseThrow();
        publicacion.setTitulo(publicacionDTO.getTitulo());
        publicacion.setContenido(publicacionDTO.getContenido());
        publicacion.setUsuario(publicacionDTO.getIdUsuario());
        publicacion.setEmprendimiento(publicacionDTO.getIdEmprendimiento());
        publicacion.setUrlImagen(publicacionDTO.getUrlImagen());
        publicacion.setUrlVideo(publicacionDTO.getUrlVideo());
        publicacion = publicacionRepository.save(publicacion);
        return modelMapper.map(publicacion, PublicacionDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        publicacionRepository.deleteById(id);
    }
}
