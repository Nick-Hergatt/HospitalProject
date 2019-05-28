package medicalEmployee;
import models.HospitalEmployee;

public abstract class MedicalEmployees extends HospitalEmployee {

	public MedicalEmployees(String firstName, int payRate, String employeeNum, boolean hasBeenPayed) {
		super(firstName, payRate, employeeNum, hasBeenPayed);

	}



}