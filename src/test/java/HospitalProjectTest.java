import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HospitalProjectTest {

	Patient underTest = new Patient("");

	@Before
	public void setup() {
		Patient underTest = new Patient("");
	}

	@Test
	public void patientClassShouldExsist() {
		String checkPatient = underTest.getPaitent();
		assertEquals(null, checkPatient);
	}

	@Test
	public void patientsShouldHaveAFirstName() {
		Patient underTest = new Patient("John");
		String checkFisrtName = underTest.getFirstName();
		assertEquals("John", checkFisrtName);
	}

	@Test
	public void paitentShouldHaveABloodLevelDefault20() {
		int checkBloodLevel = underTest.getBloodLevel();
		assertEquals(20, checkBloodLevel);
	}

	@Test
	public void paitentShouldHaveAHealthLevelDefault10() {
		int checkHealthLevel = underTest.getHealthLevel();
		assertEquals(10, checkHealthLevel);
	}

}
