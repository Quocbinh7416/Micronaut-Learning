package com.example.controller;

import io.micronaut.http.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/Example1")
@Tag(name = "Example 1")
public class ExampleController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response";
    }
}