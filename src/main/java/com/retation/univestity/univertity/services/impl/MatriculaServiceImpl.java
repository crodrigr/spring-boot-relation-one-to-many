package com.retation.univestity.univertity.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retation.univestity.univertity.repository.EstudianteRepository;
import com.retation.univestity.univertity.repository.MatriculaRepository;
import com.retation.univestity.univertity.repository.entities.EstudianteEntity;
import com.retation.univestity.univertity.repository.entities.MatriculaEntity;
import com.retation.univestity.univertity.services.MatriculaService;



@Service
public class MatriculaServiceImpl implements MatriculaService {

    @Autowired
    private EstudianteRepository estudianteRepository;

     @Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    @Transactional
    public MatriculaEntity save(MatriculaEntity matricula, Long idEstudiante) {
        Optional<EstudianteEntity> estudiante=estudianteRepository.findById(idEstudiante);     
        
        if(estudiante.isPresent()){
           matricula.setEstudiante(estudiante.get());
           matriculaRepository.save(matricula);
        }
        return null;
    }
    
}
