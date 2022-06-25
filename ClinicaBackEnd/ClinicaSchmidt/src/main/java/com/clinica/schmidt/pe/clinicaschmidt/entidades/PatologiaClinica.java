package com.clinica.schmidt.pe.clinicaschmidt.entidades;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "patologia_clinica" )
public class PatologiaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "examen_id", nullable = false)
    private Integer examenId;

    @Column(name = "nombre_examen")
    private String NombreExamen;

    @Column(name = "resultado")
    private String Restultado;

    @Column(name = "fecha_examen")
    private LocalDate FechaExamen;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_pacientes_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pacientes pacientes;

    public PatologiaClinica(Integer examenId, String nombreExamen, String restultado, LocalDate fechaExamen, Pacientes pacientes) {
        this.examenId = examenId;
        NombreExamen = nombreExamen;
        Restultado = restultado;
        FechaExamen = fechaExamen;
        this.pacientes = pacientes;
    }

    public PatologiaClinica() {

    }

    public Integer getExamenId() {
        return examenId;
    }

    public PatologiaClinica setExamenId(Integer examenId) {
        this.examenId = examenId;
        return this;
    }

    public String getNombreExamen() {
        return NombreExamen;
    }

    public PatologiaClinica setNombreExamen(String nombreExamen) {
        NombreExamen = nombreExamen;
        return this;
    }

    public String getRestultado() {
        return Restultado;
    }

    public PatologiaClinica setRestultado(String restultado) {
        Restultado = restultado;
        return this;
    }

    public LocalDate getFechaExamen() {
        return FechaExamen;
    }

    public PatologiaClinica setFechaExamen(LocalDate fechaExamen) {
        FechaExamen = fechaExamen;
        return this;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public PatologiaClinica setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
        return this;
    }
}
