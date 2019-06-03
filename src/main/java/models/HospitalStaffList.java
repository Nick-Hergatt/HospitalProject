package models;
import java.util.HashMap;
import java.util.Map;

import medicalEmployee.Doctor;
import medicalEmployee.Nurse;
import patient.Patient;
import supportStaff.EmergencyResponderJenny;
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
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "Specialty");
		for (HospitalEmployee doctor : employees.values()) {
			if (doctor instanceof Doctor)
				System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15s\n", doctor.getFirstName(), doctor.getPayRate(), doctor.getEmployeeNum(), doctor.getHasBeenPayed(), ((Doctor) doctor).getSpecialty());
			}
	}
	public void nurseStats() {
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "# of Patients");
		for (HospitalEmployee nurse : employees.values()) {
			if (nurse instanceof Nurse)
				System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15d\n", nurse.getFirstName(), nurse.getPayRate(), nurse.getEmployeeNum(), nurse.getHasBeenPayed(), ((Nurse) nurse).getPatients());
			}
	}
	public void receptionistStats() {
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "On Call");
		for (HospitalEmployee receptionist : employees.values()) {
			if (receptionist instanceof Receptionist)
				System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15b\n", receptionist.getFirstName(), receptionist.getPayRate(), receptionist.getEmployeeNum(), receptionist.getHasBeenPayed(), ((Receptionist) receptionist).getIsOnThePhone());
			}
	}
	public void janitorStats() {
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "Active");
		for (HospitalEmployee janitor : employees.values()) {
			if (janitor instanceof Janitor)
				System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15b\n", janitor.getFirstName(), janitor.getPayRate(), janitor.getEmployeeNum(), janitor.getHasBeenPayed(), ((Janitor) janitor).getSweeping());
			}
	}
	public void emergencyResponderJennyStats() {
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s %6$15s", "Name", "PayRate", "Employee #", "Pay Status", "On Call", "Out On Run");
		for (HospitalEmployee emergencyResponderJenny : employees.values()) {
			if (emergencyResponderJenny instanceof EmergencyResponderJenny)
				System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15b %6$15b\n", emergencyResponderJenny.getFirstName(), emergencyResponderJenny.getPayRate(), emergencyResponderJenny.getEmployeeNum(), emergencyResponderJenny.getHasBeenPayed(), ((EmergencyResponderJenny) emergencyResponderJenny).getIsOnThePhone(), ((EmergencyResponderJenny) emergencyResponderJenny).getIsOutOnRun() );
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
	public void payAllEmployees() {
		for (HospitalEmployee hospitalEmployee : employees.values()) {
    		hospitalEmployee.payOutSalary();
    		System.out.println(makeNCharacterStringWithDashes("-", 44));
    	}
	}
	public boolean isAValidNewEmployee(String employeeName) {
		if (employees.containsKey(employeeName))
			return false;
		return true;
	}
	public boolean isAValidEmployee(String employeeName) {
		if (employees.containsKey(employeeName))
			return true;
		return false;
	}
	public void singleEmployeeStats(HospitalEmployee employee) {
		System.out.println(makeNCharacterStringWithDashes("-", 79));
		if (employee instanceof Doctor) {
				System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "Specialty");
				System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15s\n", employee.getFirstName(), employee.getPayRate(), employee.getEmployeeNum(), employee.getHasBeenPayed(), ((Doctor) employee).getSpecialty());
		}else if(employee instanceof Nurse) {
			System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "# of Patients");
			System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15d\n", employee.getFirstName(), employee.getPayRate(), employee.getEmployeeNum(), employee.getHasBeenPayed(), ((Nurse) employee).getPatients());
		}else if(employee instanceof Janitor) {
			System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "Active");
			System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15b\n", employee.getFirstName(), employee.getPayRate(), employee.getEmployeeNum(), employee.getHasBeenPayed(), ((Janitor) employee).getSweeping());
		}else if(employee instanceof Receptionist) {
			System.out.printf("\n%1$-20s %2$10s %3$15s %4$15s %5$15s", "Name", "PayRate", "Employee #", "Pay Status", "On Call");
			System.out.printf("\n%1$-20s %2$10d %3$15s %4$15b %5$15b\n", employee.getFirstName(), employee.getPayRate(), employee.getEmployeeNum(), employee.getHasBeenPayed(), ((Receptionist) employee).getIsOnThePhone());
		}
	}
	public HospitalEmployee grabSingleEmployee(String firstName) {
		return employees.get(firstName);
	}
		
	
}
