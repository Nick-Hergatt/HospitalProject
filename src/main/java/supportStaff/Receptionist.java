package supportStaff;

public class Receptionist extends SupportStaff {

	boolean isOnThePhone;



	public Receptionist(String firstName, String employeeNum, boolean hasBeenPayed, boolean isOnThePhone) {
		super(firstName, employeeNum, hasBeenPayed);
		this.isOnThePhone = isOnThePhone;
		makePayRate();
	}

	@Override
	public int getPayRate() {
		return payRate;
	}

	public boolean getIsOnThePhone() {
		return isOnThePhone;
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
