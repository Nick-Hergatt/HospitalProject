package models;

public abstract class HospitalEmployee {

	protected String firstName;
	protected int payRate;
	protected String employeeNum;
	protected boolean hasBeenPayed;


	public HospitalEmployee(String firstName, String employeeNum, boolean hasBeenPayed) {
		this.firstName = firstName;
		this.employeeNum = employeeNum;
		this.hasBeenPayed = hasBeenPayed;
	}

	public String getFirstName() {
		return firstName;
	}

	public abstract int getPayRate();

	public void payEmployee() {
		hasBeenPayed = true;
	}
	
	public boolean getHasBeenPayed() {
		return hasBeenPayed;
	}
	
	public abstract void payOutSalary();
	
	public abstract void makePayRate();
	
	public String getEmployeeNum() {
		return employeeNum;
	}
}