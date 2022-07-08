package com.example;

import com.example.util.CombineYamlFile;
import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "micronaut-openapi-example",
                version = "0.0"
        )
)
public class OpenApiExampleApplication {
    public static void main(String[] args) {
        CombineYamlFile.readSwagger();
        Micronaut.run(OpenApiExampleApplication.class, args);
    }
}
