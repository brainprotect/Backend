package com.example.backend.Controller;

import com.example.backend.DTO.HealthRecordDTO;
import com.example.backend.Service.HealthRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthRecordController {

    private final HealthRecordService healthRecordService;

    @Autowired
    public HealthRecordController(HealthRecordService healthRecordService) {
        this.healthRecordService = healthRecordService;
    }

    @PostMapping("/save-data")
    public ResponseEntity<String> saveData(@RequestBody HealthRecordDTO healthRecordDTO) {
        healthRecordService.saveHealthRecord(healthRecordDTO);
        return ResponseEntity.ok("Data saved successfully.");
    }
}