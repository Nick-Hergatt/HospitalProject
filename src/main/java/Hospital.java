import java.util.HashMap;
import java.util.Map;

public class Hospital {
	Map<String, HospitalEmployee> employees = new HashMap<>();
	Map<String, Patient> patients = new HashMap<>();
	
	public String getEmployeeFirstName(String name) {
		return employees.get(name).getFirstName(name);
	}
	public void addHospitalEmployeeToMap(HospitalEmployee employee) {
		employees.put(employee.getEmployeeNum(), employee);
		
	}
	
	public void payAllEmployees() {
		for(HospitalEmployee hospitalEmployee : employees.values()) {
			System.out.println(hospitalEmployee.getFirstName(null));
		}
		
	}
	public int getEmployeesSize() {
	
		return employees.size();
	}
	
}

