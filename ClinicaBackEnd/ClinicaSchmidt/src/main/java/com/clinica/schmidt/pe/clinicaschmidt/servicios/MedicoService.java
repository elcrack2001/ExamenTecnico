package com.clinica.schmidt.pe.clinicaschmidt.servicios;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Medicos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface MedicoService {
    public Page<Medicos> AllMedicos(Pageable pageable);
    public Medicos createMedicos(Medicos Medicos);
    Medicos getMedicosById(Integer id);
    Medicos updateMedicos(Integer MedicosId, Medicos MedicosRequest);
    ResponseEntity<?> deleteMedicos(Integer MedicosId);
}
