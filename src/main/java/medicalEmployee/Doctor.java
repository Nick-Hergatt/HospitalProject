package medicalEmployee;

public class Doctor extends MedicalEmployees {
	String specialty;


	public Doctor(String firstName,  String employeeNum, boolean hasBeenPayed, String specialty) {
		super(firstName, employeeNum, hasBeenPayed);
		this.specialty = specialty;
		makePayRate();
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
		makePayRate();
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
