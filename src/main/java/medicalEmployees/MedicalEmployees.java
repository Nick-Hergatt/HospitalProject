package medicalEmployees;
import models.HospitalEmployee;

public abstract class MedicalEmployees extends HospitalEmployee {

	protected String specialty;
	protected int patients;
	public MedicalEmployees() {
		super();
	}

	public int careForPatient() {
		return 0;
	}

	public int getDrawBlood() {

		return 0;
	}
	

}