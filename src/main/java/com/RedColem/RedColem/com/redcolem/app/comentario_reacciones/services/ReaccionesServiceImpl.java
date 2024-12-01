package com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.services;

import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.dtos.ReaccionesDTO;
import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.entities.Reacciones;
import com.RedColem.RedColem.com.redcolem.app.comentario_reacciones.repositories.ReaccionesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReaccionesServiceImpl implements ReaccionesService {

    private final ReaccionesRepository reaccionesRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ReaccionesServiceImpl(ReaccionesRepository reaccionesRepository, ModelMapper modelMapper) {
        this.reaccionesRepository = reaccionesRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ReaccionesDTO> obtenerTodos() {
        List<Reacciones> reacciones = reaccionesRepository.findAll();
        return reacciones.stream()
                .map(reaccion -> modelMapper.map(reaccion, ReaccionesDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ReaccionesDTO obtenerPorId(Long id) {
        Reacciones reaccion = reaccionesRepository.findById(id).orElseThrow();
        return modelMapper.map(reaccion, ReaccionesDTO.class);
    }

    @Override
    public ReaccionesDTO crear(ReaccionesDTO reaccionesDTO) {
        Reacciones reaccion = modelMapper.map(reaccionesDTO, Reacciones.class);
        reaccion = reaccionesRepository.save(reaccion);
        return modelMapper.map(reaccion, ReaccionesDTO.class);
    }

    @Override
    public ReaccionesDTO actualizar(Long id, ReaccionesDTO reaccionesDTO) {
        Reacciones reaccion = reaccionesRepository.findById(id).orElseThrow();
        reaccion.setTipo(reaccionesDTO.getTipo());
        reaccion.setUsuario(reaccionesDTO.getIdUsuario());
        reaccion.setComentario(reaccionesDTO.getIdComentario());
        reaccion.setEmprendimiento(reaccionesDTO.getIdEmprendimiento());
        reaccion.setActividad(reaccionesDTO.getIdActividad());
        reaccion = reaccionesRepository.save(reaccion);
        return modelMapper.map(reaccion, ReaccionesDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        reaccionesRepository.deleteById(id);
    }
}
