package supportStaff;

public class EmergencyResponderJenny extends Receptionist {
	public boolean isOnThePhone;
	public boolean isOutOnRun;

	public EmergencyResponderJenny(String firstName, String employeeNum, boolean hasBeenPayed, boolean isOnThePhone, boolean isOutOnRun) {
		super(firstName, employeeNum, hasBeenPayed, isOnThePhone);
		this.isOutOnRun = isOutOnRun;
	}
	
	public boolean getIsOutOnRun() {
		
		return isOutOnRun;
	}
	@Override
	public void payOutSalary() {
		makePayRate();
		if(hasBeenPayed == false) {;
		System.out.println("Receptionist " + firstName + " has been paid " + getPayRate());
		payEmployee();
		}
		else if(hasBeenPayed == true) {
		System.out.println("Receptionist " + firstName + " had already been paid");
		}
		
	}

	@Override
	public void makePayRate() {
		payRate = 45000;
		
	}

}