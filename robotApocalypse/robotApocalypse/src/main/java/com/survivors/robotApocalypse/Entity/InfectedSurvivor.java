package com.survivors.robotApocalypse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InfectedSurvivor {

    private double percentageInfectedSurvivors;
    private double percentageDisinfectedSurvivors;
    private int infectedSurvivors;
    //private boolean infected;
    @Id
    private Long id;


    // Getter and Setter methods

    public double getPercentageInfectedSurvivors() {
        return percentageInfectedSurvivors;
    }

    public void setPercentageInfectedSurvivors(double percentageInfectedSurvivors) {
        this.percentageInfectedSurvivors = percentageInfectedSurvivors;
    }

    public double getPercentageDisinfectedSurvivors() {
        return percentageDisinfectedSurvivors;
    }

    public void setPercentageDisinfectedSurvivors(double percentageDisinfectedSurvivors) {
        this.percentageDisinfectedSurvivors = percentageDisinfectedSurvivors;
    }

    public int getInfectedSurvivor() {
        return infectedSurvivors;
    }

    public void setInfectedSurvivor(int infectedSurvivor) {
        this.infectedSurvivors = infectedSurvivor;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


}

