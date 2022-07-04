package com.example;

import io.micronaut.runtime.Micronaut;
import static io.micronaut.context.env.Environment.DEVELOPMENT;

public class BookCatalogueApplication {
    public static void main(String[] args) {
        Micronaut.build(args)
                .mainClass(BookCatalogueApplication.class)
                .defaultEnvironments(DEVELOPMENT)
                .start();
    }
}
