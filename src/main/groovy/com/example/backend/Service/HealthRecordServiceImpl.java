package com.example.backend.Service;

import com.example.backend.DTO.HealthRecordDTO;
import com.example.backend.Entity.HealthRecord;
import com.example.backend.Repository.HealthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthRecordServiceImpl implements HealthRecordService {

    private final HealthRecordRepository healthRecordRepository;


    @Autowired
    public HealthRecordServiceImpl(HealthRecordRepository healthRecordRepository) {
        this.healthRecordRepository = healthRecordRepository;

    }

    @Override
    public void saveHealthRecord(HealthRecordDTO healthRecordDTO) {
        HealthRecord healthRecord = new HealthRecord();
        healthRecord.setBaseYear(healthRecordDTO.getBaseYear());
        healthRecord.setSubscriberId(healthRecordDTO.getSubscriberId());
        healthRecord.setCityCode(healthRecordDTO.getCityCode());
        healthRecord.setGenderCode(healthRecordDTO.getGenderCode());
        healthRecord.setAgeGroupCode(healthRecordDTO.getAgeGroupCode());
        healthRecord.setHeight(healthRecordDTO.getHeight());
        healthRecord.setWeight(healthRecordDTO.getWeight());
        healthRecord.setWaistCircumference(healthRecordDTO.getWaistCircumference());
        healthRecord.setLeftEyeSight(healthRecordDTO.getLeftEyeSight());
        healthRecord.setRightEyeSight(healthRecordDTO.getRightEyeSight());
        healthRecord.setLeftHearing(healthRecordDTO.getLeftHearing());
        healthRecord.setRightHearing(healthRecordDTO.getRightHearing());
        healthRecord.setSystolicBloodPressure(healthRecordDTO.getSystolicBloodPressure());
        healthRecord.setDiastolicBloodPressure(healthRecordDTO.getDiastolicBloodPressure());
        healthRecord.setFastingBloodSugar(healthRecordDTO.getFastingBloodSugar());
        healthRecord.setTotalCholesterol(healthRecordDTO.getTotalCholesterol());
        healthRecord.setTriglycerides(healthRecordDTO.getTriglycerides());
        healthRecord.setHdlCholesterol(healthRecordDTO.getHdlCholesterol());
        healthRecord.setLdlCholesterol(healthRecordDTO.getLdlCholesterol());
        healthRecord.setHemoglobin(healthRecordDTO.getHemoglobin());
        healthRecord.setUrineProtein(healthRecordDTO.getUrineProtein());
        healthRecord.setSerumCreatinine(healthRecordDTO.getSerumCreatinine());
        healthRecord.setAst(healthRecordDTO.getAst());
        healthRecord.setAlt(healthRecordDTO.getAlt());
        healthRecord.setGammaGtp(healthRecordDTO.getGammaGtp());
        healthRecord.setSmokingStatus(healthRecordDTO.getSmokingStatus());
        healthRecord.setDrinkingStatus(healthRecordDTO.getDrinkingStatus());
        healthRecord.setOralExam(healthRecordDTO.getOralExam());
        healthRecord.setDentalCaries(healthRecordDTO.getDentalCaries());
        healthRecord.setMissingTeeth(healthRecordDTO.getMissingTeeth());
        healthRecord.setDentalAbnormalities(healthRecordDTO.getDentalAbnormalities());
        healthRecord.setThirdMolarAbnormalities(healthRecordDTO.getThirdMolarAbnormalities());
        healthRecord.setTartar(healthRecordDTO.getTartar());

        healthRecordRepository.save(healthRecord);
    }

}
