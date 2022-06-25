package com.clinica.schmidt.pe.clinicaschmidt.resource;

import java.time.LocalDate;

public class SavePacientesResource {
    private String nombrePaciente;
    private String apellidoPaciente;
    private String domicilio;
    private String provincia;
    private Integer DNI;
    private Integer numeroTelefono;
    private LocalDate fechaNacimiento;

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public SavePacientesResource setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
        return this;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public SavePacientesResource setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
        return this;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public SavePacientesResource setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        return this;
    }

    public String getProvincia() {
        return provincia;
    }

    public SavePacientesResource setProvincia(String provincia) {
        this.provincia = provincia;
        return this;
    }

    public Integer getDNI() {
        return DNI;
    }

    public SavePacientesResource setDNI(Integer DNI) {
        this.DNI = DNI;
        return this;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public SavePacientesResource setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public SavePacientesResource setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
}
