package com.clinica.schmidt.pe.clinicaschmidt.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean(name = "ClinicaSchmidtOpenApi")
    public OpenAPI ClinicaSchmidtOpenApi()
    {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title("CLINICA SCHMIDT")
                        .description("Bienvenido a Clinica Schmidt"));
    }
}
