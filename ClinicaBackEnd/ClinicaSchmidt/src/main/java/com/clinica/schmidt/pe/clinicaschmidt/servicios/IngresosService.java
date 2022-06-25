package com.clinica.schmidt.pe.clinicaschmidt.servicios;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Ingresos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IngresosService {
    Ingresos createIngresos(Integer pacienteId, Integer MedicosId, Ingresos ingresos);
    public Page<Ingresos> AllIngresos(Pageable pageable);
    Ingresos getIngresosById(Integer IngresosId);
    Page<Ingresos> getAllIngresosByPacientesId(Integer PacienteId, Pageable pageable);
    Page<Ingresos> getAllIngresosByMedicosId(Integer MedicosId, Pageable pageable);
}
