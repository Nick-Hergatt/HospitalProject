
public class Receptionist extends SupportStaff {

	boolean isOnThePhone;



	public Receptionist(String firstName, int payRate, String employeeNum, boolean hasBeenPayed, boolean isOnThePhone) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
		this.isOnThePhone = isOnThePhone;
	}

	@Override
	public int getPayRate() {
		return 45000;
	}

	public boolean getIsOnThePhone() {
		return isOnThePhone;
	}

}
