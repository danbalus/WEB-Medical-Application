package com.example.demo.service;

import com.example.demo.model.Doctor;

import java.util.List;

public interface IDoctorService {
    List<Doctor> getAllDoctorss();

    List<Doctor> getAllDoctorsByMedicalUnit(String name);
}
