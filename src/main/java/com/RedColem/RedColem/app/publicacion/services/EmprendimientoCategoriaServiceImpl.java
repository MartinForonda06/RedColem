package com.RedColem.RedColem.app.publicacion.services;

import com.RedColem.RedColem.app.publicacion.dtos.EmprendimientoCategoriaDTO;
import com.RedColem.RedColem.app.publicacion.entities.EmprendimientoCategoria;
import com.RedColem.RedColem.app.publicacion.repositories.EmprendimientoCategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmprendimientoCategoriaServiceImpl implements EmprendimientoCategoriaService {

    private final EmprendimientoCategoriaRepository emprendimientoCategoriaRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmprendimientoCategoriaServiceImpl(EmprendimientoCategoriaRepository emprendimientoCategoriaRepository, ModelMapper modelMapper) {
        this.emprendimientoCategoriaRepository = emprendimientoCategoriaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EmprendimientoCategoriaDTO> obtenerTodos() {
        List<EmprendimientoCategoria> emprendimientoCategorias = emprendimientoCategoriaRepository.findAll();
        return emprendimientoCategorias.stream()
                .map(ec -> modelMapper.map(ec, EmprendimientoCategoriaDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmprendimientoCategoriaDTO obtenerPorId(Long id) {
        EmprendimientoCategoria emprendimientoCategoria = emprendimientoCategoriaRepository.findById(id).orElseThrow();
        return modelMapper.map(emprendimientoCategoria, EmprendimientoCategoriaDTO.class);
    }

    @Override
    public EmprendimientoCategoriaDTO crear(EmprendimientoCategoriaDTO emprendimientoCategoriaDTO) {
        EmprendimientoCategoria emprendimientoCategoria = modelMapper.map(emprendimientoCategoriaDTO, EmprendimientoCategoria.class);
        emprendimientoCategoria = emprendimientoCategoriaRepository.save(emprendimientoCategoria);
        return modelMapper.map(emprendimientoCategoria, EmprendimientoCategoriaDTO.class);
    }

    @Override
    public EmprendimientoCategoriaDTO actualizar(Long id, EmprendimientoCategoriaDTO emprendimientoCategoriaDTO) {
        EmprendimientoCategoria emprendimientoCategoria = emprendimientoCategoriaRepository.findById(id).orElseThrow();
        emprendimientoCategoria.setEmprendimiento(emprendimientoCategoriaDTO.getIdEmprendimiento());
        emprendimientoCategoria.setCategoria(emprendimientoCategoriaDTO.getIdCategoria());
        emprendimientoCategoria = emprendimientoCategoriaRepository.save(emprendimientoCategoria);
        return modelMapper.map(emprendimientoCategoria, EmprendimientoCategoriaDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        emprendimientoCategoriaRepository.deleteById(id);
    }
}
