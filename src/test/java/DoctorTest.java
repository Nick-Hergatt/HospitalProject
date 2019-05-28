import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {
	Doctor underTest = new Doctor(null, 0, null, false, null);

	@Test
	public void doctorsShouldExist() {
		String name = underTest.getFirstName("John");
		assertThat(name, is("John"));

	}

	@Test
	public void doctorsShouldHavePayRate() {
		int payRate = underTest.getPayRate();
		assertEquals(90000, payRate);
	}

	@Test
	public void doctorShouldHaveSpecialty() {
		String speciality = underTest.getSpecialty("");
		assertEquals("", speciality);
	}

	@Test
	public void doctorJohnShouldBeAPediatrician() {
		String name = underTest.getFirstName("John");
		String specialty = underTest.getSpecialty("Pediatrician");
		assertThat(name, is("John"));
		assertThat(specialty, is("Pediatrician"));
	}
	@Test
	public void DoctorJohnShouldBePaid() {
		underTest.payEmployee();
		boolean payTest = underTest.getHasBeenPayed();
		assertThat(payTest, is(true));
		
	}

}
