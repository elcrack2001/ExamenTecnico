package com.clinica.schmidt.pe.clinicaschmidt.servicios;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Pacientes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface PacienteService {
    public Page<Pacientes> AllPacientes(Pageable pageable);
    public Pacientes createPacientes(Pacientes Pacientes);
    Pacientes getPacientesById(Integer id);
    Pacientes updatePacientes(Integer PacientesId, Pacientes PacientesRequest);
    ResponseEntity<?> deletePacientes(Integer PacientesId);
}
