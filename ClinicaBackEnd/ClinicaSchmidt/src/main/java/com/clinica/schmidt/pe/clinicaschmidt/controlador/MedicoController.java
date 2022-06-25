package com.clinica.schmidt.pe.clinicaschmidt.controlador;

import com.clinica.schmidt.pe.clinicaschmidt.entidades.Medicos;
import com.clinica.schmidt.pe.clinicaschmidt.resource.MedicosResource;
import com.clinica.schmidt.pe.clinicaschmidt.resource.SaveMedicoResource;
import com.clinica.schmidt.pe.clinicaschmidt.servicios.MedicoService;
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
public class MedicoController {
    @Autowired
    private MedicoService MedicosService;

    @Autowired
    private ModelMapper mapper;

    @Operation(summary="Post Medicos", description="Create Medicos", tags={"Medicos"})
    @PostMapping("/medicos")
    public MedicosResource createMedicos(@Valid @RequestBody SaveMedicoResource resource) {
        Medicos Medicos = convertToEntity(resource);
        return convertToResource(MedicosService.createMedicos(Medicos));
    }

    @Operation(summary="Get MedicossById", description="Get MedicossById", tags={"Medicos"})
    @GetMapping("/medicos/{MedicosId}")
    public MedicosResource getMedicosById(@PathVariable(name = "MedicosId") Integer MedicosId) {
        return convertToResource(MedicosService.getMedicosById(MedicosId));
    }

    @Operation(summary="Get Medicos", description="Get All Medicos", tags={"Medicos"})
    @GetMapping("/medicos")
    public Page<MedicosResource> getAllMedicos(Pageable pageable){
        Page<Medicos> userPage = MedicosService.AllMedicos(pageable);
        List<MedicosResource> resources = userPage.getContent()
                .stream()
                .map(this::convertToResource)
                .collect(Collectors.toList());

        return new PageImpl<>(resources, pageable, resources.size());
    }

    @Operation(summary="Update Medicos", description="Update Medicos", tags={"Medicos"})
    @PutMapping("/medico/{MedicosId}")
    public MedicosResource updateMedicos(@PathVariable Integer MedicosId, @Valid @RequestBody SaveMedicoResource resource){
        Medicos Medicos = convertToEntity(resource);
        return convertToResource(MedicosService.updateMedicos(MedicosId, Medicos));
    }

    @Operation(summary="Delete Medicos By Id", description="DeleteMedicosById", tags={"Medicos"})
    @DeleteMapping("/medico/{MedicosId}")
    public ResponseEntity<?> deleteMedicos(@PathVariable Integer MedicosId) {
        return MedicosService.deleteMedicos(MedicosId);
    }

    private Medicos convertToEntity(SaveMedicoResource resource) {
        return mapper.map(resource, Medicos.class);
    }
    private MedicosResource convertToResource(Medicos entity)
    {
        return mapper.map(entity, MedicosResource.class);
    }
}
