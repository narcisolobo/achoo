package com.nlobo.achoo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    @JsonProperty("Count")
    private Count count;

    @JsonProperty("Risk")
    private Risk risk;

    @JsonProperty("updatedAt")
    private String updatedAt;

    public Data() { }
    public Data(Count count, Risk risk, String updatedAt) {
        this.count = count;
        this.risk = risk;
        this.updatedAt = updatedAt;
    }

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
