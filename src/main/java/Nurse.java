
public class Nurse extends MedicalEmployees {
	int patients;

	
	public Nurse(String firstName, int payRate, String employeeNum, boolean hasBeenPayed, int patients) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
		this.patients = patients;
	}

	@Override
	public int getPayRate() {
		return 50000;
	}

	public int getPatients() {
		return 0;
	}

}
