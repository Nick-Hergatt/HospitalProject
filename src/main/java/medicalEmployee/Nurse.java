package medicalEmployee;

public class Nurse extends MedicalEmployees {
	int patients;
	
	
	public Nurse(String firstName, String employeeNum, boolean hasBeenPayed, int patients) {
		super(firstName, employeeNum, hasBeenPayed);
		this.patients = patients;
		makePayRate();
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
		makePayRate();
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
