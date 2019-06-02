package medicalEmployee;

public class Doctor extends MedicalEmployees {
	String specialty;


	public Doctor(String firstName, int payRate, String employeeNum, boolean hasBeenPayed, String specialty) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
		this.specialty = specialty;
	}

	@Override
	public int getPayRate() {
		return payRate;
	}

	public String getSpecialty() {
		return specialty;
	}

	@Override
	public void payOutSalary() {
		if(hasBeenPayed == false) {;
		System.out.println("Doctor " + firstName + " has been paid " + getPayRate());
		payEmployee();
		}
		else if(hasBeenPayed == true) {
		System.out.println("Docter " + firstName + " had already been paid");
		}
		
	}

	@Override
	public void makePayRate() {
		payRate = 90000;
		
	}

}
