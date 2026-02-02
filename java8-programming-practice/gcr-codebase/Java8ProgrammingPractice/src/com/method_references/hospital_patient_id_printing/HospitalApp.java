package com.method_references.hospital_patient_id_printing;
import java.util.*;

public class HospitalApp {
	
	public static void main(String[] args) {
		List<Patient> patientList =  Arrays.asList(				
				new Patient("sam", 1),
				new Patient("ak", 2)
				);
		
		patientList.forEach(Patient::printId);
		
		
	}
	
}
