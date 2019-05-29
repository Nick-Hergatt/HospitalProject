package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import patient.Patient;

public class PatientsRegisterTest {

	PatientsRegister underTest = new PatientsRegister();
	
	@Test
	public void shouldBeAbleToAddPatientsToRegister() {
		underTest.addPatientToReg(new Patient("Tim"));
		String expectedName = underTest.getPatientName("Tim");
		assertEquals("Tim", expectedName);	
	}
	@Test
	public void shouldBeAbleToRemovePatientsFromRegister() {
		underTest.addPatientToReg(new Patient("Tim"));
		underTest.removePatientFromReg("Tim");
		int expectedSize = underTest.getRegSize();
		assertEquals(0, expectedSize);	
	}
	
	
}
