package com.example.backend.Controller;

import com.example.backend.Entity.HealthRecord;
import com.example.backend.Repository.HealthRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthRecordController {

    @Autowired
    private HealthRecordRepository healthRecordRepository;

    @PostMapping("/save-data")
    public ResponseEntity<String> saveData(@RequestBody Map<String, Object> healthRecord) {
        try {
            // 받아온 JSON 데이터를 HealthRecord 엔티티로 변환하여 데이터베이스에 저장합니다.
            HealthRecord record = convertToHealthRecord(healthRecord);
            healthRecordRepository.save(record);
            return ResponseEntity.ok("데이터가 성공적으로 저장되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("데이터 저장에 실패했습니다.");
        }
    }
    private HealthRecord convertToHealthRecord(Map<String, Object> healthRecord) {
        HealthRecord record = new HealthRecord();

        record.setBaseYear(Integer.parseInt((String) healthRecord.get("기준년도")));
        record.setSubscriberId(Integer.parseInt((String) healthRecord.get("가입자_일련번호")));
        record.setCityCode(Integer.parseInt((String) healthRecord.get("시도코드")));
        record.setGenderCode(Integer.parseInt((String) healthRecord.get("성별코드")));
        record.setAgeGroupCode(Integer.parseInt((String) healthRecord.get("연령대코드")));
        record.setHeight(Integer.parseInt((String) healthRecord.get("신장")));
        record.setWeight(Integer.parseInt((String) healthRecord.get("체중")));
        record.setWaistCircumference((String) healthRecord.get("허리둘레"));
        record.setLeftEyeSight((String) healthRecord.get("시력_좌"));
        record.setRightEyeSight((String) healthRecord.get("시력_우"));
        record.setLeftHearing(Integer.parseInt((String) healthRecord.get("청력_좌")));
        record.setRightHearing(Integer.parseInt((String) healthRecord.get("청력_우")));
        record.setSystolicBloodPressure(Integer.parseInt((String) healthRecord.get("수축기_혈압")));
        record.setDiastolicBloodPressure(Integer.parseInt((String) healthRecord.get("이완기_혈압")));
        record.setFastingBloodSugar(Integer.parseInt((String) healthRecord.get("식전혈당")));
        record.setTotalCholesterol(Integer.parseInt((String) healthRecord.get("총_콜레스테롤")));
        record.setTriglycerides(Integer.parseInt((String) healthRecord.get("트리글리세라이드")));
        record.setHdlCholesterol((String) healthRecord.get("콜레스테롤_HDL"));
        record.setLdlCholesterol(Integer.parseInt((String) healthRecord.get("콜레스테롤_LDL")));
        record.setHemoglobin((String) healthRecord.get("혈색소"));
        record.setUrineProtein(Integer.parseInt((String) healthRecord.get("요단백")));
        record.setSerumCreatinine((String) healthRecord.get("혈청크레아티닌"));
        record.setAst(Integer.parseInt((String) healthRecord.get("간기능검사_AST")));
        record.setAlt(Integer.parseInt((String) healthRecord.get("간기능검사_ALT")));
        record.setGammaGtp((String) healthRecord.get("감마지티피"));
        record.setSmokingStatus(Integer.parseInt((String) healthRecord.get("흡연상태")));
        record.setDrinkingStatus(Integer.parseInt((String) healthRecord.get("음주여부")));
        record.setOralExam(Integer.parseInt((String) healthRecord.get("구강검진수검여부")));
        record.setDentalCaries(Integer.parseInt((String) healthRecord.get("치아우식증유무")));
        record.setMissingTeeth((String) healthRecord.get("결손치유무"));
        record.setDentalAbnormalities((String) healthRecord.get("치아마모증유무"));
        record.setThirdMolarAbnormalities((String) healthRecord.get("제3대구치_이상"));
        record.setTartar(Integer.parseInt((String) healthRecord.get("치석")));

        return record;
    }

}