package com.ayudantia.ejemplo.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="rut")
    private String rut;

    @Column(name="enfermedad")
    private String enfermedad;


    public Paciente() {
    }

    public Paciente(long id, String nombre, String rut, String enfermedad) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.enfermedad = enfermedad;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }


}