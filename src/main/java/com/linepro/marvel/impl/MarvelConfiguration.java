/*
 * 
 */
package com.linepro.marvel.impl;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Creates the configuration for the Marvel API.
 */
@Configuration
public class MarvelConfiguration {

    /**
     * Gets the rest template for accessing the Marvel Database.
     * @param restTemplateBuilder the rest template builder
     * @param uriBuilderFactory the uri builder factory
     * @return the rest template
     */
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder, MarvelUriBuilderFactory uriBuilderFactory) {
        return restTemplateBuilder.uriTemplateHandler(uriBuilderFactory).build();
    }
}
