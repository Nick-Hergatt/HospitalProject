package nonMedicalEmployees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JanitorTest {
	Janitor underTest1 = new Janitor(true);
	Janitor underTest2 = new Janitor(false);

	@Test
	public void isSweeping() {
		boolean sweepTest = underTest1.getSweeping();
		System.out.println(sweepTest);
		assertEquals(true, sweepTest);
	}
	@Test 
	public void isNotSweeping() {
		boolean sweepTest2 = underTest2.getSweeping();
		System.out.println(sweepTest2);
		assertEquals(false, sweepTest2);
	}

	

}
