package com.example.backend.Service;

import com.example.backend.Bean.HealthRecordMapper;
import com.example.backend.DTO.HealthRecordDTO;
import com.example.backend.Entity.HealthRecord;
import com.example.backend.Repository.HealthRecordRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HealthRecordService {

    private final HealthRecordRepository healthRecordRepository;
    private final HealthRecordMapper healthRecordMapper;

    @Autowired
    public HealthRecordService(HealthRecordRepository healthRecordRepository, HealthRecordMapper healthRecordMapper) {
        this.healthRecordRepository = healthRecordRepository;
        this.healthRecordMapper = healthRecordMapper;
    }

    @Transactional
    public void saveHealthRecord(HealthRecordDTO healthRecordDTO) {
        HealthRecord healthRecord = healthRecordMapper.toEntity(healthRecordDTO);
        healthRecordRepository.save(healthRecord);
    }
}