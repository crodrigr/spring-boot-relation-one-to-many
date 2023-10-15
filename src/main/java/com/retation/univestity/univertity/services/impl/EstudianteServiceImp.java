package com.retation.univestity.univertity.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.retation.univestity.univertity.dto.EstudianteDTO;
import com.retation.univestity.univertity.repository.EstudianteRepository;
import com.retation.univestity.univertity.repository.entities.EstudianteEntity;
import com.retation.univestity.univertity.services.EstudianteService;



@Service
public class EstudianteServiceImp implements EstudianteService{

    @Autowired 
    private EstudianteRepository estudianteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<EstudianteDTO> findAll() {
        List<EstudianteEntity> estudiantes=(List<EstudianteEntity>) estudianteRepository.findAll();
        List<EstudianteDTO> estudiantesDTO=new ArrayList<>();
        for(EstudianteEntity es: estudiantes){
            EstudianteDTO esDTO=new EstudianteDTO();
            esDTO.setId(es.getId());
            esDTO.setNombre(es.getNombre());
            if(es.getMatricula()!=null){
            esDTO.setIdMatricula(es.getMatricula().getId());
            }
            estudiantesDTO.add(esDTO); 
        }
        return estudiantesDTO;
              
    }

    @Override
    @Transactional(readOnly = true)
    public EstudianteEntity findById(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public List<EstudianteEntity> getllAll() {
       return (List<EstudianteEntity>) estudianteRepository.findAll();
    }
    
}
