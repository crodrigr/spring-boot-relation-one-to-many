package com.retation.univestity.univertity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.retation.univestity.univertity.dto.EstudianteDTO;
import com.retation.univestity.univertity.repository.entities.EstudianteEntity;
import com.retation.univestity.univertity.repository.entities.MatriculaEntity;
import com.retation.univestity.univertity.services.EstudianteService;
import com.retation.univestity.univertity.services.MatriculaService;

@RestController
@RequestMapping("/universidad")
public class UniversadController {

    @Autowired
    private EstudianteService estudianteService;

    @Autowired
    private MatriculaService matriculaService;

    @GetMapping("/estudiantes/")
    public List<EstudianteDTO> findAll(){
        return estudianteService.findAll();
    }

    @PostMapping("/matricula/{idEstudiante}")
    public MatriculaEntity save(@PathVariable Long idEstudiante, @RequestBody MatriculaEntity matricula){
        return matriculaService.save(matricula,idEstudiante);
    }

     @GetMapping("/estudiantes/getAll")
     public List<EstudianteEntity> getAll(){
        return estudianteService.getllAll();
    }
    

    
    
}
