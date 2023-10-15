package com.retation.univestity.univertity.services;

import com.retation.univestity.univertity.repository.entities.MatriculaEntity;

public interface MatriculaService {

    MatriculaEntity save(MatriculaEntity matricula, Long idEstudiante);
    
}
