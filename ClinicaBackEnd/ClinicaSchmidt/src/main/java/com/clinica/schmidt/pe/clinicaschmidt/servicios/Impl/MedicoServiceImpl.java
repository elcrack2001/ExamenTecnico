package com.clinica.schmidt.pe.clinicaschmidt.servicios.Impl;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Medicos;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.MedicosRepositorio;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class MedicoServiceImpl implements MedicoService {
    @Autowired
    private MedicosRepositorio medicosRepositorio;

    @Override
    public Page<Medicos> AllMedicos(Pageable pageable) {
        return medicosRepositorio.findAll(pageable);
    }

    @Override
    public Medicos createMedicos(Medicos Medicos) {
        return medicosRepositorio.save(Medicos);
    }

    @Override
    public Medicos getMedicosById(Integer id) {
        return medicosRepositorio.findById(id).get();
    }

    @Override
    public Medicos updateMedicos(Integer MedicosId, Medicos MedicosRequest) {
        Medicos medicos = medicosRepositorio.findById(MedicosId).get();
        return medicosRepositorio.save(
                medicos.setNombres(MedicosRequest.getNombres())
                        .setApellidos(MedicosRequest.getApellidos())
                        .setDNI(MedicosRequest.getDNI())
                        .setNumeroTelefono(MedicosRequest.getNumeroTelefono())
                        .setNombreEspecialidad(MedicosRequest.getNombreEspecialidad())
                        .setCargo(MedicosRequest.getCargo()));
    }

    @Override
    public ResponseEntity<?> deleteMedicos(Integer MedicosId) {
        Medicos medicos = medicosRepositorio.findById(MedicosId).get();
        medicosRepositorio.delete(medicos);
        return ResponseEntity.ok().build();
    }
}
