package com.ayudantia.ejemplo.Controladores;

import java.util.List;

import com.ayudantia.ejemplo.Controladores.util.PacienteRequest;
import com.ayudantia.ejemplo.Modelos.Paciente;
import com.ayudantia.ejemplo.Servicios.ServicioPaciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*")
public class PacienteControlador {
    
    @Autowired
    ServicioPaciente servicioP;

    @PostMapping(value="/registro")
    public boolean Registro(@RequestBody PacienteRequest request) {
        Paciente p = new Paciente(request.getId(),request.getNombre(),request.getRut(),request.getEnfermedad());
        return servicioP.crear(p);
    }

    @GetMapping(value="/verTodos")
    public List<Paciente> verTodosPacientes(){
        return servicioP.buscarTodos();
    }

    @PostMapping(value="/ver1Paciente")
    public Paciente ver1Paciente(@RequestBody PacienteRequest request){
        return servicioP.buscar(request.getId());
    }

    @DeleteMapping(value="/del1Paciente")
    public boolean del1Paciente(@RequestBody PacienteRequest request){
        return servicioP.delete(request.getId());
    }

    @PostMapping(value="/upd1Paciente")
    public boolean upd1Paciente(@RequestBody PacienteRequest request){
        return servicioP.update(request);
    }


}