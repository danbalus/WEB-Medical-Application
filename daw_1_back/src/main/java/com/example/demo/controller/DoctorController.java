package com.example.demo.controller;


import com.example.demo.model.Doctor;
import com.example.demo.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class DoctorController  {
    private IDoctorService doctorService;

    @Autowired
    public DoctorController(IDoctorService doctorService){
        this.doctorService = doctorService;
    }


    @GetMapping("/doctors")
    public ResponseEntity<List<Doctor>> getAllMedicalUnits(){

        return ResponseEntity.ok(doctorService.getAllDoctorss());
    }
    @GetMapping("/doctors/{name}")
    public ResponseEntity<List<Doctor>> getMovieById(@PathVariable(value ="name") String name){
        System.out.println(name);
        return ResponseEntity.ok(doctorService.getAllDoctorsByMedicalUnit(name));
    }
}
