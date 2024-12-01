package com.RedColem.RedColem.app.usuario.services;

import com.RedColem.RedColem.app.usuario.dtos.DepartamentoDTO;
import com.RedColem.RedColem.app.usuario.entities.Departamento;
import com.RedColem.RedColem.app.usuario.repositories.DepartamentoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

    private final DepartamentoRepository departamentoRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public DepartamentoServiceImpl(DepartamentoRepository departamentoRepository, ModelMapper modelMapper) {
        this.departamentoRepository = departamentoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<DepartamentoDTO> obtenerTodos() {
        List<Departamento> departamentos = departamentoRepository.findAll();
        return departamentos.stream()
                .map(departamento -> modelMapper.map(departamento, DepartamentoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public DepartamentoDTO obtenerPorId(Long id) {
        Departamento departamento = departamentoRepository.findById(id).orElseThrow();
        return modelMapper.map(departamento, DepartamentoDTO.class);
    }

    @Override
    public DepartamentoDTO crear(DepartamentoDTO departamentoDTO) {
        Departamento departamento = modelMapper.map(departamentoDTO, Departamento.class);
        departamento = departamentoRepository.save(departamento);
        return modelMapper.map(departamento, DepartamentoDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        departamentoRepository.deleteById(id);
    }
}
