package supportStaff;
import models.HospitalEmployee;

public abstract class SupportStaff extends HospitalEmployee {

	public SupportStaff(String firstName,  String employeeNum, boolean hasBeenPayed) {
		super(firstName, employeeNum, hasBeenPayed);
	}


}
