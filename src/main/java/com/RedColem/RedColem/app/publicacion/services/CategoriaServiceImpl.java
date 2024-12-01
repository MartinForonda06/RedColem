package com.RedColem.RedColem.app.publicacion.services;

import com.RedColem.RedColem.app.publicacion.dtos.CategoriaDTO;
import com.RedColem.RedColem.app.publicacion.entities.Categoria;
import com.RedColem.RedColem.app.publicacion.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CategoriaServiceImpl(CategoriaRepository categoriaRepository, ModelMapper modelMapper) {
        this.categoriaRepository = categoriaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoriaDTO> obtenerTodos() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias.stream()
                .map(categoria -> modelMapper.map(categoria, CategoriaDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CategoriaDTO obtenerPorId(Long id) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        return modelMapper.map(categoria, CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO crear(CategoriaDTO categoriaDTO) {
        Categoria categoria = modelMapper.map(categoriaDTO, Categoria.class);
        categoria = categoriaRepository.save(categoria);
        return modelMapper.map(categoria, CategoriaDTO.class);
    }

    @Override
    public CategoriaDTO actualizar(Long id, CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        categoria.setNombre(categoriaDTO.getNombre());
        categoria.setDescripcion(categoriaDTO.getDescripcion());
        categoria.setEmprendimiento(categoriaDTO.getIdEmprendimiento());
        categoria = categoriaRepository.save(categoria);
        return modelMapper.map(categoria, CategoriaDTO.class);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
