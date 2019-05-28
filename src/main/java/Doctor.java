
public class Doctor extends MedicalEmployees {
	String specialty;


	public Doctor(String firstName, int payRate, String employeeNum, boolean hasBeenPayed, String specialty) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
		this.specialty = specialty;
	}

	@Override
	public int getPayRate() {
		return 90000;
	}

	public String getSpecialty(String specialty) {
		return specialty;
	}

}
