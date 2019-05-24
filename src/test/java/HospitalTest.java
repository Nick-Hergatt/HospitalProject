import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HospitalTest {

	Hospital payroll = new Hospital();
	Doctor john = new Doctor("1", "John", 0, null);
	
	@Test
	public void CanAddEmployeeToHospitalMap() {
		payroll.addHospitalEmployeeToMap(john);
		assertEquals(1, payroll.getEmployeesSize());
	}
	
}
