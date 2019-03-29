package com.example.demo.service;

import com.example.demo.model.MedicalUnit;
import com.example.demo.model.XMLParser;
import com.example.demo.persistence.MedicalUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalUnitService implements IMedicalUnitService {

//
//
//    private MedicalUnitRepository medicalUnitRepository;
//
//    @Autowired
//    public MedicalUnitService(MedicalUnitRepository medicalUnitRepository){
//        this.medicalUnitRepository = medicalUnitRepository;
//    }

    @Override
    public List<MedicalUnit> getAllMedicalUnitss() {
        List<MedicalUnit> listOfMedicalUnits = new ArrayList<>();
        XMLParser xmlParser = new XMLParser();
        listOfMedicalUnits = xmlParser.executeParseMedicalUnnit();
        //this.doctorRepository.findAll().forEach(listOfActors::add);

        return listOfMedicalUnits;
    }
}
