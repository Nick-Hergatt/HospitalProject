


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HospitalProjectTest {

	@Test
	public void patientClassShouldExsist () {
		Patient underTest = new Patient("");
		String checkPatient = underTest.getPaitent();
		assertEquals(null, checkPatient);
	}
	@Test
	public void patientsShouldHaveAFirstName () {
		Patient underTest = new Patient("John");
		String checkFisrtName = underTest.getFirstName();
		assertEquals("John", checkFisrtName);
	}
	@Test
	public void paitentShouldHaveABloodLevelDefault20 () {
		Patient underTest = new Patient("");
		int checkBloodLevel = underTest.getBloodLevel();
		assertEquals(20, checkBloodLevel);
	}
	@Test
	public void paitentShouldHaveAHealthLevelDefault10 () {
		Patient underTest = new Patient("");
		int checkHealthLevel = underTest.getHealthLevel();
		assertEquals(10, checkHealthLevel);
	}
	
}
