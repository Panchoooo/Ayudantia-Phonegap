package com.ayudantia.ejemplo.Servicios;

import java.util.List;

import com.ayudantia.ejemplo.Controladores.util.PacienteRequest;
import com.ayudantia.ejemplo.Modelos.Paciente;
import com.ayudantia.ejemplo.Repositorios.PacienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaciente {
    
    @Autowired
    PacienteRepo repositorio;


    public boolean crear(Paciente p){
        try {
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(long id){

        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Paciente buscar(long id){
        return repositorio.findById(id);
    }

    public List<Paciente> buscarTodos(){
        return repositorio.findAll();
    }

    public boolean update(PacienteRequest request){
        try {
            Paciente p = repositorio.findById(request.getId());
            p.setEnfermedad(request.getEnfermedad());
            p.setNombre(request.getNombre());
            p.setRut(request.getRut());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }


}