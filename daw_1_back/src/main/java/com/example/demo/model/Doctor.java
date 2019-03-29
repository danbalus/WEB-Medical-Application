package com.example.demo.model;




public class Doctor {
    private  String name;
    private  String specialization;
    private  String gradulationYear;
    private  String profilePicture;
    private  String medicalUnit;

    public String getMedicalUnit() {
        return medicalUnit;
    }

    public void setMedicalUnit(String medicalUnit) {
        this.medicalUnit = medicalUnit;
    }

    public Doctor(String name, String specialization, String gradulationYear, String profilePicture, String medicalUnit) {
        this.name = name;
        this.specialization = specialization;
        this.gradulationYear = gradulationYear;
        this.profilePicture = profilePicture;
        this.medicalUnit = medicalUnit;
    }

    public Doctor(String name, String specialization, String gradulationYear, String profilePicture) {
        this.name = name;
        this.specialization = specialization;
        this.gradulationYear = gradulationYear;
        this.profilePicture = profilePicture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getGradulationYear() {
        return gradulationYear;
    }

    public void setGradulationYear(String gradulationYear) {
        this.gradulationYear = gradulationYear;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", gradulationYear='" + gradulationYear + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", medicalUnit='" + medicalUnit + '\'' +
                '}';
    }
}
