package com.RedColem.RedColem.com.redcolem.app.usuario.services;

import com.RedColem.RedColem.com.redcolem.app.usuario.dtos.UsuarioDTO;
import com.RedColem.RedColem.com.redcolem.app.usuario.entities.Usuario;
import com.RedColem.RedColem.com.redcolem.app.usuario.repositories.UsuarioRepository;
import com.RedColem.RedColem.com.redcolem.app.usuario.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;
    private final ModelMapper mapper;

    public UsuarioServiceImpl(UsuarioRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<UsuarioDTO> findAll() {
        return repository.findAll().stream()
                .map(usuario -> mapper.map(usuario, UsuarioDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO findById(Integer id) {
        Usuario usuario = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return mapper.map(usuario, UsuarioDTO.class);
    }

    @Override
    public UsuarioDTO save(UsuarioDTO dto) {
        Usuario usuario = mapper.map(dto, Usuario.class);
        return mapper.map(repository.save(usuario), UsuarioDTO.class);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
