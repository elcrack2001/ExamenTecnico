package com.clinica.schmidt.pe.clinicaschmidt.resource;

import java.time.LocalDate;

public class PatologiaClinicaResource {
    private Integer examenId;
    private String NombreExamen;
    private String Restultado;
    private LocalDate FechaExamen;

    private Integer numeroHistorialClinicoPacientes;
    private String nombrePacientes;
    private String apellidoPacientes;
    private String domicilioPacientes;
    private String provinciaPacientes;
    private Integer DNIPacientes;
    private Integer numeroTelefonoPacientes;
    private LocalDate fechaNacimientoPacientes;

    public Integer getExamenId() {
        return examenId;
    }

    public PatologiaClinicaResource setExamenId(Integer examenId) {
        this.examenId = examenId;
        return this;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public PatologiaClinicaResource setNombreExamen(String nombreExamen) {
        NombreExamen = nombreExamen;
        return this;
    }

    public String getRestultado() {
        return Restultado;
    }

    public PatologiaClinicaResource setRestultado(String restultado) {
        Restultado = restultado;
        return this;
    }

    public LocalDate getFechaExamen() {
        return FechaExamen;
    }

    public PatologiaClinicaResource setFechaExamen(LocalDate fechaExamen) {
        FechaExamen = fechaExamen;
        return this;
    }

    public Integer getNumeroHistorialClinicoPacientes() {
        return numeroHistorialClinicoPacientes;
    }

    public PatologiaClinicaResource setNumeroHistorialClinicoPacientes(Integer numeroHistorialClinicoPacientes) {
        this.numeroHistorialClinicoPacientes = numeroHistorialClinicoPacientes;
        return this;
    }

    public String getNombrePacientes() {
        return nombrePacientes;
    }

    public PatologiaClinicaResource setNombrePacientes(String nombrePacientes) {
        this.nombrePacientes = nombrePacientes;
        return this;
    }

    public String getApellidoPacientes() {
        return apellidoPacientes;
    }

    public PatologiaClinicaResource setApellidoPacientes(String apellidoPacientes) {
        this.apellidoPacientes = apellidoPacientes;
        return this;
    }

    public String getDomicilioPacientes() {
        return domicilioPacientes;
    }

    public PatologiaClinicaResource setDomicilioPacientes(String domicilioPacientes) {
        this.domicilioPacientes = domicilioPacientes;
        return this;
    }

    public String getProvinciaPacientes() {
        return provinciaPacientes;
    }

    public PatologiaClinicaResource setProvinciaPacientes(String provinciaPacientes) {
        this.provinciaPacientes = provinciaPacientes;
        return this;
    }

    public Integer getDNIPacientes() {
        return DNIPacientes;
    }

    public PatologiaClinicaResource setDNIPacientes(Integer DNIPacientes) {
        this.DNIPacientes = DNIPacientes;
        return this;
    }

    public Integer getNumeroTelefonoPacientes() {
        return numeroTelefonoPacientes;
    }

    public PatologiaClinicaResource setNumeroTelefonoPacientes(Integer numeroTelefonoPacientes) {
        this.numeroTelefonoPacientes = numeroTelefonoPacientes;
        return this;
    }

    public LocalDate getFechaNacimientoPacientes() {
        return fechaNacimientoPacientes;
    }

    public PatologiaClinicaResource setFechaNacimientoPacientes(LocalDate fechaNacimientoPacientes) {
        this.fechaNacimientoPacientes = fechaNacimientoPacientes;
        return this;
    }
}
