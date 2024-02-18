// HealthRecordService.java (인터페이스)
package com.example.backend.Service;

import com.example.backend.DTO.HealthRecordDTO;

public interface HealthRecordService {
    void saveHealthRecord(HealthRecordDTO healthRecordDTO);
}
