package com.example.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.SwaggerParseResult;

import java.io.File;
import java.io.IOException;

public class CombineYamlFile {

    public static void doCombineYamlFile() {
        String url ="micronaut-openapi-example\\src\\main\\resources\\services\\micronaut-openapi-example-0.0.yml";
        SwaggerParseResult result = new OpenAPIV3Parser().readLocation(url, null, null);

        System.out.println();
    }

    public static void readSwagger() {
        String sourceUrl ="micronaut-openapi-example\\src\\main\\resources\\services\\master-service-0.0.yml";
        String desUrl ="micronaut-openapi-example\\src\\main\\resources\\services\\micronaut-openapi-example-0.0.yml";

        SwaggerParseResult source = new OpenAPIV3Parser().readLocation(sourceUrl, null, null);
        SwaggerParseResult result = new OpenAPIV3Parser().readLocation(desUrl, null, null);

        OpenAPI sourceOpenAPI = source.getOpenAPI();
        OpenAPI resultOpenAPI = result.getOpenAPI();

        Paths sourcePaths = sourceOpenAPI.getPaths();
        Paths resultPaths = sourceOpenAPI.getPaths();


        resultOpenAPI.paths(sourceOpenAPI.getPaths());

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        try {
            objectMapper.writeValue(new File("micronaut-openapi-example\\src\\main\\resources\\services\\micronaut-openapi-example-0.1.yml"),resultOpenAPI);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
