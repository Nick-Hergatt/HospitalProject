package medicalEmployee;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {
	Doctor underTest = new Doctor(null, 0, null, false, null);

	@Test
	public void doctorsShouldExist() {
		Doctor underTest = new Doctor("John", 0, null, false, null);
		String name = underTest.getFirstName();
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
		Doctor underTest = new Doctor("John", 0, null, false, null);
		String name = underTest.getFirstName();
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
	@Test
	public void DoctorJohnPaidStatusShouldChangeAfterPayOutMethod(){
		Doctor underTest = new Doctor("John", 0, null, false, null);
		boolean payTest = underTest.getHasBeenPayed();
		underTest.payOutSalary();
		boolean payTest1 = underTest.getHasBeenPayed();
		assertThat(payTest, is(false));
		assertThat(payTest1,is(true));
		
	}
	@Test
	public void DoctorTimPaidStatusShouldReturnAlreadyPaidMessage(){
		Doctor underTest = new Doctor("John", 0, null, true, null);
		boolean payTest = underTest.getHasBeenPayed();
		underTest.payOutSalary();
		assertThat(payTest,is(true));
		
	}
	
	
	
	
}
