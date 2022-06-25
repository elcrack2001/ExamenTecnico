package com.clinica.schmidt.pe.clinicaschmidt.repositorio;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Ingresos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IngresosRepositorio extends JpaRepositoryImplementation<Ingresos, Integer> {
    Page<Ingresos> findByPacientesNumeroHistorialClinico(Integer id, Pageable pageable);
    Page<Ingresos> findByMedicosCodigoMedico(Integer id, Pageable pageable);
}
