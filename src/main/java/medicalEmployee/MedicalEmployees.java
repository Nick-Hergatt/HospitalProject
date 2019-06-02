package medicalEmployee;
import models.HospitalEmployee;

public abstract class MedicalEmployees extends HospitalEmployee {
	protected boolean fillingOutChart = true;
	
	public MedicalEmployees(String firstName, String employeeNum, boolean hasBeenPayed) {
		super(firstName, employeeNum, hasBeenPayed);

	}



}