package com.marie.trainscanner.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TrainScannerController {

    @GetMapping(value = "/train")
    public String getTrain() {
        return "Hello Marie!";
    }
}
