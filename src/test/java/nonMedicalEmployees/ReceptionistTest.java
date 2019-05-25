package nonMedicalEmployees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {
	Receptionist underTest = new Receptionist(false);

	@Test
	public void isOnThePhone() {
		boolean phoneTest = underTest.getOnThePhone();
		assertEquals(false, phoneTest);
	}

	

}
