package com.example.demo.service;

import com.example.demo.model.Doctor;
import com.example.demo.model.XMLParser;
import com.example.demo.persistence.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService implements IDoctorService{
//    private DoctorRepository doctorRepository;
//
//    @Autowired
//    public DoctorService(DoctorRepository doctorRepository){
//        this.doctorRepository=doctorRepository;
//    }

    @Override
    public List<Doctor> getAllDoctorss() {
        List<Doctor> listOfDoctors = new ArrayList<>();
        XMLParser xmlParser = new XMLParser();
        listOfDoctors = xmlParser.executeParseDoctor();
        //this.doctorRepository.findAll().forEach(listOfActors::add);

        return listOfDoctors;
    }

    @Override
    public List<Doctor> getAllDoctorsByMedicalUnit(String name) {
        List<Doctor> listOfDoctors = new ArrayList<>();
        XMLParser xmlParser = new XMLParser();
        listOfDoctors = xmlParser.executeParseDoctor();
        System.out.println(Arrays.asList(listOfDoctors));
        //this.doctorRepository.findAll().forEach(listOfActors::add);
        listOfDoctors.removeIf(ld -> !ld.getMedicalUnit().equals(name));
        System.out.println(Arrays.asList(listOfDoctors));
        return listOfDoctors;    }
}
