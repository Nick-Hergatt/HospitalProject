package medicalEmployee;

public class Nurse extends MedicalEmployees {
	int patients;

	
	public Nurse(String firstName, int payRate, String employeeNum, boolean hasBeenPayed, int patients) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
		this.patients = patients;
	}

	@Override
	public int getPayRate() {
		return payRate;
	}

	public int getPatients() {
		return patients;
	}

	@Override
	public void payOutSalary() {
		if(hasBeenPayed == false) {;
		System.out.println("Nurse " + firstName + " has been paid " + getPayRate());
		payEmployee();
		}
		else if(hasBeenPayed == true) {
		System.out.println("Nurse " + firstName + " had already been paid");
		}
		
	}

	@Override
	public void makePayRate() {
		payRate = 50000;
		
	}

}
