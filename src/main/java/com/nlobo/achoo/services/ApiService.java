package com.nlobo.achoo.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nlobo.achoo.models.ApiResponse;
import com.nlobo.achoo.models.Location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpHeaders;

@Service
public class ApiService {
    private final RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ApiResponse getApiResponse(Location location) throws Exception {
        HttpHeaders headers = new org.springframework.http.HttpHeaders();
        headers.set("x-api-key", apiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        String baseUrl = "https://api.ambeedata.com/latest/pollen/by-lat-lng";
        String endpoint = String.format("%s?lat=%f&lng=%f", baseUrl, location.getLatitude(), location.getLongitude());

        ResponseEntity<String> response = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class);

        String jsonResponse = response.getBody();
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(jsonResponse, ApiResponse.class);
    }

    public String getApiKey() {
        return apiKey;
    }
}
