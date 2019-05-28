


import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
	public void patientBloodLevelSHouldchangeBy2whenDrawnByDoctor() {
		Patient underTest = new Patient("");
		int preDrawBlood = underTest.getBloodLevel();
		underTest.DcDrawBlood();
		int checkBloodLevel = underTest.getBloodLevel();
		//System.out.println(preDrawBlood);
		assertEquals(18, checkBloodLevel);
	}
	@Test
	public void patientBloodLevelSHouldchangeBy2WhenDrawnByNurse() {
		Patient underTest = new Patient("");
		int preDrawBlood = underTest.getBloodLevel();
		underTest.RnDrawBlood();
		int checkBloodLevel = underTest.getBloodLevel();
		//System.out.println(preDrawBlood);
		assertEquals(19, checkBloodLevel);
	}
	@Test
	public void patientHealthLevelShouldIncreaseBy2WhenDoneByDoctor() {
		Patient underTest = new Patient("");
		underTest.DcCare();
		int checkHealthLevel = underTest.getHealthLevel();
		assertEquals(12, checkHealthLevel);	
	}
	@Test
	public void patientHealthLevelShouldIncreaseBy2WhenDoneByNurse() {
		Patient underTest = new Patient("");
		underTest.RnCare();
		int checkHealthLevel = underTest.getHealthLevel();
		assertEquals(11, checkHealthLevel);	
	}
	
}
