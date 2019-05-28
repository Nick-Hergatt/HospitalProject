import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {

	@Test
	public void JanitorShouldBeSweepingByDefualt () {
		Janitor underTest = new Janitor(null, null, 0, true);
		boolean isSweeping = underTest.getSweeping();
		assertEquals(true, isSweeping);
	}
	@Test
	public void JanitorGregShouldNotBeSweeping () {
		Janitor underTest = new Janitor("847","Greg", 0, false);
		boolean isSweeping = underTest.getSweeping();
		assertEquals(false, isSweeping);
	}
	@Test
	public void JanitorGregShouldNotBeSweepingTomShouldBeSweeping () {
		Janitor underTest1 = new Janitor("1","Tom", 0, true);
		Janitor underTest2 = new Janitor("2","Greg", 0, false);
		boolean isSweeping1 = underTest1.getSweeping();
		boolean isSweeping2 = underTest2.getSweeping();
		assertEquals(true, isSweeping1);
		assertEquals(false, isSweeping2);
	}
	
}
