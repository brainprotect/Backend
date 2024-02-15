package com.example.backend.Repository;

import com.example.backend.Entity.HealthRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRecordRepository extends JpaRepository<HealthRecord, Long> {
    // 필요에 따라 추가적인 메소드를 선언할 수 있습니다.
}