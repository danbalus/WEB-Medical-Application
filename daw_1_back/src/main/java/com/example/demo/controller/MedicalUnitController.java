package com.example.demo.controller;

import com.example.demo.model.Doctor;
import com.example.demo.model.MedicalUnit;
import com.example.demo.model.XMLParser;
import com.example.demo.service.IMedicalUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class MedicalUnitController {

    private IMedicalUnitService medicalUnitService;

    @Autowired
    public MedicalUnitController(IMedicalUnitService medicalUnitService){
        this.medicalUnitService = medicalUnitService;
    }


    @GetMapping("/medical-units")
    public ResponseEntity<List<MedicalUnit>> getAllMedicalUnits(){

        return ResponseEntity.ok(medicalUnitService.getAllMedicalUnitss());
    }
}
