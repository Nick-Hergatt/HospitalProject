package supportStaff;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmergencyResponderJennyTest {
	EmergencyResponderJenny underTest = new EmergencyResponderJenny(null, null, true, true, false);
	@Test
	public void JennyShouldBeOutOnRunByDefualt() {
		boolean isOnRun = underTest.getIsOutOnRun();
		assertEquals(false, isOnRun);
	}

	@Test
	public void JennyShouldNotBeOnPhone() {
		boolean isOnPhone = underTest.getIsOnThePhone();
		assertEquals(true, isOnPhone);
	}

	@Test
	public void JennyShouldNotBeOutOnRunJenny2ShouldBeOutOnRun() {
		EmergencyResponderJenny underTest1 = new EmergencyResponderJenny(null, null, false, false, false);
		EmergencyResponderJenny underTest2 = new EmergencyResponderJenny(null, null, false, true, true);
		boolean isOnRu1 = underTest1.getIsOutOnRun();
		boolean isOnRu2 = underTest2.getIsOutOnRun();
		assertEquals(false, isOnRu1);
		assertEquals(true, isOnRu2);
	}
	@Test
	public void JennyShouldBePaid() {
		EmergencyResponderJenny underTest = new EmergencyResponderJenny(null, null, true, true, false);
		boolean payTest = underTest.getHasBeenPayed();
		assertThat(payTest, is(true));
		
	}
}


