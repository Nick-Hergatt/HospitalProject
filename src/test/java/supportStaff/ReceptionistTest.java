package supportStaff;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReceptionistTest {

	@Test
	public void ReceptionistShouldBeBeOnPhoneByDefualt() {
		Receptionist underTest = new Receptionist(null, null, true, true);
		boolean isOnPhone = underTest.getIsOnThePhone();
		assertEquals(true, isOnPhone);
	}

	@Test
	public void ReceptionistShouldNotBeOnPhone() {
		Receptionist underTest = new Receptionist(null, null, false, false);
		boolean isOnPhone = underTest.getIsOnThePhone();
		assertEquals(false, isOnPhone);
	}

	@Test
	public void ReceptionistGregShouldNotBeOnPhoneTomShouldBeOnPhone() {
		Receptionist underTest1 = new Receptionist(null, null, true, true);
		Receptionist underTest2 = new Receptionist(null, null, false, false);
		boolean isOnPhone1 = underTest1.getIsOnThePhone();
		boolean isOnPhone2 = underTest2.getIsOnThePhone();
		assertEquals(true, isOnPhone1);
		assertEquals(false, isOnPhone2);
	}
	@Test
	public void ReceptionistShouldBePaid() {
		Receptionist underTest = new Receptionist(null, null, true, true);
		boolean payTest = underTest.getHasBeenPayed();
		assertThat(payTest, is(true));
		
	}
}
