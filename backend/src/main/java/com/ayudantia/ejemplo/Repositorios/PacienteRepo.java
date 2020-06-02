package com.ayudantia.ejemplo.Repositorios;

import java.util.List;

import com.ayudantia.ejemplo.Modelos.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepo extends JpaRepository<Paciente,Long>{
    
    Paciente findById(long id);

    List<Paciente> findAll();

}