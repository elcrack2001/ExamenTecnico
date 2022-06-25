package com.clinica.schmidt.pe.clinicaschmidt.servicios.Impl;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.PatologiaClinica;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.PacientesRepositorio;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.PatologiaClinicaRepository;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.PatologiaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PatologiaClinicaServiceImpl implements PatologiaClinicaService {
    @Autowired
    private PatologiaClinicaRepository patologiaClinicaRepository;

    @Autowired
    private PacientesRepositorio pacientesRepositorio;


    @Override
    public PatologiaClinica createPatologiaClinica(Integer PacienteId, PatologiaClinica PatologiaClinica) {
        return pacientesRepositorio.findById(PacienteId).map(pacientes -> {
            PatologiaClinica.setPacientes(pacientes);
            return patologiaClinicaRepository.save(PatologiaClinica);
        }).orElseThrow();
    }

    @Override
    public Page<PatologiaClinica> AllPatologia(Pageable pageable) {
        return patologiaClinicaRepository.findAll(pageable);
    }

    @Override
    public PatologiaClinica getPatologiaClinicaById(Integer patologiaClinicaId) {
        return patologiaClinicaRepository.findById(patologiaClinicaId).orElseThrow();
    }

    @Override
    public Page<PatologiaClinica> getAllPatologiaClinicaByPacientesId(Integer PacienteId, Pageable pageable) {
        return patologiaClinicaRepository.findByPacientesNumeroHistorialClinico(PacienteId,pageable);
    }

}
