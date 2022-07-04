package com.example;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "employee-service",
                version = "0.0"
        )
)
public class EmployeeServiceApplication {
    public static void main(String[] args) {
        Micronaut.run(EmployeeServiceApplication.class, args);
    }
}
