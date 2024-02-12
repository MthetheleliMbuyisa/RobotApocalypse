package com.survivors.robotApocalypse.Controllers;

import com.survivors.robotApocalypse.Entity.ApocalypseRobots;
import com.survivors.robotApocalypse.services.RobotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("/robotAPI")
public class RobotController {

    @Autowired
    private RobotsService robotsService;

    @Value("${external.api.url}")
    private String apiUrl;

    @GetMapping("/original_robot_Data")
    public ResponseEntity<String> getApocalypesRobotData() {
        WebClient webClient = WebClient.create();

        // Method chaining for WebClient
        String result = webClient.get()
                .uri(apiUrl)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // blocking call, reactive programming

        System.out.println("----------------");
        System.out.println(result);
        System.out.println("-----------");

        // Returning the JSON in the HTTP response
        return ResponseEntity.ok()
                .header("Content-Type", "application/json")
                .body(result);
    }

    @GetMapping("/sortedApocalypesRobots")
    public ResponseEntity<List<ApocalypseRobots>> getSortedApocalypesRobots() {
        List<ApocalypseRobots> sortedApocalypesRobots = robotsService.getSortedApocalypesRobotsFromURL(apiUrl);
        return ResponseEntity.ok(sortedApocalypesRobots);
    }
}
