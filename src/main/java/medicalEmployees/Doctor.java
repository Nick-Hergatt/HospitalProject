package medicalEmployees;

public class Doctor extends MedicalEmployees {
	public Doctor(String specialty) {
		this.payRate = "90000";
		this.firstName = "John";
		this.employeeNum = "1";

	}
	public String getSpecialty(String specialty) {
		return specialty;
	}
	



}
