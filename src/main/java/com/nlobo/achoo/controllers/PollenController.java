package com.nlobo.achoo.controllers;

import com.nlobo.achoo.models.ApiResponse;
import com.nlobo.achoo.models.Location;
import com.nlobo.achoo.services.ApiService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PollenController {

    private final ApiService apiService;

    public PollenController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String index(HttpSession session, Model model) throws Exception {
        if (session.getAttribute("lat") == null) {
            session.setAttribute("lat", 41.8781);
        }

        if (session.getAttribute("lng") == null) {
            session.setAttribute("lng", -87.6298);
        }

        double lat = (double) session.getAttribute("lat");
        double lng = (double) session.getAttribute("lng");

        Location location = new Location(lat, lng);

        ApiResponse response = apiService.getApiResponse(location);
        model.addAttribute("response", response);
        return "index.jsp";
    }

    @PostMapping("/set-location")
    public String setLocation(HttpSession session, @RequestBody Location location) throws Exception {
        session.setAttribute("lat", location.getLatitude());
        session.setAttribute("lng", location.getLongitude());
        return "redirect:/";
    }
}
