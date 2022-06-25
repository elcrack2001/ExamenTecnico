package com.clinica.schmidt.pe.clinicaschmidt.servicios.Impl;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Ingresos;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.IngresosRepositorio;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.MedicosRepositorio;
import com.clinica.schmidt.pe.clinicaschmidt.repositorio.PacientesRepositorio;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.IngresosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IngresosServiceImpl implements IngresosService {
    @Autowired
    private PacientesRepositorio pacientesRepositorio;

    @Autowired
    private MedicosRepositorio medicosRepositorio;

    @Autowired
    private IngresosRepositorio ingresosRepositorio;

    @Override
    public Ingresos createIngresos(Integer pacienteId, Integer MedicosId, Ingresos ingresos) {
        return pacientesRepositorio.findById(pacienteId).map(pacientes -> {
            ingresos.setPacientes(pacientes);
            //Medicos
            medicosRepositorio.findById(MedicosId).map(medicos -> {
                ingresos.setMedicos(medicos);
                return ingresosRepositorio.save(ingresos);
            }).orElseThrow();
            return ingresosRepositorio.save(ingresos);
        }).orElseThrow();
    }

    @Override
    public Page<Ingresos> AllIngresos(Pageable pageable) {
        return ingresosRepositorio.findAll(pageable);
    }

    @Override
    public Ingresos getIngresosById(Integer IngresosId) {
        return ingresosRepositorio.findById(IngresosId).orElseThrow();
    }

    @Override
    public Page<Ingresos> getAllIngresosByPacientesId(Integer PacienteId, Pageable pageable) {
        return ingresosRepositorio.findByPacientesNumeroHistorialClinico(PacienteId, pageable);
    }

    @Override
    public Page<Ingresos> getAllIngresosByMedicosId(Integer MedicosId, Pageable pageable) {
        return ingresosRepositorio.findByMedicosCodigoMedico(MedicosId, pageable);
    }
}
