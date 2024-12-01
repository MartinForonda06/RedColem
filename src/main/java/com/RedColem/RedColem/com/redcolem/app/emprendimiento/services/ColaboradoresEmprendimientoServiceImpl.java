package com.RedColem.RedColem.com.redcolem.app.emprendimiento.services;

import com.RedColem.RedColem.com.redcolem.app.emprendimiento.dtos.ColaboradoresEmprendimientoDTO;
import com.RedColem.RedColem.com.redcolem.app.emprendimiento.entities.ColaboradoresEmprendimiento;
import com.RedColem.RedColem.com.redcolem.app.emprendimiento.repositories.ColaboradoresEmprendimientoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ColaboradoresEmprendimientoServiceImpl implements ColaboradoresEmprendimientoService {

    private final ColaboradoresEmprendimientoRepository colaboradoresEmprendimientoRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ColaboradoresEmprendimientoServiceImpl(ColaboradoresEmprendimientoRepository colaboradoresEmprendimientoRepository, ModelMapper modelMapper) {
        this.colaboradoresEmprendimientoRepository = colaboradoresEmprendimientoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ColaboradoresEmprendimientoDTO> obtenerTodos() {
        List<ColaboradoresEmprendimiento> colaboradores = colaboradoresEmprendimientoRepository.findAll();
        return colaboradores.stream()
                .map(colaborador -> modelMapper.map(colaborador, ColaboradoresEmprendimientoDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ColaboradoresEmprendimientoDTO obtenerPorId(Long id) {
        ColaboradoresEmprendimiento colaborador = colaboradoresEmprendimientoRepository.findById(id).orElseThrow();
        return modelMapper.map(colaborador, ColaboradoresEmprendimientoDTO.class);
    }

    @Override
    public ColaboradoresEmprendimientoDTO crear(ColaboradoresEmprendimientoDTO colaboradoresEmprendimientoDTO) {
        ColaboradoresEmprendimiento colaborador = modelMapper.map(colaboradoresEmprendimientoDTO, ColaboradoresEmprendimiento.class);
        colaborador = colaboradoresEmprendimientoRepository.save(colaborador);
        return modelMapper.map(colaborador, ColaboradoresEmprendimientoDTO.class);
    }

    @Override
    public ColaboradoresEmprendimientoDTO actualizar(Long id, ColaboradoresEmprendimientoDTO colaboradoresEmprendimientoDTO) {
        ColaboradoresEmprendimiento colaborador = colaboradoresEmprendimientoRepository.findById(id).orElseThrow();
        colaborador.setRol(colaboradoresEmprendimientoDTO.getRol());
        colaborador.setFechaIncorporacion(colaboradoresEmprendimientoDTO.getFechaIncorporacion());
        colaborador.setEmprendimiento(colaboradoresEmprendimientoDTO.getIdEmprendimiento());
        colaborador.setUsuario(colaboradoresEmprendimientoDTO.getIdUsuario());
        colaborador = colaboradoresEmprendimientoRepository.save(colaborador);
        return modelMapper.map(colaborador, ColaboradoresEmprendimientoDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        colaboradoresEmprendimientoRepository.deleteById(id);
    }
}
