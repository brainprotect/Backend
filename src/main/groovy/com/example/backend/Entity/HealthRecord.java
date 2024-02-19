package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Entity
@Table(name = "health_records")
@Getter
@Setter
@ToString
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "기준년도")
    private int baseYear;

    @Column(name = "가입자_일련번호")
    private int subscriberId;

    @Column(name = "시도코드")
    private int cityCode;

    @Column(name = "성별코드")
    private int genderCode;

    @Column(name = "연령대코드")
    private int ageGroupCode;

    @Column(name = "신장")
    private int height;

    @Column(name = "체중")
    private int weight;

    @Column(name = "허리둘레")
    private String waistCircumference;

    @Column(name = "시력_좌")
    private String leftEyeSight;

    @Column(name = "시력_우")
    private String rightEyeSight;

    @Column(name = "청력_좌")
    private int leftHearing;

    @Column(name = "청력_우")
    private int rightHearing;

    @Column(name = "수축기_혈압")
    private int systolicBloodPressure;

    @Column(name = "이완기_혈압")
    private int diastolicBloodPressure;

    @Column(name = "식전혈당")
    private int fastingBloodSugar;

    @Column(name = "총_콜레스테롤")
    private int totalCholesterol;

    @Column(name = "트리글리세라이드")
    private int triglycerides;

    @Column(name = "콜레스테롤_HDL")
    private String hdlCholesterol;

    @Column(name = "콜레스테롤_LDL")
    private int ldlCholesterol;

    @Column(name = "혈색소")
    private String hemoglobin;

    @Column(name = "요단백")
    private int urineProtein;

    @Column(name = "혈청크레아티닌")
    private String serumCreatinine;

    @Column(name = "간기능검사_AST")
    private int ast;

    @Column(name = "간기능검사_ALT")
    private int alt;

    @Column(name = "감마지티피")
    private String gammaGtp;

    @Column(name = "흡연상태")
    private int smokingStatus;

    @Column(name = "음주여부")
    private int drinkingStatus;

    @Column(name = "구강검진수검여부")
    private int oralExam;

    @Column(name = "치아우식증유무")
    private int dentalCaries;

    @Column(name = "결손치유무")
    private String missingTeeth;

    @Column(name = "치아마모증유무")
    private String dentalAbnormalities;

    @Column(name = "제3대구치_이상")
    private String thirdMolarAbnormalities;

    @Column(name = "치석")
    private int tartar;
}