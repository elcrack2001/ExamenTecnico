package com.clinica.schmidt.pe.clinicaschmidt.entidades;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ingresos")
public class Ingresos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingresos_id", nullable = false)
    private Integer ingresosId;

    @Column(name = "fecha_ingreso")
    private LocalDate FechaIngreso;

    @Column(name = "condicion")
    private String Condicion;

    @Column(name = "numero_cama")
    private Integer NumeroCama;

    @Column(name = "observaciones")
    private String Observaciones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_pacientes_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Pacientes pacientes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "fk_medicos_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Medicos medicos;

    public Ingresos(Integer ingresosId, LocalDate fechaIngreso, String condicion, Integer numeroCama, String observaciones, Pacientes pacientes, Medicos medicos) {
        this.ingresosId = ingresosId;
        FechaIngreso = fechaIngreso;
        Condicion = condicion;
        NumeroCama = numeroCama;
        Observaciones = observaciones;
        this.pacientes = pacientes;
        this.medicos = medicos;
    }

    public Ingresos() {

    }

    public Integer getIngresosId() {
        return ingresosId;
    }

    public void setIngresosId(Integer ingresosId) {
        this.ingresosId = ingresosId;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }

    public Ingresos setFechaIngreso(LocalDate fechaIngreso) {
        FechaIngreso = fechaIngreso;
        return this;
    }

    public String getCondicion() {
        return Condicion;
    }

    public Ingresos setCondicion(String condicion) {
        Condicion = condicion;
        return this;
    }

    public Integer getNumeroCama() {
        return NumeroCama;
    }

    public Ingresos setNumeroCama(Integer numeroCama) {
        NumeroCama = numeroCama;
        return this;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public Ingresos setObservaciones(String observaciones) {
        Observaciones = observaciones;
        return this;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public Ingresos setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
        return this;
    }

    public Medicos getMedicos() {
        return medicos;
    }

    public Ingresos setMedicos(Medicos medicos) {
        this.medicos = medicos;
        return this;
    }
}
