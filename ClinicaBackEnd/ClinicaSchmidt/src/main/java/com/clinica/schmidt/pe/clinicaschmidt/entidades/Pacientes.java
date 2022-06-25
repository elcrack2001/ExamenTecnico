package com.clinica.schmidt.pe.clinicaschmidt.entidades;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pacientes")
public class Pacientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_historial_clinico", nullable = false)
    private Integer numeroHistorialClinico;

    @Column(name = "NombrePaciente")
    private String nombrePaciente;

    @Column(name = "ApellidoPaciente")
    private String apellidoPaciente;

    @Column(name = "Domicilio")
    private String domicilio;

    @Column(name = "Provincia")
    private String provincia;

    @Column(name = "DNI", unique = true)
    private Integer DNI;

    @Column(name = "NumeroTelefono", unique = true)
    private Integer numeroTelefono;

    @Column(name = "FechaNacimiento")
    private LocalDate fechaNacimiento;

    public Pacientes(Integer numeroHistorialClinico, String nombrePaciente, String apellidoPaciente, String domicilio, String provincia, Integer DNI, Integer numeroTelefono, LocalDate fechaNacimiento) {
        this.numeroHistorialClinico = numeroHistorialClinico;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.domicilio = domicilio;
        this.provincia = provincia;
        this.DNI = DNI;
        this.numeroTelefono = numeroTelefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pacientes() {

    }

    public Integer getNumeroHistorialClinico() {
        return numeroHistorialClinico;
    }

    public Pacientes setNumeroHistorialClinico(Integer numeroHistorialClinico) {
        this.numeroHistorialClinico = numeroHistorialClinico;
        return this;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public Pacientes setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
        return this;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public Pacientes setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
        return this;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public Pacientes setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        return this;
    }

    public String getProvincia() {
        return provincia;
    }

    public Pacientes setProvincia(String provincia) {
        this.provincia = provincia;
        return this;
    }

    public Integer getDNI() {
        return DNI;
    }

    public Pacientes setDNI(Integer DNI) {
        this.DNI = DNI;
        return this;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public Pacientes setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        return this;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Pacientes setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }
}
