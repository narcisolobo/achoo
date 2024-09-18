package com.nlobo.achoo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Risk {

    @JsonProperty("grass_pollen")
    private String grassPollen;

    @JsonProperty("weed_pollen")
    private String weedPollen;

    @JsonProperty("tree_pollen")
    private String treePollen;

    public Risk() { }
    public Risk(String grassPollen, String weedPollen, String treePollen) {
        this.grassPollen = grassPollen;
        this.weedPollen = weedPollen;
        this.treePollen = treePollen;
    }

    public String getGrassPollen() {
        return grassPollen;
    }

    public void setGrassPollen(String grassPollen) {
        this.grassPollen = grassPollen;
    }

    public String getWeedPollen() {
        return weedPollen;
    }

    public void setWeedPollen(String weedPollen) {
        this.weedPollen = weedPollen;
    }

    public String getTreePollen() {
        return treePollen;
    }

    public void setTreePollen(String treePollen) {
        this.treePollen = treePollen;
    }
}
