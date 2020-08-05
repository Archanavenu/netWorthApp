package com.archana.demospringboot16thdec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Demospringboot16thdecApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demospringboot16thdecApplication.class, args);
    }
    @Bean
    public org.springframework.web.servlet.config.annotation.WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/netWorth").allowedOrigins("http://localhost:3000");
                registry.addMapping("/getTotal").allowedOrigins("http://localhost:3000");

            }
        };
    }

}


