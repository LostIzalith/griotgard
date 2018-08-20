package com.github.lostizalith.griotgard;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "greeting/v2")
public class GreetingControllerV2 {

    @GetMapping
    public ResponseEntity<String> greeting() {
        return ResponseEntity.ok().body("Hello World v2!!!");
    }
}
