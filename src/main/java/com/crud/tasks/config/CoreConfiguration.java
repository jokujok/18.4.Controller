package com.crud.tasks.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class CoreConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
/*
    @Bean
    public GroupedOpenApi groupedOpenApi() {
        String pathsToMatch[] = {"/v1/tasks"};
        return GroupedOpenApi.builder()
                .group("tasks")
                .pathsToMatch(pathsToMatch)
                .build();
    }
*/

    @Bean
    public GroupedOpenApi groupOpenApi() {
        String paths[] = {"/v1/tasks"};
        String packagesToscan[] = {"com.crud.tasks.controller"};
        return GroupedOpenApi.builder()
                .group("")
                .pathsToMatch(paths)
                .packagesToScan(packagesToscan)
                .build();
    }
}
