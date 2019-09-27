/*
 * 
 */
package com.linepro.yapily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.linepro.marvel.impl.MarvelApiImpl;
import com.linepro.marvel.impl.MarvelConfiguration;
import com.linepro.marvel.impl.MarvelUriBuilderFactory;
import com.linepro.yapily.configuration.SwaggerConfig;
import com.linepro.yapily.controller.CharacterController;

/**
 * The Yapily Application.
 * Fulfils the Marvel test.
 */
@SpringBootConfiguration
@EnableAutoConfiguration
@Import({
    CharacterController.class,
    MarvelApiImpl.class,
    MarvelConfiguration.class,
    MarvelUriBuilderFactory.class,
    SwaggerConfig.class
})
@EnableWebMvc
public class YapilyApplication {

    /**
     * The main method.
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(YapilyApplication.class, args);
    }
}
