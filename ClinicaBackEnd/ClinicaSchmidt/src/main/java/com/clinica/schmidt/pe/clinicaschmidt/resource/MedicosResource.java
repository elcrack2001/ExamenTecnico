package com.clinica.schmidt.pe.clinicaschmidt.resource;

public class MedicosResource {
    private Integer codigoMedico;
    private String nombres;
    private String apellidos;
    private Integer DNI;
    private Integer numeroTelefono;
    private String nombreEspecialidad;
    private String cargo;

    public Integer getCodigoMedico() {
        return codigoMedico;
    }

    public MedicosResource setCodigoMedico(Integer codigoMedico) {
        this.codigoMedico = codigoMedico;
        return this;
    }

    public String getNombres() {
        return nombres;
    }

    public MedicosResource setNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public MedicosResource setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Integer getDNI() {
        return DNI;
    }

    public MedicosResource setDNI(Integer DNI) {
        this.DNI = DNI;
        return this;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public MedicosResource setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public MedicosResource setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public MedicosResource setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }
}
