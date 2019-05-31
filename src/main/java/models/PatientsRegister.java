package models;

import java.util.HashMap;
import java.util.Map;

import patient.Patient;

public class PatientsRegister {

	Map<String, Patient> patients = new HashMap<>();

	public void addPatientToReg(Patient patient) {
		patients.put(patient.getFirstName(), patient);

	}

	public String getPatientName(String name) {
		return patients.get(name).getFirstName();
	}

	public void removePatientFromReg(String name) {
		patients.remove(name);

	}

	public int getRegSize() {
		return patients.size();
	}

	public void DcDrawBlood(String firstName) {
		Patient patient = patients.get(firstName);
		patient.DcDrawBlood();

	}

	public void RnDrawBlood(String firstName) {
		Patient patient = patients.get(firstName);
		patient.RnDrawBlood();

	}

	public void DcCare(String firstName) {
		Patient patient = patients.get(firstName);
		patient.DcCare();
	}

	public void RnCare(String firstName) {
		Patient patient = patients.get(firstName);
		patient.RnCare();
	}
}
