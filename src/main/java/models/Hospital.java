package models;
import java.util.HashMap;
import java.util.Map;

import patient.Patient;

public class Hospital {
	Map<String, HospitalEmployee> employees = new HashMap<>();
	Map<String, Patient> patients = new HashMap<>();
	
}
