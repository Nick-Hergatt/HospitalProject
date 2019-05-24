
public abstract class MedicalEmployees extends Employee {

	protected String firstName;
	protected int payRate = 90000;
	protected String specialty;
	protected int patients;
	protected String employeeNum;
	public MedicalEmployees() {
		super();
	}

	public String getFirstName(String firstName) {
		return firstName;
	}

	public int getPayRate() {
		return payRate;
	}

	public int careForPatient() {
		return 0;
	}

	public String getSpecialty(String specialty) {
		return specialty;
	}

	public int getPatients() {
		return 0;
	}
	

}