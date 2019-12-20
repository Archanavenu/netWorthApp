package com.archana.demospringboot16thdec.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
@Configuration
@PropertySource("classpath:application.yml")
public class MYSQLdatasource {
    @Value("${spring.datasource.url}")
    private String dataUrl;
    @Value("${spring.datasource.username}")
    private String user;
    @Value("${spring.datasource.password}")
    private String password;

    // creating datasource bean which creates a datasource builder and adding the sources
    @Bean
    DataSource dataSource(){
        return DataSourceBuilder.create()
                .url(dataUrl)
                .username(user)
                .password(password)
                .build();
    }
}
