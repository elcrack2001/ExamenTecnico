package com.clinica.schmidt.pe.clinicaschmidt.resource;

import java.time.LocalDate;

public class PacientesResource {
    private Integer numeroHistorialClinico;
    private String nombrePaciente;
    private String apellidoPaciente;
    private String domicilio;
    private String provincia;
    private Integer DNI;
    private Integer numeroTelefono;
    private LocalDate fechaNacimiento;

    public Integer getNumeroHistorialClinico() {
        return numeroHistorialClinico;
    }

    public PacientesResource setNumeroHistorialClinico(Integer numeroHistorialClinico) {
        this.numeroHistorialClinico = numeroHistorialClinico;
        return this;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public PacientesResource setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
        return this;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public PacientesResource setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
        return this;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public PacientesResource setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        return this;
    }

    public String getProvincia() {
        return provincia;
    }

    public PacientesResource setProvincia(String provincia) {
        this.provincia = provincia;
        return this;
    }

    public Integer getDNI() {
        return DNI;
    }

    public PacientesResource setDNI(Integer DNI) {
        this.DNI = DNI;
        return this;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public PacientesResource setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public PacientesResource setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
}
