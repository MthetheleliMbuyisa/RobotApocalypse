package com.survivors.robotApocalypse.Repository;

import com.survivors.robotApocalypse.Entity.Survivors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurvivorRepository extends JpaRepository<Survivors, Long> {

    //findInfectedBy(True)
    List<Survivors> findByInfected(boolean infected);
    long countByInfected(boolean infected);
}
