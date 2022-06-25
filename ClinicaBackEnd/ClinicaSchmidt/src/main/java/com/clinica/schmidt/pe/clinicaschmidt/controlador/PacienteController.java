package com.clinica.schmidt.pe.clinicaschmidt.controlador;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Pacientes;
import com.clinica.schmidt.pe.clinicaschmidt.resource.PacientesResource;
import com.clinica.schmidt.pe.clinicaschmidt.resource.SavePacientesResource;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.PacienteService;
import io.swagger.v3.oas.annotations.Operation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class PacienteController {
    @Autowired
    private PacienteService PacientesService;

    @Autowired
    private ModelMapper mapper;

    @Operation(summary="Post Pacientes", description="Create Pacientes", tags={"Pacientes"})
    @PostMapping("/pacientes")
    public PacientesResource createPacientes(@Valid @RequestBody SavePacientesResource resource) {
        Pacientes Pacientes = convertToEntity(resource);
        return convertToResource(PacientesService.createPacientes(Pacientes));
    }

    @Operation(summary="Get PacientessById", description="Get PacientessById", tags={"Pacientes"})
    @GetMapping("/pacientes/{PacientesId}")
    public PacientesResource getPacientesById(@PathVariable(name = "PacientesId") Integer PacientesId) {
        return convertToResource(PacientesService.getPacientesById(PacientesId));
    }

    @Operation(summary="Get Pacientes", description="Get All Pacientes", tags={"Pacientes"})
    @GetMapping("/pacientes")
    public Page<PacientesResource> getAllPacientes(Pageable pageable){
        Page<Pacientes> userPage = PacientesService.AllPacientes(pageable);
        List<PacientesResource> resources = userPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());

        return new PageImpl<>(resources, pageable, resources.size());
    }

    @Operation(summary="Update Pacientes", description="Update Pacientes", tags={"Pacientes"})
    @PutMapping("/pacientes/{PacientesId}")
    public PacientesResource updatePacientes(@PathVariable Integer PacientesId, @Valid @RequestBody SavePacientesResource resource){
        Pacientes Pacientes = convertToEntity(resource);
        return convertToResource(PacientesService.updatePacientes(PacientesId, Pacientes));
    }

    @Operation(summary="Delete Pacientes By Id", description="DeletePacientesById", tags={"Pacientes"})
    @DeleteMapping("/pacientes/{PacientesId}")
    public ResponseEntity<?> deletePacientes(@PathVariable Integer PacientesId) {
        return PacientesService.deletePacientes(PacientesId);
    }

    private Pacientes convertToEntity(SavePacientesResource resource) {
        return mapper.map(resource, Pacientes.class);
    }
    private PacientesResource convertToResource(Pacientes entity)
    {
        return mapper.map(entity, PacientesResource.class);
    }
}
