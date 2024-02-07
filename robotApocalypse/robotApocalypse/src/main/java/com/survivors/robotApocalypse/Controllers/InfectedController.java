package com.survivors.robotApocalypse.Controllers;

import com.survivors.robotApocalypse.Entity.Survivors;
import com.survivors.robotApocalypse.services.InfectedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/infected")
public class InfectedController {

    private final InfectedService infectedService;

    @Autowired
    public InfectedController(InfectedService infectedService) {
        this.infectedService = infectedService;
    }

    @GetMapping("/reports/infected-percentage")
    public ResponseEntity<Double> getInfectedPercentage() {
        double infectedPercentage = infectedService.getPercentageInfectedSurvivors();
        return new ResponseEntity<>(infectedPercentage, HttpStatus.OK);
    }

    @GetMapping("/infected")
    public ResponseEntity<List<Survivors>> getInfectedSurvivors() {
        List<Survivors> infected = infectedService.getSurvivorsByInfectionStatus(true);
        return ResponseEntity.ok(infected);
    }

    @GetMapping("/disinfected")
    public ResponseEntity<List<Survivors>> getDisinfectedSurvivors() {
        List<Survivors> disinfectedSurvivors = infectedService.getSurvivorsByInfectionStatus(false);
        return ResponseEntity.ok(disinfectedSurvivors);
    }


    @GetMapping("/disinfected-percentage")
    public ResponseEntity<Double> getPercentageDisinfectedSurvivors() {
        double disinfectedPercentage = infectedService.getPercentageDisinfectedSurvivors();
        return ResponseEntity.ok(disinfectedPercentage);
    }
}
