package com.clinica.schmidt.pe.clinicaschmidt.servicios.Impl;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Pacientes;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.PacientesRepositorio;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacientesRepositorio pacientesRepositorio;

    @Override
    public Page<Pacientes> AllPacientes(Pageable pageable) {
        return pacientesRepositorio.findAll(pageable);
    }

    @Override
    public Pacientes createPacientes(Pacientes Pacientes) {
        return pacientesRepositorio.save(Pacientes);
    }

    @Override
    public Pacientes getPacientesById(Integer id) {
        return pacientesRepositorio.findById(id).get();
    }

    @Override
    public Pacientes updatePacientes(Integer PacientesId, Pacientes PacientesRequest) {
        Pacientes pacientes = pacientesRepositorio.findById(PacientesId).get();
        return pacientesRepositorio.save(
                pacientes.setNombrePaciente(PacientesRequest.getNombrePaciente())
                        .setApellidoPaciente(PacientesRequest.getApellidoPaciente())
                        .setDomicilio(PacientesRequest.getDomicilio())
                        .setProvincia(PacientesRequest.getProvincia())
                        .setDNI(PacientesRequest.getDNI())
                        .setNumeroTelefono(PacientesRequest.getNumeroTelefono())
                        .setFechaNacimiento(PacientesRequest.getFechaNacimiento())
        );
    }

    @Override
    public ResponseEntity<?> deletePacientes(Integer PacientesId) {
        Pacientes pacientes = pacientesRepositorio.findById(PacientesId).get();
        pacientesRepositorio.delete(pacientes);
        return ResponseEntity.ok().build();
    }
}
