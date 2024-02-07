package com.survivors.robotApocalypse.Controllers;

import com.survivors.robotApocalypse.Entity.Survivors;
import com.survivors.robotApocalypse.services.SurvivorService;
import org.springframework.beans.factory.annotation.Autowired;
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

    // Get survivor by ID
    @GetMapping("/{id}")
    public Optional<Survivors> getSurvivorById(@PathVariable Long id) {
        return survivorService.getSurvivorById(id);
    }

    // Update survivor by ID
    @PutMapping("/survivors/{id}")
    public Survivors updateSurvivor(@PathVariable Long id, @RequestBody Survivors survivorsDetails) {
        return survivorService.updateSurvivor(id, survivorsDetails);
    }
}