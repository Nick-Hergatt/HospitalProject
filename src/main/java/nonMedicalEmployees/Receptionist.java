package nonMedicalEmployees;

public class Receptionist extends NonMedicalEmployee {
	boolean onThePhone;

	public Receptionist(boolean onThePhone) {
		this.firstName = "Greg";
		this.payRate = "45000";
		this.onThePhone = true;
		this.employeeNum = "3";
	}

	public boolean getOnThePhone() {
			return onThePhone;
	}
}