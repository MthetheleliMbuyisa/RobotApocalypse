package com.survivors.robotApocalypse.Repository;

import com.survivors.robotApocalypse.Entity.Survivors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurvivorRepository extends JpaRepository<Survivors, Long> {
}
