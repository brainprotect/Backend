package com.example.backend.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HealthRecordDTO {

    private Long id;
    private int baseYear;
    private int subscriberId;
    private int cityCode;
    private int genderCode;
    private int ageGroupCode;
    private int height;
    private int weight;
    private String waistCircumference;
    private String leftEyeSight;
    private String rightEyeSight;
    private int leftHearing;
    private int rightHearing;
    private int systolicBloodPressure;
    private int diastolicBloodPressure;
    private int fastingBloodSugar;
    private int totalCholesterol;
    private int triglycerides;
    private String hdlCholesterol;
    private int ldlCholesterol;
    private String hemoglobin;
    private int urineProtein;
    private String serumCreatinine;
    private int ast;
    private int alt;
    private String gammaGtp;
    private int smokingStatus;
    private int drinkingStatus;
    private int oralExam;
    private int dentalCaries;
    private String missingTeeth;
    private String dentalAbnormalities;
    private String thirdMolarAbnormalities;
    private int tartar;

    // 생성자, getter, setter 등은 필요에 따라 추가할 수 있습니다.
}
