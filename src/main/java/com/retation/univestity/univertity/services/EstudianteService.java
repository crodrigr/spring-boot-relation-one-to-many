package com.retation.univestity.univertity.services;

import java.util.List;

import com.retation.univestity.univertity.dto.EstudianteDTO;
import com.retation.univestity.univertity.repository.entities.EstudianteEntity;

public interface EstudianteService {

    List<EstudianteDTO> findAll();

    List<EstudianteEntity> getllAll();

    EstudianteEntity findById(Long id);
    
}
