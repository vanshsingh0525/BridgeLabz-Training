package com.encapsulation.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalDemo {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient(101, "Ramesh", 45, 5, 3000);
        Patient p2 = new OutPatient(102, "Anita", 30, 800);

        ((MedicalRecord) p1).addRecord("Pneumonia");
        ((MedicalRecord) p2).addRecord("General Checkup");

        patients.add(p1);
        patients.add(p2);

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount : " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                ((MedicalRecord) p).viewRecords();
            }

            System.out.println("-----------------------------");
        }
    }
}

