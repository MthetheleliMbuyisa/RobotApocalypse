package com.survivors.robotApocalypse.services;

import com.survivors.robotApocalypse.Entity.ApocalypseRobots;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class RobotsService {
    public List<ApocalypseRobots> getSortedApocalypesRobotsFromURL(String url){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ApocalypseRobots[]> responseEntity = restTemplate.getForEntity(url, ApocalypseRobots[].class);
        ApocalypseRobots[] apocalypseRobots = responseEntity.getBody();

        Arrays.sort(apocalypseRobots, Comparator.comparing(ApocalypseRobots::getCategory));
        return Arrays.asList(apocalypseRobots);
    }
}

