import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {
	Nurse underTest = new Nurse(null, 0, null, false, 0);

	@Test
	public void nursesShouldExist() {
		String name = underTest.getFirstName("John");
		assertThat(name, is("John"));

	}

	@Test
	public void nursesShouldHavePayRate() {
		int payRate = underTest.getPayRate();
		assertEquals(50000, payRate);
	}

	@Test
	public void nurseShouldHavePatients() {
		int numOfPatients = underTest.getPatients();
		assertEquals(0, numOfPatients);
	}


	@Test
	public void nurseJohnShouldBePaid() {
		underTest.payEmployee();
		boolean payTest = underTest.getHasBeenPayed();
		assertThat(payTest, is(true));
		
	}

}
