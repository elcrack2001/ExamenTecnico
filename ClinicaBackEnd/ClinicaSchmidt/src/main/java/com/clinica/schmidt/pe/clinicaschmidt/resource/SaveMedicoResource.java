package com.clinica.schmidt.pe.clinicaschmidt.resource;

public class SaveMedicoResource {
    private String nombres;
    private String apellidos;
    private Integer DNI;
    private Integer numeroTelefono;
    private String nombreEspecialidad;
    private String cargo;

    public String getNombres() {
        return nombres;
    }

    public SaveMedicoResource setNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public SaveMedicoResource setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Integer getDNI() {
        return DNI;
    }

    public SaveMedicoResource setDNI(Integer DNI) {
        this.DNI = DNI;
        return this;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public SaveMedicoResource setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public SaveMedicoResource setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public SaveMedicoResource setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }
}
