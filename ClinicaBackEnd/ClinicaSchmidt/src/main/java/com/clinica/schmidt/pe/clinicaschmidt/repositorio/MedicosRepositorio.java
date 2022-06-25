package com.clinica.schmidt.pe.clinicaschmidt.repositorio;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Medicos;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicosRepositorio extends JpaRepositoryImplementation<Medicos, Integer> {
}
