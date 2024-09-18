package com.nlobo.achoo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApiResponse {

    @JsonProperty("message")
    private String message;

    @JsonProperty("lat")
    private double lat;

    @JsonProperty("lng")
    private double lng;

    @JsonProperty("data")
    private List<Data> data;

    public ApiResponse() { }
    public ApiResponse(String message, double lat, double lng, List<Data> data) {
        this.message = message;
        this.lat = lat;
        this.lng = lng;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
