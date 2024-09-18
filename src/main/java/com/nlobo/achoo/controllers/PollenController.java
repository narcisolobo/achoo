package com.nlobo.achoo.controllers;

import com.nlobo.achoo.services.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PollenController {

    private final ApiService apiService;

    public PollenController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String index(Model model) {
        String apiKey = apiService.getApiKey();
        model.addAttribute("apiKey", apiKey);
        return "index.jsp";
    }
}
