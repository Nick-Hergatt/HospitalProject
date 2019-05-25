package models;

public abstract class HospitalEmployee {

	protected String firstName;
	protected String payRate;
	protected String employeeNum;

	public HospitalEmployee() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getPayRate() {
		return payRate;
	}
	public String getEmployeeNum() {
		return employeeNum;
		
	}
	
	
	

}