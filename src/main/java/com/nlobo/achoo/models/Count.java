package com.nlobo.achoo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Count {

    @JsonProperty("grass_pollen")
    private int grassPollen;

    @JsonProperty("tree_pollen")
    private int treePollen;

    @JsonProperty("weed_pollen")
    private int weedPollen;

    public Count() { }
    public Count(int grassPollen, int treePollen, int weedPollen) {
        this.grassPollen = grassPollen;
        this.treePollen = treePollen;
        this.weedPollen = weedPollen;
    }

    public int getGrassPollen() {
        return grassPollen;
    }

    public void setGrassPollen(int grassPollen) {
        this.grassPollen = grassPollen;
    }

    public int getTreePollen() {
        return treePollen;
    }

    public void setTreePollen(int treePollen) {
        this.treePollen = treePollen;
    }

    public int getWeedPollen() {
        return weedPollen;
    }

    public void setWeedPollen(int weedPollen) {
        this.weedPollen = weedPollen;
    }
}
