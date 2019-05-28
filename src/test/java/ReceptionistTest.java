import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void JanitorShouldBeSweepingByDefualt() {
		Receptionist underTest = new Receptionist(null, 0, null, true, true);
		boolean isSweeping = underTest.getIsOnThePhone();
		assertEquals(true, isSweeping);
	}

	@Test
	public void JanitorGregShouldNotBeSweeping() {
		Receptionist underTest = new Receptionist(null, 0, null, false, false);
		boolean isSweeping = underTest.getIsOnThePhone();
		assertEquals(false, isSweeping);
	}

	@Test
	public void JanitorGregShouldNotBeSweepingTomShouldBeSweeping() {
		Receptionist underTest1 = new Receptionist(null, 0, null, true, true);
		Receptionist underTest2 = new Receptionist(null, 0, null, false, false);
		boolean isSweeping1 = underTest1.getIsOnThePhone();
		boolean isSweeping2 = underTest2.getIsOnThePhone();
		assertEquals(true, isSweeping1);
		assertEquals(false, isSweeping2);
	}
	@Test
	public void DoctorJohnShouldBePaid() {
		Receptionist underTest = new Receptionist(null, 0, null, true, true);
		boolean payTest = underTest.getHasBeenPayed();
		assertThat(payTest, is(true));
		
	}
}
