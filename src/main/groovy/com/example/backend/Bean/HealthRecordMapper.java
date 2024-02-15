package com.example.backend.Bean;
import com.example.backend.DTO.HealthRecordDTO;
import com.example.backend.Entity.HealthRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HealthRecordMapper {

    @Mapping(target = "id", ignore = true)
        // id 필드는 무시
    HealthRecord toEntity(HealthRecordDTO dto);

    HealthRecordDTO toDTO(HealthRecord entity);
}