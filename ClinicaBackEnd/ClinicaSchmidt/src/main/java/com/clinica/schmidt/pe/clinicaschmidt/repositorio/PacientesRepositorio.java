package com.clinica.schmidt.pe.clinicaschmidt.repositorio;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Pacientes;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepositorio extends JpaRepositoryImplementation<Pacientes, Integer> {
}
