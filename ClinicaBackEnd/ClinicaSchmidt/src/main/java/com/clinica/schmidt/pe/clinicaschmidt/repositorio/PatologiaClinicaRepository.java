package com.clinica.schmidt.pe.clinicaschmidt.repositorio;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.PatologiaClinica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface PatologiaClinicaRepository extends JpaRepositoryImplementation<PatologiaClinica, Integer> {
    Page<PatologiaClinica> findByPacientesNumeroHistorialClinico(Integer id, Pageable pageable);
}
