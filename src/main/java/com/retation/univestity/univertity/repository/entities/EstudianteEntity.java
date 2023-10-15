package com.retation.univestity.univertity.repository.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="estudiantes")
public class EstudianteEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    @JsonIgnoreProperties("estudiante")
    private MatriculaEntity matricula;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="universidad_id")
    @JsonIgnoreProperties(value={"estudiantes","hibernateLazyInitializer"})
    private UniversidadEntity unversidad;

    
}
