package com.RedColem.RedColem.com.redcolem.app.usuario.services;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.UsuariodepartamentoDTO;
import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuariodepartamento;
import com.RedColem.RedColem.com.redcolem.app.usuario.repositories.UsuariodepartamentoRepository;
import com.RedColem.RedColem.com.redcolem.app.usuario.services.UsuariodepartamentoService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuariodepartamentoServiceImpl implements UsuariodepartamentoService {

    private final UsuariodepartamentoRepository repository;
    private final ModelMapper mapper;

    public UsuariodepartamentoServiceImpl(UsuariodepartamentoRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<UsuariodepartamentoDTO> findAll() {
        return repository.findAll().stream()
                .map(entity -> mapper.map(entity, UsuariodepartamentoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UsuariodepartamentoDTO findById(Integer id) {
        Usuariodepartamento entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuariodepartamento not found"));
        return mapper.map(entity, UsuariodepartamentoDTO.class);
    }

    @Override
    public UsuariodepartamentoDTO save(UsuariodepartamentoDTO dto) {
        Usuariodepartamento entity = mapper.map(dto, Usuariodepartamento.class);
        return mapper.map(repository.save(entity), UsuariodepartamentoDTO.class);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
