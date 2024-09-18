package com.nlobo.achoo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    @Value("${api.key}")
    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }
}
