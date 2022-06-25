package com.clinica.schmidt.pe.clinicaschmidt.resource;

import java.time.LocalDate;

public class SaveIngresosResource {
    private LocalDate FechaIngreso;
    private String Condicion;
    private Integer NumeroCama;
    private String Observaciones;

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public SaveIngresosResource setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
        return this;
    }

    public String getCondicion() {
        return Condicion;
    }

    public SaveIngresosResource setCondicion(String condicion) {
        Condicion = condicion;
        return this;
    }

    public Integer getNumeroCama() {
        return NumeroCama;
    }

    public SaveIngresosResource setNumeroCama(Integer numeroCama) {
        NumeroCama = numeroCama;
        return this;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public SaveIngresosResource setObservaciones(String observaciones) {
        Observaciones = observaciones;
        return this;
    }
}
