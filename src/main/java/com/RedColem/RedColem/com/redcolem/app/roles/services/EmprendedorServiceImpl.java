package com.RedColem.RedColem.com.redcolem.app.roles.services;

import com.RedColem.RedColem.com.redcolem.app.roles.dtos.EmprendedorDTO;
import com.RedColem.RedColem.com.redcolem.app.roles.entities.Emprendedor;
import com.RedColem.RedColem.com.redcolem.app.roles.repositories.EmprendedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmprendedorServiceImpl implements EmprendedorService {

    private final EmprendedorRepository emprendedorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmprendedorServiceImpl(EmprendedorRepository emprendedorRepository, ModelMapper modelMapper) {
        this.emprendedorRepository = emprendedorRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EmprendedorDTO> obtenerTodos() {
        List<Emprendedor> emprendedores = emprendedorRepository.findAll();
        return emprendedores.stream()
                .map(e -> modelMapper.map(e, EmprendedorDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public EmprendedorDTO obtenerPorId(Long id) {
        Emprendedor emprendedor = emprendedorRepository.findById(id).orElseThrow();
        return modelMapper.map(emprendedor, EmprendedorDTO.class);
    }

    @Override
    public EmprendedorDTO crear(EmprendedorDTO emprendedorDTO) {
        Emprendedor emprendedor = modelMapper.map(emprendedorDTO, Emprendedor.class);
        emprendedor = emprendedorRepository.save(emprendedor);
        return modelMapper.map(emprendedor, EmprendedorDTO.class);
    }

    @Override
    public EmprendedorDTO actualizar(Long id, EmprendedorDTO emprendedorDTO) {
        Emprendedor emprendedor = emprendedorRepository.findById(id).orElseThrow();
        emprendedor.setUsuario(emprendedorDTO.getIdUsuario());
        emprendedor.setFechaRegistro(emprendedorDTO.getFechaRegistro());
        emprendedor = emprendedorRepository.save(emprendedor);
        return modelMapper.map(emprendedor, EmprendedorDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        emprendedorRepository.deleteById(id);
    }
}
