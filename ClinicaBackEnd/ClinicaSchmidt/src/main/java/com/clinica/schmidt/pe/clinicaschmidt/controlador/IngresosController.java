package com.clinica.schmidt.pe.clinicaschmidt.controlador;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Ingresos;
import com.clinica.schmidt.pe.clinicaschmidt.resource.IngresosResource;
import com.clinica.schmidt.pe.clinicaschmidt.resource.SaveIngresosResource;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.IngresosService;
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
public class IngresosController {
    @Autowired
    private IngresosService ingresosService;

    @Autowired
    private ModelMapper mapper;

    @Operation(summary="Create Ingresos", description="Create Ingresos", tags={"ingresos"})
    @PostMapping("/pacientes/{pacientesId}/medicos/{medicosId}/ingresos")
    public IngresosResource createIngresos(
            @PathVariable Integer pacientesId,
            @PathVariable Integer medicosId,
            @Valid @RequestBody SaveIngresosResource resource) {
        return convertToResource(ingresosService.createIngresos(pacientesId,medicosId,convertToEntity(resource)));
    }

    @Operation(summary="Get All Ingresos", description="Get All Ingresos", tags={"ingresos"})
    @GetMapping("/ingresos")
    public Page<IngresosResource> getAllIngresos(Pageable pageable){
        Page<Ingresos> userPage = ingresosService.AllIngresos(pageable);
        List<IngresosResource> resources = userPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());

        return new PageImpl<>(resources, pageable, resources.size());
    }

    @Operation(summary="Get Ingresos by Id", description="Get Ingresos by Id", tags={"ingresos"})
    @GetMapping("/ingresos/{ingresosId}")
    public IngresosResource getIngresosById(
            @PathVariable Integer ingresosId) {
        return convertToResource(ingresosService.getIngresosById(ingresosId));
    }

    @Operation(summary="Get Ingresos", description="Get Ingresos by Paciente Id", tags={"ingresos"})
    @GetMapping("/pacientes/{pacienteId}/ingresos")
    public Page<IngresosResource> getAllIngresosByPacienteId(@PathVariable Integer pacienteId, Pageable pageable) {
        Page<Ingresos> postulantJobPage = ingresosService.getAllIngresosByPacientesId(pacienteId, pageable);
        List<IngresosResource> resources = postulantJobPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());
        return new PageImpl<>(resources, pageable, resources.size());
    }

    @Operation(summary="Get Ingresos", description="Get Ingresos by Medicos Id", tags={"ingresos"})
    @GetMapping("/medicos/{medicosId}/ingresos")
    public Page<IngresosResource> getAllIngresosByMedicosId(@PathVariable Integer medicosId, Pageable pageable) {
        Page<Ingresos> postulantJobPage = ingresosService.getAllIngresosByMedicosId(medicosId, pageable);
        List<IngresosResource> resources = postulantJobPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());
        return new PageImpl<>(resources, pageable, resources.size());
    }

    private Ingresos convertToEntity(SaveIngresosResource resource) {
        return mapper.map(resource, Ingresos.class);
    }
    private IngresosResource convertToResource(Ingresos entity)
    {
        return mapper.map(entity, IngresosResource.class);
    }
}
