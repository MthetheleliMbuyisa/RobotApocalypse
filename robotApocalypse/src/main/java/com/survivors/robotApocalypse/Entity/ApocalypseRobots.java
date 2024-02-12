package com.survivors.robotApocalypse.Entity;

public class ApocalypseRobots {
    private String model;
    private String category;

    public ApocalypseRobots(){

    }

    public ApocalypseRobots(String model, String category) {
        this.model = model;
        this.category = category;
    }
    //Setters and Getters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
