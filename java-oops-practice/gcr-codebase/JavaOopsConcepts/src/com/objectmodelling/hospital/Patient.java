package com.objectmodelling.hospital;

import java.util.ArrayList;

public class Patient {

    private String patientName;
    private ArrayList<Doctor> doctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        this.doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    // Association: Patient ↔ Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void viewDoctors() {
        System.out.println("Doctors consulted by " + patientName + ":");
        for (Doctor d : doctors) {
            System.out.println(d.getDoctorName());
        }
        System.out.println();
    }
}

