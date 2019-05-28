package supportStaff;
import models.HospitalEmployee;

public abstract class SupportStaff extends HospitalEmployee {

	public SupportStaff(String firstName, int payRate, String employeeNum, boolean hasBeenPayed) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
	}


}
