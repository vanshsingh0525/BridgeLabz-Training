package com.objectmodelling.hospital;

import java.util.ArrayList;

public class Doctor {

    private String doctorName;
    private ArrayList<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    // Communication between objects
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Doctor " + doctorName +
                " is consulting Patient " + patient.getPatientName());
    }

    public void viewPatients() {
        System.out.println("Patients consulted by Dr. " + doctorName + ":");
        for (Patient p : patients) {
            System.out.println(p.getPatientName());
        }
        System.out.println();
    }
}

