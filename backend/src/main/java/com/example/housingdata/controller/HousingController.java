package com.example.housingdata.controller;

import com.example.housingdata.entity.Housing;
import com.example.housingdata.repository.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/housing")
@CrossOrigin(origins = "*")
public class HousingController {

    private final HousingRepository housingRepository;

    @Autowired
    public HousingController(HousingRepository housingRepository) {
        this.housingRepository = housingRepository;
    }

    @GetMapping("")
    public ResponseEntity<List<Housing>> getAllHousing() {
        return ResponseEntity.ok(housingRepository.findAll());
    }
}
