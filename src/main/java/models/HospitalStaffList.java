package models;
import java.util.HashMap;
import java.util.Map;

import medicalEmployee.Doctor;
import medicalEmployee.Nurse;
import patient.Patient;
import supportStaff.Janitor;
import supportStaff.Receptionist;


public class HospitalStaffList {
	
	Map<String, HospitalEmployee> employees = new HashMap<>();
	
	public void addEmployeeToStaff(HospitalEmployee hospitalEmpoyee) {
		employees.put(hospitalEmpoyee.getFirstName(), hospitalEmpoyee);

	}

	public String getFirstName(String name) {
		return employees.get(name).getFirstName();
	}

	public void removeEmployeeFromList(String name) {
		employees.remove(name);
		
	}

	public int getStaffSize() {
		return employees.size();
	}
	public void doctorStats() {
		System.out.printf("\n%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Name", "PayRate", "Employee Number", "Have They Been Payed", "Specialty");
		for (HospitalEmployee doctor : employees.values()) {
			if (doctor instanceof Doctor)
				System.out.printf("%1$-20s %2$10d %3$10s %4$10b %5$10s \n", doctor.getFirstName(), doctor.getPayRate(), doctor.getEmployeeNum(), doctor.getHasBeenPayed(), ((Doctor) doctor).getSpecialty());
			}
	}
	public void nurseStats() {
		System.out.printf("\n%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Name", "PayRate", "Employee Number", "Have They Been Payed", "Number Of Patients");
		for (HospitalEmployee nurse : employees.values()) {
			if (nurse instanceof Nurse)
				System.out.printf("%1$-20s %2$10d %3$10s %4$10b %5$10d \n", nurse.getFirstName(), nurse.getPayRate(), nurse.getEmployeeNum(), nurse.getHasBeenPayed(), ((Nurse) nurse).getPatients());
			}
	}
	public void receptionistStats() {
		System.out.printf("\n%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Name", "PayRate", "Employee Number", "Have They Been Payed", "On Call");
		for (HospitalEmployee receptionist : employees.values()) {
			if (receptionist instanceof Receptionist)
				System.out.printf("%1$-20s %2$10d %3$10s %4$10b %5$10b \n", receptionist.getFirstName(), receptionist.getPayRate(), receptionist.getEmployeeNum(), receptionist.getHasBeenPayed(), ((Receptionist) receptionist).getIsOnThePhone());
			}
	}
	public void janitorStats() {
		System.out.printf("\n%1$-20s %2$10s %3$10s %4$10s %5$10s \n", "Name", "PayRate", "Employee Number", "Have They Been Payed", "Currently Cleaning");
		for (HospitalEmployee janitor : employees.values()) {
			if (janitor instanceof Janitor)
				System.out.printf("%1$-20s %2$10d %3$10s %4$10b %5$10b \n", janitor.getFirstName(), janitor.getPayRate(), janitor.getEmployeeNum(), janitor.getHasBeenPayed(), ((Janitor) janitor).getSweeping());
			}
	}
	
	
	
		
	
}
