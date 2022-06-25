package com.clinica.schmidt.pe.clinicaschmidt.entidades;

import javax.persistence.*;

@Entity
@Table(name = "medicos")
public class Medicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_medico", nullable = false)
    private Integer codigoMedico;

    @Column(name = "Nombres")
    private String nombres;

    @Column(name = "Apellidos")
    private String apellidos;

    @Column(name = "DNI", unique = true)
    private Integer DNI;

    @Column(name = "NumeroTelefono", unique = true)
    private Integer numeroTelefono;

    @Column(name = "NombreEspecialidad")
    private String nombreEspecialidad;

    @Column(name = "Cargo")
    private String cargo;

    public Medicos(Integer codigoMedico, String nombres, String apellidos, Integer DNI, Integer numeroTelefono, String nombreEspecialidad, String cargo) {
        this.codigoMedico = codigoMedico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.numeroTelefono = numeroTelefono;
        this.nombreEspecialidad = nombreEspecialidad;
        this.cargo = cargo;
    }

    public Medicos() {

    }

    public Integer getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(Integer codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public String getNombres() {
        return nombres;
    }

    public Medicos setNombres(String nombres) {
        this.nombres = nombres;
        return this;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Medicos setApellidos(String apellidos) {
        this.apellidos = apellidos;
        return this;
    }

    public Integer getDNI() {
        return DNI;
    }

    public Medicos setDNI(Integer DNI) {
        this.DNI = DNI;
        return this;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public Medicos setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public Medicos setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public Medicos setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }
}
