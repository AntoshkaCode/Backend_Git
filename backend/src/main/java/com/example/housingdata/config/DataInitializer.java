package com.example.housingdata.config;

import com.example.housingdata.entity.Housing;
import com.example.housingdata.repository.HousingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataInitializer {

    @Bean
    @Profile("h2")
    public CommandLineRunner initDatabase(HousingRepository repository) {
        return args -> {
            // Clear existing data
            repository.deleteAll();
            
            // Add sample housing data
            repository.save(createHousing("123 Main St", 2.5, 3, 300000.0, 1800, "Single Family"));
            repository.save(createHousing("456 Oak Ave", 2.0, 2, 250000.0, 1500, "Condo"));
            repository.save(createHousing("789 Pine Rd", 3.5, 4, 450000.0, 2200, "Single Family"));
            repository.save(createHousing("101 Elm St", 1.0, 1, 180000.0, 900, "Apartment"));
            repository.save(createHousing("202 Maple Dr", 2.0, 3, 320000.0, 1600, "Townhouse"));
            
            System.out.println("Initialized database with sample housing data");
        };
    }
    
    private Housing createHousing(String address, double bathrooms, int bedrooms, 
                                double price, int squareFeet, String type) {
        Housing housing = new Housing();
        housing.setAddress(address);
        housing.setBathrooms(bathrooms);
        housing.setBedrooms(bedrooms);
        housing.setPrice(price);
        housing.setSquareFeet(squareFeet);
        housing.setType(type);
        return housing;
    }
}
