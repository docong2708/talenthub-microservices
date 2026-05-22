package com.talenthub.candidateservice.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/candidate")
@RequiredArgsConstructor
public class CandidateController {
    private final RestTemplate restTemplate;

    @GetMapping("/ping")
    public Map<?, ?> ping(){
        return Map.of("status", "ok", "message", "Candidate service hello world!");
    }

    @GetMapping("/getting-jobs")
    public ResponseEntity<?> getJob(){
        return restTemplate.getForEntity("http://localhost:8081/api/v1/jobs/", ResponseEntity.class).getBody();
    }
}
