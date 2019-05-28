package supportStaff;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {

	@Test
	public void JanitorShouldBeSweepingByDefualt () {
		Janitor underTest = new Janitor(null, 0, null, true, true);
		boolean isSweeping = underTest.getSweeping();
		assertEquals(true, isSweeping);
	}
	@Test
	public void JanitorGregShouldNotBeSweeping () {
		Janitor underTest = new Janitor(null, 0, null, false, false);
		boolean isSweeping = underTest.getSweeping();
		assertEquals(false, isSweeping);
	}
	@Test
	public void JanitorGregShouldNotBeSweepingTomShouldBeSweeping () {
		Janitor underTest1 = new Janitor(null, 0, null, true, true);
		Janitor underTest2 = new Janitor(null, 0, null, false, false);
		boolean isSweeping1 = underTest1.getSweeping();
		boolean isSweeping2 = underTest2.getSweeping();
		assertEquals(true, isSweeping1);
		assertEquals(false, isSweeping2);
	}
	@Test
	public void DoctorJohnShouldBePaid() {
		Janitor underTest = new Janitor(null, 0, null, true, true);
		boolean payTest = underTest.getHasBeenPayed();
		assertThat(payTest, is(true));
		
	}
	
}
