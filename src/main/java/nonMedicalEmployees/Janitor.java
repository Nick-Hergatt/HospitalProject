package nonMedicalEmployees;

public class Janitor extends NonMedicalEmployee {
	boolean sweeping;

	public Janitor(boolean sweeping) {
		this.firstName = "Greg";
		this.payRate = "40000";
		this.employeeNum = "3";
	}

	public boolean getSweeping() {
			return sweeping;
	}
}