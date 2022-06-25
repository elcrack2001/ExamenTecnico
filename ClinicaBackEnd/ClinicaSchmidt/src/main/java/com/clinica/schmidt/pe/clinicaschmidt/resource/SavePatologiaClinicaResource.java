package com.clinica.schmidt.pe.clinicaschmidt.resource;

import java.time.LocalDate;

public class SavePatologiaClinicaResource {
    private String NombreExamen;
    private String Restultado;
    private LocalDate FechaExamen;

    public SavePatologiaClinicaResource(String nombreExamen, String restultado, LocalDate fechaExamen) {
        NombreExamen = nombreExamen;
        Restultado = restultado;
        FechaExamen = fechaExamen;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public SavePatologiaClinicaResource setNombreExamen(String nombreExamen) {
        NombreExamen = nombreExamen;
        return this;
    }

    public String getRestultado() {
        return Restultado;
    }

    public SavePatologiaClinicaResource setRestultado(String restultado) {
        Restultado = restultado;
        return this;
    }

    public LocalDate getFechaExamen() {
        return FechaExamen;
    }

    public SavePatologiaClinicaResource setFechaExamen(LocalDate fechaExamen) {
        FechaExamen = fechaExamen;
        return this;
    }
}
