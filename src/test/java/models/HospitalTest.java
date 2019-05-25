package models;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import medicalEmployees.Doctor;
import models.Hospital;

public class HospitalTest {

	Hospital payroll = new Hospital();
	Doctor john = new Doctor("Ent");

	@Test
	public void CanAddEmployeeToHospitalMap() {
		payroll.addHospitalEmployeeToMap(john);
		assertEquals(1, payroll.getEmployeesSize());
	}

	//@Test
	public void canPayEmployeeFromHospitalMap() {
		payroll.addHospitalEmployeeToMap(john);
		String johnEmpNum = payroll.getEmployeeNum();
		String payRate = payroll.payOneEmployee();
		System.out.println(payRate);
		assertEquals("90000", payRate);

	}
	@Test
	public void canGrabNameFromMap() {
		payroll.addHospitalEmployeeToMap(john);
		String name = payroll.getEmployeeFirstName("1").getFirstName();
		
	
	}
	
}
