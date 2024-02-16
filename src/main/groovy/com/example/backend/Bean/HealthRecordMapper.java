package com.example.backend.Bean;

import com.example.backend.DTO.HealthRecordDTO;
import com.example.backend.Entity.HealthRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface HealthRecordMapper {
    HealthRecord toEntity(HealthRecordDTO dto);


}
