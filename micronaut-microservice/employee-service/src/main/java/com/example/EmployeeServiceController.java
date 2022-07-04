package com.example;

import io.micronaut.http.annotation.*;

@Controller("/employees")
public class EmployeeServiceController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Book Service";
    }
}