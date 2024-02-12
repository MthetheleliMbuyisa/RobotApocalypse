package com.survivors.robotApocalypse.Controllers;

import com.survivors.robotApocalypse.Entity.Survivors;
import com.survivors.robotApocalypse.services.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/survivors")
public class SurvivorControllers {

    private final SurvivorService survivorService;

    @Autowired
    public SurvivorControllers(SurvivorService survivorService) {
        this.survivorService = survivorService;
    }


    // Create a new survivor
    @PostMapping
    public Survivors createSurvivor(@RequestBody Survivors survivors) {
        return survivorService.createSurvivor(survivors);
    }

    // Get all survivors
    @GetMapping
    public List<Survivors> getAllSurvivors() {
        return survivorService.getAllSurvivors();
    }

    // Get survivors by ID
    @GetMapping("/{id}")
    public Optional<Survivors> getSurvivorsById(@PathVariable Long id) {
        return survivorService.getSurvivorsById(id);
    }

    // Update survivor by ID
    @PutMapping("/survivors/{id}")
    public Survivors updateSurvivors(@PathVariable Long id, @RequestBody Survivors survivorsDetails) {
        return survivorService.updateSurvivors(id, survivorsDetails);
    }
    //Reports Contamination
    @PutMapping("/report_Contamination/{id}")
    public ResponseEntity<String> reportInfection(@PathVariable Long id){
        survivorService.reportInfection(id);
        return ResponseEntity.ok("Infection Reported successfully.");
    }
}