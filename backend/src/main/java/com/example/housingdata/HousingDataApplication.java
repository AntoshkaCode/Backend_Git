package com.example.housingdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableJpaRepositories("com.example.housingdata.repository")
@ComponentScan(basePackages = {"com.example.housingdata"})
public class HousingDataApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HousingDataApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HousingDataApplication.class, args);
    }
}
