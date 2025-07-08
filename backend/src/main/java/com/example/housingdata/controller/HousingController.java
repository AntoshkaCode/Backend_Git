package com.example.housingdata.controller;

import com.example.housingdata.entity.Housing;
import com.example.housingdata.repository.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular app
public class HousingController {

    private final HousingRepository housingRepository;

    @Autowired
    public HousingController(HousingRepository housingRepository) {
        this.housingRepository = housingRepository;
    }

    @GetMapping("/housing")
    public List<Housing> getAllHousing() {
        return housingRepository.findAll();
    }
}
