// HealthRecordService.java
package com.example.backend.Service;

import com.example.backend.Bean.HealthRecordMapper;
import com.example.backend.DTO.HealthRecordDTO;
import com.example.backend.Entity.HealthRecord;
import com.example.backend.Repository.HealthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthRecordService {

    private final HealthRecordRepository healthRecordRepository;
    private final HealthRecordMapper healthRecordMapper;

    @Autowired
    public HealthRecordService(HealthRecordRepository healthRecordRepository, HealthRecordMapper healthRecordMapper) {
        this.healthRecordRepository = healthRecordRepository;
        this.healthRecordMapper = healthRecordMapper;
    }

    public void saveHealthRecord(HealthRecordDTO healthRecordDTO) {
        HealthRecord healthRecord = healthRecordMapper.toEntity(healthRecordDTO);
        healthRecordRepository.save(healthRecord);
        System.out.println("Received health record data:");
        System.out.println("Base Year: " + healthRecordDTO.getBaseYear());
        System.out.println("Subscriber ID: " + healthRecordDTO.getSubscriberId());
        System.out.println("City Code: " + healthRecordDTO.getCityCode());
    }
}
