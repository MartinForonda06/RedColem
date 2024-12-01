package com.RedColem.RedColem.app.emprendimiento.services;

import com.RedColem.RedColem.app.emprendimiento.dtos.EmprendimientoDTO;
import com.RedColem.RedColem.app.emprendimiento.entities.Emprendimiento;
import com.RedColem.RedColem.app.emprendimiento.repositories.EmprendimientoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmprendimientoServiceImpl implements EmprendimientoService {

    private final EmprendimientoRepository emprendimientoRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmprendimientoServiceImpl(EmprendimientoRepository emprendimientoRepository, ModelMapper modelMapper) {
        this.emprendimientoRepository = emprendimientoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EmprendimientoDTO> obtenerTodos() {
        List<Emprendimiento> emprendimientos = emprendimientoRepository.findAll();
        return emprendimientos.stream()
                .map(emprendimiento -> modelMapper.map(emprendimiento, EmprendimientoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmprendimientoDTO obtenerPorId(Long id) {
        Emprendimiento emprendimiento = emprendimientoRepository.findById(id).orElseThrow();
        return modelMapper.map(emprendimiento, EmprendimientoDTO.class);
    }

    @Override
    public EmprendimientoDTO crear(EmprendimientoDTO emprendimientoDTO) {
        Emprendimiento emprendimiento = modelMapper.map(emprendimientoDTO, Emprendimiento.class);
        emprendimiento = emprendimientoRepository.save(emprendimiento);
        return modelMapper.map(emprendimiento, EmprendimientoDTO.class);
    }

    @Override
    public EmprendimientoDTO actualizar(Long id, EmprendimientoDTO emprendimientoDTO) {
        Emprendimiento emprendimiento = emprendimientoRepository.findById(id).orElseThrow();
        emprendimiento.setNombre(emprendimientoDTO.getNombre());
        emprendimiento.setDescripcion(emprendimientoDTO.getDescripcion());
        emprendimiento.setObjetivo(emprendimientoDTO.getObjetivo());
        emprendimiento.setCalle(emprendimientoDTO.getCalle());
        emprendimiento.setCiudad(emprendimientoDTO.getCiudad());
        emprendimiento.setDepartamento(emprendimientoDTO.getIdDepartamento());
        emprendimiento.setUsuario(emprendimientoDTO.getIdUsuario());
        emprendimiento.setUrlImagen(emprendimientoDTO.getUrlImagen());
        emprendimiento.setUrlVideo(emprendimientoDTO.getUrlVideo());
        emprendimiento = emprendimientoRepository.save(emprendimiento);
        return modelMapper.map(emprendimiento, EmprendimientoDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        emprendimientoRepository.deleteById(id);
    }
}
