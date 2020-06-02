package com.ayudantia.ejemplo.Controladores.util;


public class PacienteRequest {
 
    private long id;

    private String nombre;

    private String enfermedad;

    private String rut;

    public PacienteRequest() {
    }

    public PacienteRequest(long id) {
        this.id = id;
    }

    public PacienteRequest(String rut) {
        this.rut = rut;
    }

    public PacienteRequest(long id,String rut, String nombre, String enfermedad) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
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


    public String getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

}