package models;
import java.util.HashMap;
import java.util.Map;

import patients.Patient;

public class Hospital {
	Map<String, HospitalEmployee> employees = new HashMap<>();
	Map<String, Patient> patients = new HashMap<>();
	
	public HospitalEmployee getEmployeeFirstName(HospitalEmployee employee) {
		return employees.get(employee);
		
	}
	public void addHospitalEmployeeToMap(HospitalEmployee employee) {
		employees.put(employee.getEmployeeNum(), employee);
		
	}
	
	/*public void payAllEmployees() {
		for(HospitalEmployee hospitalEmployee : employees.values()) {
		System.out.println(hospitalEmployee.getFirstName(null));
	}*/
		
	
	/*public String payOneEmployee(String employeeNum) {
		HospitalEmployee hospitalEmployee = employees.get(employeeNum);
		String payRate = hospitalEmployee.getPayRate();
		return payRate;
		
		
		
	}*/
	
	public int getEmployeesSize() {
	
		return employees.size();
	}
	
}

