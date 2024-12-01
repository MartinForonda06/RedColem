package com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.services;

import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.dtos.NotificacionDTO;
import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.entities.Notificacion;
import com.RedColem.RedColem.com.redcolem.app.seguidores_notificaciones.repositories.NotificacionesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificacionesServiceImpl implements NotificacionesService {

    private final NotificacionesRepository notificacionesRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public NotificacionesServiceImpl(NotificacionesRepository notificacionesRepository, ModelMapper modelMapper) {
        this.notificacionesRepository = notificacionesRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<NotificacionDTO> obtenerTodas() {
        List<Notificacion> notificaciones = notificacionesRepository.findAll();
        return notificaciones.stream()
                .map(notificacion -> modelMapper.map(notificacion, NotificacionDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public NotificacionDTO obtenerPorId(Long id) {
        Notificacion notificacion = notificacionesRepository.findById(id).orElseThrow();
        return modelMapper.map(notificacion, NotificacionDTO.class);
    }

    @Override
    public NotificacionDTO crear(NotificacionDTO notificacionDTO) {
        Notificacion notificacion = modelMapper.map(notificacionDTO, Notificacion.class);
        notificacion = notificacionesRepository.save(notificacion);
        return modelMapper.map(notificacion, NotificacionDTO.class);
    }

    @Override
    public NotificacionDTO actualizar(Long id, NotificacionDTO notificacionDTO) {
        Notificacion notificacion = notificacionesRepository.findById(id).orElseThrow();
        notificacion.setTipo(notificacionDTO.getTipo());
        notificacion.setContenido(notificacionDTO.getContenido());
        notificacion.setLeido(notificacionDTO.getLeido());
        notificacion.setFecha(notificacionDTO.getFecha());
        notificacion = notificacionesRepository.save(notificacion);
        return modelMapper.map(notificacion, NotificacionDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        notificacionesRepository.deleteById(id);
    }
}
