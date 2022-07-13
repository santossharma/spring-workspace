package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by santoshsharma on 10 Jul, 2022
 */

@RestController
@Slf4j
public class WorkspaceController {

    @GetMapping("/log")
    public ResponseEntity<String> getLogs() {
        log.warn("Warning message logged !");
        return ResponseEntity.ok().body("All Ok");
    }
}
