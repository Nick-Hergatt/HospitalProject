package models;
import java.util.HashMap;
import java.util.Map;

import patient.Patient;


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
		
	
}
