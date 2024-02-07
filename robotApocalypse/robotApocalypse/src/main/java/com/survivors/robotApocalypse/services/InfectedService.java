package com.survivors.robotApocalypse.services;

import com.survivors.robotApocalypse.Entity.Survivors;
import com.survivors.robotApocalypse.Repository.SurvivorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfectedService {

    private final SurvivorRepository survivorRepository;


    public InfectedService(SurvivorRepository survivorRepository) {
        this.survivorRepository = survivorRepository;
    }

    public double getPercentageInfectedSurvivors() {
        long totalSurvivors = survivorRepository.count();
        long infected = survivorRepository.countByInfected(true);
        return (double) infected / totalSurvivors * 100;
    }

    public double getPercentageDisinfectedSurvivors() {
        return 100 - getPercentageInfectedSurvivors();
    }

    public List<Survivors> getSurvivorsByInfectionStatus(boolean infected) {
        return survivorRepository.findByInfected(infected);
    }
}
