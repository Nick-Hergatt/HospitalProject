import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {
	Nurse underTest = new Nurse(null, null, 0, 0);

	@Test
	public void NurseShouldExist() {
		String name = underTest.getFirstName("John");
		assertThat(name, is("John"));

	}

	@Test
	public void NurseShouldHavePayRate() {
		int payRate = underTest.getPayRate();
		assertEquals(50000, payRate);
	}

	@Test
	public void NurseShouldCareForPatient() {
		int care = underTest.careForPatient();
		assertEquals(0, care);
	}

	@Test
	public void NurseShouldHaveAPatient() {
		int numOfPatient = underTest.getPatients();
		assertThat(numOfPatient, is(5));
	}
	@Test
	public void NurseShouldDrawBlood() {
		int bloodDraw = underTest.getDrawBlood();
		assertEquals(0,bloodDraw);
		
		
	}
}
