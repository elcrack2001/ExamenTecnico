package com.clinica.schmidt.pe.clinicaschmidt.servicios;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.PatologiaClinica;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatologiaClinicaService {
    public PatologiaClinica createPatologiaClinica(Integer PacienteId, PatologiaClinica PatologiaClinica);
    public Page<PatologiaClinica> AllPatologia(Pageable pageable);
    PatologiaClinica getPatologiaClinicaById(Integer patologiaClinicaId);
    Page<PatologiaClinica> getAllPatologiaClinicaByPacientesId(Integer PacienteId, Pageable pageable);
}
