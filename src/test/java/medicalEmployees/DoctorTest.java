package medicalEmployees;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import medicalEmployees.Doctor;

public class DoctorTest {
	Doctor underTest = new Doctor(null);
	@Test
	public void doctorsShouldExist() {
		String name = underTest.getFirstName();
		assertThat(name, is("John"));
		
	}
	@Test
	public void doctorsShouldHavePayRate() {
		String payRate = underTest.getPayRate();
		assertEquals("90000" ,payRate );
	}
	@Test
	public void doctorShouldCareForPatient() {
		int care = underTest.careForPatient();
		assertEquals(0, care);
	}
	@Test
	public void doctorShouldHaveSpecialty() {
		String speciality = underTest.getSpecialty("");
		assertEquals("", speciality);
	}
	@Test
	public void doctorJohnShouldBeAPediatrician() {
		String name = underTest.getFirstName();
		String specialty = underTest.getSpecialty("Pediatrician");
		assertThat(name, is("John"));
		assertThat(specialty, is("Pediatrician"));
	}
	
	@Test
	public void DoctorShouldDrawBlood() {
		int bloodDraw = underTest.getDrawBlood();
		assertEquals(0,bloodDraw);
}
}