package com.clinica.schmidt.pe.clinicaschmidt.controlador;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Medicos;
import com.clinica.schmidt.pe.clinicaschmidt.entidades.PatologiaClinica;
import com.clinica.schmidt.pe.clinicaschmidt.resource.MedicosResource;
import com.clinica.schmidt.pe.clinicaschmidt.resource.PatologiaClinicaResource;
import com.clinica.schmidt.pe.clinicaschmidt.resource.SavePatologiaClinicaResource;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.PatologiaClinicaService;
import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class PatologiaClinicaController {
    @Autowired
    private PatologiaClinicaService PatologiaClinicasService;

    @Autowired
    private ModelMapper mapper;

    @Operation(summary="Post Patologia Clinicas", description="Create Patologia Clinicas", tags={"PatologiaClinicas"})
    @PostMapping("/pacientes/{pacienteId}/patologia")
    public PatologiaClinicaResource createPatologiaClinicas(
            @PathVariable Integer pacienteId,
            @Valid @RequestBody SavePatologiaClinicaResource resource) {
        PatologiaClinica PatologiaClinicas = convertToEntity(resource);
        return convertToResource(PatologiaClinicasService.createPatologiaClinica(pacienteId, PatologiaClinicas));
    }

    @Operation(summary="Get All Patologia Clinicas", description="Get All Patologia Clinicas", tags={"PatologiaClinicas"})
    @GetMapping("/patologia")
    public Page<PatologiaClinicaResource> getAllPatologia(Pageable pageable){
        Page<PatologiaClinica> userPage = PatologiaClinicasService.AllPatologia(pageable);
        List<PatologiaClinicaResource> resources = userPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());

        return new PageImpl<>(resources, pageable, resources.size());
    }

    @Operation(summary="Get Patologia Clinicas by Id", description="Get Patologia Clinicas by Id", tags={"PatologiaClinicas"})
    @GetMapping("/patologia/{patologiaId}")
    public PatologiaClinicaResource getPatologiaClinicaById(
            @PathVariable Integer patologiaId) {
        return convertToResource(PatologiaClinicasService.getPatologiaClinicaById(patologiaId));
    }

    @Operation(summary="Get Patologia Clinicas", description="Get all Patologia Clinicas by Paciente Id", tags={"PatologiaClinicas"})
    @GetMapping("/pacientes/{pacienteId}/patologia")
    public Page<PatologiaClinicaResource> getAllPatologiaClinicaByPacienteId(@PathVariable Integer pacienteId, Pageable pageable) {
        Page<PatologiaClinica> postulantJobPage = PatologiaClinicasService.getAllPatologiaClinicaByPacientesId(pacienteId, pageable);
        List<PatologiaClinicaResource> resources = postulantJobPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());
        return new PageImpl<>(resources, pageable, resources.size());
    }

    private PatologiaClinica convertToEntity(SavePatologiaClinicaResource resource) {
        return mapper.map(resource, PatologiaClinica.class);
    }
    private PatologiaClinicaResource convertToResource(PatologiaClinica entity)
    {
        return mapper.map(entity, PatologiaClinicaResource.class);
    }
}
