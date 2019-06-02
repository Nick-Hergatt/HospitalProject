package models;

import java.util.HashMap;
import java.util.Map;

import patient.Patient;
import supportStaff.Janitor;

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
	public boolean isAPatient(String firstName) {
		if (patients.containsKey(firstName))
			return true;
		return false;
	}
	public void patientStats() {
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		System.out.printf("\n%1$-20s %2$10s %3$15s", "Name", "Health lvl", "Blood lvl");
		for (Patient patient : patients.values()) {
				System.out.printf("\n%1$-20s %2$10d %3$15s \n", patient.getFirstName(), patient.getHealthLevel(), patient.getBloodLevel());
			}
	}

	public String makeNCharacterStringWithDashes(String inputString, int length) {
        if (inputString.equals("-1")) {
            inputString = "";
        }
        if (inputString.length() > length) {
            inputString = inputString.substring(0, length);
        }
        while (inputString.length() < length) {
            if (inputString.length() % 2 == 0) {
                inputString = inputString + "-";
            } else {
                inputString = "-" + inputString;
            }
        }
        return inputString;
    }
	
}
