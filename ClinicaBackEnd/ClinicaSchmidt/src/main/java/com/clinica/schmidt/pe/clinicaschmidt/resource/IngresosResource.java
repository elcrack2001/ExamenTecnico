package com.clinica.schmidt.pe.clinicaschmidt.resource;

import java.time.LocalDate;

public class IngresosResource {
    private Integer ingresosId;
    private LocalDate FechaIngreso;
    private String Condicion;
    private Integer NumeroCama;
    private String Observaciones;

    private Integer numeroHistorialClinicoPacientes;
    private String nombrePacientes;
    private String apellidoPacientes;
    private String domicilioPacientes;
    private String provinciaPacientes;
    private Integer DNIPacientes;
    private Integer numeroTelefonoPacientes;
    private LocalDate fechaNacimientoPacientes;

    private Integer codigoMedicos;
    private String nombresMedicos;
    private String apellidosMedicos;
    private Integer DNIMedicos;
    private Integer numeroTelefonoMedicos;
    private String nombreEspecialidadMedicos;
    private String cargoMedicos;

    public Integer getIngresosId() {
        return ingresosId;
    }

    public IngresosResource setIngresosId(Integer ingresosId) {
        this.ingresosId = ingresosId;
        return this;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public IngresosResource setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
        return this;
    }

    public String getCondicion() {
        return Condicion;
    }

    public IngresosResource setCondicion(String condicion) {
        Condicion = condicion;
        return this;
    }

    public Integer getNumeroCama() {
        return NumeroCama;
    }

    public IngresosResource setNumeroCama(Integer numeroCama) {
        NumeroCama = numeroCama;
        return this;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public IngresosResource setObservaciones(String observaciones) {
        Observaciones = observaciones;
        return this;
    }

    public Integer getNumeroHistorialClinicoPacientes() {
        return numeroHistorialClinicoPacientes;
    }

    public IngresosResource setNumeroHistorialClinicoPacientes(Integer numeroHistorialClinicoPacientes) {
        this.numeroHistorialClinicoPacientes = numeroHistorialClinicoPacientes;
        return this;
    }

    public String getNombrePacientes() {
        return nombrePacientes;
    }

    public IngresosResource setNombrePacientes(String nombrePacientes) {
        this.nombrePacientes = nombrePacientes;
        return this;
    }

    public String getApellidoPacientes() {
        return apellidoPacientes;
    }

    public IngresosResource setApellidoPacientes(String apellidoPacientes) {
        this.apellidoPacientes = apellidoPacientes;
        return this;
    }

    public String getDomicilioPacientes() {
        return domicilioPacientes;
    }

    public IngresosResource setDomicilioPacientes(String domicilioPacientes) {
        this.domicilioPacientes = domicilioPacientes;
        return this;
    }

    public String getProvinciaPacientes() {
        return provinciaPacientes;
    }

    public IngresosResource setProvinciaPacientes(String provinciaPacientes) {
        this.provinciaPacientes = provinciaPacientes;
        return this;
    }

    public Integer getDNIPacientes() {
        return DNIPacientes;
    }

    public IngresosResource setDNIPacientes(Integer DNIPacientes) {
        this.DNIPacientes = DNIPacientes;
        return this;
    }

    public Integer getNumeroTelefonoPacientes() {
        return numeroTelefonoPacientes;
    }

    public IngresosResource setNumeroTelefonoPacientes(Integer numeroTelefonoPacientes) {
        this.numeroTelefonoPacientes = numeroTelefonoPacientes;
        return this;
    }

    public LocalDate getFechaNacimientoPacientes() {
        return fechaNacimientoPacientes;
    }

    public IngresosResource setFechaNacimientoPacientes(LocalDate fechaNacimientoPacientes) {
        this.fechaNacimientoPacientes = fechaNacimientoPacientes;
        return this;
    }

    public Integer getCodigoMedicos() {
        return codigoMedicos;
    }

    public IngresosResource setCodigoMedicos(Integer codigoMedicos) {
        this.codigoMedicos = codigoMedicos;
        return this;
    }

    public String getNombresMedicos() {
        return nombresMedicos;
    }

    public IngresosResource setNombresMedicos(String nombresMedicos) {
        this.nombresMedicos = nombresMedicos;
        return this;
    }

    public String getApellidosMedicos() {
        return apellidosMedicos;
    }

    public IngresosResource setApellidosMedicos(String apellidosMedicos) {
        this.apellidosMedicos = apellidosMedicos;
        return this;
    }

    public Integer getDNIMedicos() {
        return DNIMedicos;
    }

    public IngresosResource setDNIMedicos(Integer DNIMedicos) {
        this.DNIMedicos = DNIMedicos;
        return this;
    }

    public Integer getNumeroTelefonoMedicos() {
        return numeroTelefonoMedicos;
    }

    public IngresosResource setNumeroTelefonoMedicos(Integer numeroTelefonoMedicos) {
        this.numeroTelefonoMedicos = numeroTelefonoMedicos;
        return this;
    }

    public String getNombreEspecialidadMedicos() {
        return nombreEspecialidadMedicos;
    }

    public IngresosResource setNombreEspecialidadMedicos(String nombreEspecialidadMedicos) {
        this.nombreEspecialidadMedicos = nombreEspecialidadMedicos;
        return this;
    }

    public String getCargoMedicos() {
        return cargoMedicos;
    }

    public IngresosResource setCargoMedicos(String cargoMedicos) {
        this.cargoMedicos = cargoMedicos;
        return this;
    }
}
