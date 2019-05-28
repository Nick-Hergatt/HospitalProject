
public abstract class MedicalEmployees extends HospitalEmployee {

	protected int patients;
	public MedicalEmployees() {
		super();
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