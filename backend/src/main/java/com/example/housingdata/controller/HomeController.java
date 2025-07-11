package com.example.housingdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Housing Data API is running");
        response.put("api-docs", "/api-docs");
        response.put("h2-console", "/h2-console");
        response.put("housing-data", "/api/housing");
        return response;
    }
}
