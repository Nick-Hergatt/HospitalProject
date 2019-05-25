package patients;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import patients.Patient;

public class PatientTest {

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
	@Test
	public void paitentHealthLevelPlus1AfterCareFromNurse() {
		Patient underTest = new Patient("");
		underTest.caredForByNurse();
		int checkHealthLevelAfter = underTest.getHealthLevel();
		assertEquals(11, checkHealthLevelAfter);
	}
	@Test
	public void paitentHealthLevelPlus2AfterCareFromDoctor() {
		Patient underTest = new Patient("");
		underTest.caredForByDoctor();
		int checkHealthLevelAfter = underTest.getHealthLevel();
		assertEquals(12, checkHealthLevelAfter);
	}
	@Test
	public void paitentBloodLevelPlus1AfterCareFromNurse() {
		Patient underTest = new Patient("");
		underTest.bloodDrawByNurse();
		int checkHealthLevelAfter = underTest.getBloodLevel();
		assertEquals(19, checkHealthLevelAfter);
	}
	@Test
	public void paitentBloodLevelPlus2AfterCareFromDoctor() {
		Patient underTest = new Patient("");
		underTest.bloodDrawByDoctor();
		int checkHealthLevelAfter = underTest.getBloodLevel();
		assertEquals(18, checkHealthLevelAfter);
	}
	
}
