package com.survivors.robotApocalypse.services;

import com.survivors.robotApocalypse.Entity.Survivors;
import com.survivors.robotApocalypse.Repository.SurvivorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurvivorService {

    private final SurvivorRepository survivorRepository;


    public SurvivorService(SurvivorRepository survivorRepository) {

        this.survivorRepository = survivorRepository;
    }


    // Creating a new survivor
    public Survivors createSurvivor(Survivors survivors) {

        return survivorRepository.save(survivors);
    }

    // Get all survivors
    public List<Survivors> getAllSurvivors() {
        return survivorRepository.findAll();
    }

    // Get survivors by ID
    public Optional<Survivors> getSurvivorById(Long id) {
        return survivorRepository.findById(id);
    }

    // Update survivors
    public Survivors updateSurvivor(Long id, Survivors survivorsDetails) {
        Optional<Survivors> survivors = survivorRepository.findById(id);
        if (survivors.isPresent()) {
            Survivors existingSurvivors = survivors.get();
            existingSurvivors.setName(survivorsDetails.getName());

            return survivorRepository.save(existingSurvivors);
        }
        return null;
    }
}