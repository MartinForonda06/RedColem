package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.ModeradorDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Moderador;
import com.RedColem.RedColem.com.redcolem.app.roles.repositories.ModeradorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ModeradorServiceImpl implements ModeradorService {

    private final ModeradorRepository moderadorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ModeradorServiceImpl(ModeradorRepository moderadorRepository, ModelMapper modelMapper) {
        this.moderadorRepository = moderadorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ModeradorDTO> obtenerTodos() {
        List<Moderador> moderadores = moderadorRepository.findAll();
        return moderadores.stream()
                .map(m -> modelMapper.map(m, ModeradorDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ModeradorDTO obtenerPorId(Long id) {
        Moderador moderador = moderadorRepository.findById(id).orElseThrow();
        return modelMapper.map(moderador, ModeradorDTO.class);
    }

    @Override
    public ModeradorDTO crear(ModeradorDTO moderadorDTO) {
        Moderador moderador = modelMapper.map(moderadorDTO, Moderador.class);
        moderador = moderadorRepository.save(moderador);
        return modelMapper.map(moderador, ModeradorDTO.class);
    }

    @Override
    public ModeradorDTO actualizar(Long id, ModeradorDTO moderadorDTO) {
        Moderador moderador = moderadorRepository.findById(id).orElseThrow();
        moderador.setUsuario(moderadorDTO.getIdUsuario());
        moderador.setFechaAsignacion(moderadorDTO.getFechaAsignacion());
        moderador = moderadorRepository.save(moderador);
        return modelMapper.map(moderador, ModeradorDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        moderadorRepository.deleteById(id);
    }
}
