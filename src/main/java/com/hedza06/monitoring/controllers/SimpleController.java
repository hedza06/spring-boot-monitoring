package com.hedza06.monitoring.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/execute")
public class SimpleController {

    @GetMapping
    public ResponseEntity<Map<String, String>> execute()
    {
        log.info("Endpoint executed...");
        Map<String, String> response = new HashMap<>();
        response.put("message", "API executed");

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
