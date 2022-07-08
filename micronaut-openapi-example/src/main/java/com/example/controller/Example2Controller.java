package com.example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/Example2")
@Tag(name = "Example 2")
public class Example2Controller {
    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response 2";
    }

    @Get(uri = "/a", produces = "text/plain")
    public String index2() {
        return "Example Response 2";
    }

    @Get(uri = "/b", produces = "text/plain")
    public String index3() {
        return "Example Response 2";
    }
}
